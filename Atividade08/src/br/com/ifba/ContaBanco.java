/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba;

/**
 *
 * @author luiza
 */
import java.util.Random;

public class ContaBanco {
    // Atributos privados
    private String numeroConta;
    private String tipo; // "cc" ou "cp"
    private String dono;
    private String cpfCnpj;
    private String telefone;
    private float saldo;
    private boolean status;
    
    // Construtor
    public ContaBanco() {
        this.saldo = 0;
        this.status = false; // Conta inicia fechada
        this.numeroConta = gerarNumeroConta(); // Número gerado automaticamente
    }
    
    // Gera número de conta automático (6 dígitos)
    private String gerarNumeroConta() {
        Random random = new Random();
        int numero = random.nextInt(900000) + 100000; // Gera número entre 100000 e 999999
        return String.valueOf(numero);
    }
    
    // Métodos Getters e Setters
    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        // Valida se o tipo é cc ou cp
        if (tipo.equals("cc") || tipo.equals("cp")) {
            this.tipo = tipo;
        } else {
            throw new IllegalArgumentException("Tipo de conta inválido! Use 'cc' ou 'cp'.");
        }
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    // Métodos da conta
    public void abrirConta(String tipo, String dono, String cpfCnpj, String telefone) {
        if (this.status) {
            throw new IllegalStateException("Conta já está aberta!");
        }
        
        setTipo(tipo);
        setDono(dono);
        setCpfCnpj(cpfCnpj);
        setTelefone(telefone);
        this.status = true;
        
        // Adiciona bônus conforme o tipo de conta
        if (tipo.equals("cc")) {
            this.saldo = 50; // Presente para conta corrente
        } else if (tipo.equals("cp")) {
            this.saldo = 150; // Presente para conta poupança
        }
    }
    
    public void fecharConta() {
        if (!this.status) {
            throw new IllegalStateException("Conta já está fechada!");
        }
        
        if (this.saldo > 0) {
            throw new IllegalStateException("Não é possível fechar conta com saldo positivo!");
        }
        
        if (this.saldo < 0) {
            throw new IllegalStateException("Não é possível fechar conta em débito!");
        }
        
        this.status = false;
        this.tipo = null;
    }
    
    public void depositar(float valor) {
        if (!this.status) {
            throw new IllegalStateException("Conta fechada! Não é possível depositar.");
        }
        
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de depósito deve ser positivo!");
        }
        
        this.saldo += valor;
    }
    
    public void sacar(float valor) {
        if (!this.status) {
            throw new IllegalStateException("Conta fechada! Não é possível sacar.");
        }
        
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de saque deve ser positivo!");
        }
        
        if (valor > this.saldo) {
            throw new IllegalArgumentException("Saldo insuficiente para saque!");
        }
        
        this.saldo -= valor;
    }
    
    public void pagarMensalidade() {
        if (!this.status) {
            throw new IllegalStateException("Conta fechada! Não é possível pagar mensalidade.");
        }
        
        float mensalidade;
        if (this.tipo.equals("cc")) {
            mensalidade = 12;
        } else {
            mensalidade = 20;
        }
        
        if (this.saldo < mensalidade) {
            throw new IllegalStateException("Saldo insuficiente para pagar mensalidade!");
        }
        
        this.saldo -= mensalidade;
    }
    
    // Método para verificar credenciais de login
    public boolean verificarCredenciais(String numeroConta, String cpfCnpj) {
        return this.numeroConta.equals(numeroConta) && 
               this.cpfCnpj.equals(cpfCnpj) && 
               this.status;
    }
    
    // Método para exibir informações da conta
    public String exibirInfo() {
        return String.format(
            "Número da Conta: %s\nDono: %s\nCPF/CNPJ: %s\nTelefone: %s\nTipo: %s\nSaldo: R$ %.2f\nStatus: %s",
            numeroConta, dono, cpfCnpj, telefone, tipo, saldo, status ? "Aberta" : "Fechada"
        );
    }
    
    @Override
    public String toString() {
        return exibirInfo();
    }
}