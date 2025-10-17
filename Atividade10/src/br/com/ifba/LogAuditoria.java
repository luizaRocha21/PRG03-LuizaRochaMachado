/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Classe que representa um log de auditoria do sistema
 * @author luiza
 */
public class LogAuditoria {
    private Long id;
    private Usuario usuario;
    private String acao;
    private LocalDateTime dataHora;
    private String ip;
    
    private static Long contadorId = 1L;

    // Construtor padrão
    public LogAuditoria() {
        this.id = contadorId++;
        this.dataHora = LocalDateTime.now();
    }

    // Construtor com parâmetros
    public LogAuditoria(Usuario usuario, String acao, String ip) {
        this();
        this.usuario = usuario;
        this.acao = acao;
        this.ip = ip;
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

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        return "LogAuditoria{" + "id=" + id + ", usuario=" + (usuario != null ? usuario.getNomeUsuario() : "null") + 
               ", acao=" + acao + ", dataHora=" + dataHora + ", ip=" + ip + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final LogAuditoria other = (LogAuditoria) obj;
        return Objects.equals(this.id, other.id);
    }
}
