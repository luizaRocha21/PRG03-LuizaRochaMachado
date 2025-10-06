/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.com.ifba;

/**
 * Classe para cálculo de fatorial
 * @author luiza
 */
public class Fatorial {
    private int valor;
    
    /**
     * Define o valor para cálculo do fatorial
     * @param n Valor inteiro para cálculo
     */
    public void setValor(int n) {
        this.valor = n;
    }
    
    /**
     * Calcula e retorna o fatorial do valor definido
     * @return Resultado do cálculo fatorial
     */
    public int getFatorial() {
        if (valor < 0) {
            return 0; // Fatorial de número negativo não é definido
        }
        
        int resultado = 1;
        for (int i = 2; i <= valor; i++) {
            resultado *= i;
        }
        return resultado;
    }
    
    /**
     * Retorna a fórmula do cálculo fatorial em formato de string
     * @return String com a fórmula do fatorial (ex: "5 x 4 x 3 x 2 x 1")
     */
    public String getFormula() {
        if (valor <= 0) {
            return "0"; // Caso especial para valores não positivos
        }
        
        StringBuilder formula = new StringBuilder();
        for (int i = valor; i >= 1; i--) {
            formula.append(i);
            if (i > 1) {
                formula.append(" x ");
            }
        }
        return formula.toString();
    }
}