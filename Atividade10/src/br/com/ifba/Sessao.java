/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Classe que representa uma sessão de usuário no sistema
 * @author luiza
 */
public class Sessao {
    private Long id;
    private Usuario usuario;
    private String token;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataExpiracao;
    
    private static Long contadorId = 1L;

    // Construtor padrão
    public Sessao() {
        this.id = contadorId++;
        this.dataCriacao = LocalDateTime.now();
        this.dataExpiracao = this.dataCriacao.plusHours(24); // Expira em 24 horas
    }

    // Construtor com parâmetros
    public Sessao(Usuario usuario, String token) {
        this();
        this.usuario = usuario;
        this.token = token;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDateTime getDataExpiracao() {
        return dataExpiracao;
    }

    public void setDataExpiracao(LocalDateTime dataExpiracao) {
        this.dataExpiracao = dataExpiracao;
    }
    
    // Método para verificar se a sessão está expirada
    public boolean isExpirada() {
        return LocalDateTime.now().isAfter(dataExpiracao);
    }
    
    // Método para renovar sessão
    public void renovar() {
        this.dataExpiracao = LocalDateTime.now().plusHours(24);
    }

    @Override
    public String toString() {
        return "Sessao{" + "id=" + id + ", usuario=" + (usuario != null ? usuario.getNomeUsuario() : "null") + 
               ", token=" + token + ", dataCriacao=" + dataCriacao + ", dataExpiracao=" + dataExpiracao + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.id);
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
        final Sessao other = (Sessao) obj;
        return Objects.equals(this.id, other.id);
    }
}
