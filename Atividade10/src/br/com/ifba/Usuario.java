/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package br.com.ifba;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/**
 * Classe que representa um usuário do sistema
 * @author luiza
 */
public class Usuario {
    private Long id;
    private PerfilUsuario perfil;
    private String nomeUsuario;
    private String email;
    private String senha;
    private LocalDateTime ultimoLogin;
    private Boolean ativo;
    
    private static Long contadorId = 1L;
    
    // Listas para relacionamentos
    private List<LogAuditoria> logsAuditoria;
    private List<Sessao> sessoes;

    // Construtor padrão
    public Usuario() {
        this.id = contadorId++;
        this.logsAuditoria = new ArrayList<>();
        this.sessoes = new ArrayList<>();
        this.ativo = true;
    }

    // Construtor com parâmetros básicos
    public Usuario(PerfilUsuario perfil, String nomeUsuario, String email, String senha) {
        this();
        this.perfil = perfil;
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.senha = senha;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PerfilUsuario getPerfil() {
        return perfil;
    }

    public void setPerfil(PerfilUsuario perfil) {
        this.perfil = perfil;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDateTime getUltimoLogin() {
        return ultimoLogin;
    }

    public void setUltimoLogin(LocalDateTime ultimoLogin) {
        this.ultimoLogin = ultimoLogin;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public List<LogAuditoria> getLogsAuditoria() {
        return logsAuditoria;
    }

    public void setLogsAuditoria(List<LogAuditoria> logsAuditoria) {
        this.logsAuditoria = logsAuditoria;
    }

    public List<Sessao> getSessoes() {
        return sessoes;
    }

    public void setSessoes(List<Sessao> sessoes) {
        this.sessoes = sessoes;
    }
    
    // Método para realizar login
    public boolean logar(String senha) {
        try {
            if (!this.ativo) {
                criarLogAuditoria("Tentativa de login - usuário inativo", "127.0.0.1");
                return false;
            }
            
            if (this.senha.equals(senha)) {
                this.ultimoLogin = LocalDateTime.now();
                criarLogAuditoria("Login realizado com sucesso", "127.0.0.1");
                return true;
            } else {
                criarLogAuditoria("Tentativa de login - senha incorreta", "127.0.0.1");
                return false;
            }
        } catch (Exception e) {
            criarLogAuditoria("Erro durante tentativa de login: " + e.getMessage(), "127.0.0.1");
            return false;
        }
    }
    
    // Método para criar uma nova sessão
    public Sessao criarSessao() {
        try {
            if (!this.ativo) {
                throw new IllegalStateException("Usuário inativo não pode criar sessão");
            }
            
            String token = UUID.randomUUID().toString();
            Sessao novaSessao = new Sessao(this, token);
            this.sessoes.add(novaSessao);
            criarLogAuditoria("Nova sessão criada", "127.0.0.1");
            return novaSessao;
        } catch (Exception e) {
            criarLogAuditoria("Erro ao criar sessão: " + e.getMessage(), "127.0.0.1");
            return null;
        }
    }
    
    // Método para criar log de auditoria
    private void criarLogAuditoria(String acao, String ip) {
        LogAuditoria log = new LogAuditoria(this, acao, ip);
        this.logsAuditoria.add(log);
    }
    
    // Método para adicionar log
    public void adicionarLog(LogAuditoria log) {
        if (log != null) {
            this.logsAuditoria.add(log);
        }
    }
    
    // Método para adicionar sessão
    public void adicionarSessao(Sessao sessao) {
        if (sessao != null) {
            this.sessoes.add(sessao);
        }
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", perfil=" + (perfil != null ? perfil.getDescricao() : "null") + 
               ", nomeUsuario=" + nomeUsuario + ", email=" + email + ", ultimoLogin=" + ultimoLogin + 
               ", ativo=" + ativo + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        return Objects.equals(this.id, other.id);
    }
}
