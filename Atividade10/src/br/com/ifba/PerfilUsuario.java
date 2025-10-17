/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Classe que representa um perfil de usuário com permissões específicas
 * @author luiza
 */
public class PerfilUsuario {
    private Long id;
    private String descricao;
    private List<String> permissoes;
    
    private static Long contadorId = 1L;

    // Construtor padrão
    public PerfilUsuario() {
        this.id = contadorId++;
        this.permissoes = new ArrayList<>();
    }

    // Construtor com parâmetros
    public PerfilUsuario(String descricao, List<String> permissoes) {
        this();
        this.descricao = descricao;
        this.permissoes = permissoes != null ? permissoes : new ArrayList<>();
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<String> getPermissoes() {
        return permissoes;
    }

    public void setPermissoes(List<String> permissoes) {
        this.permissoes = permissoes != null ? permissoes : new ArrayList<>();
    }
    
    // Método para adicionar permissão
    public void adicionarPermissao(String permissao) {
        if (permissao != null && !permissao.trim().isEmpty() && !permissoes.contains(permissao)) {
            permissoes.add(permissao);
        }
    }
    
    // Método para remover permissão
    public void removerPermissao(String permissao) {
        permissoes.remove(permissao);
    }
    
    // Método para verificar se tem permissão
    public boolean temPermissao(String permissao) {
        return permissoes.contains(permissao);
    }

    @Override
    public String toString() {
        return "PerfilUsuario{" + "id=" + id + ", descricao=" + descricao + 
               ", permissoes=" + permissoes + '}';
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
        final PerfilUsuario other = (PerfilUsuario) obj;
        return Objects.equals(this.id, other.id);
    }
}