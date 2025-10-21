/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba;

/**
 *
 * @author luiza
 * Classe que representa um quadrado, forma bidimensional.
 */
public class Quadrado extends Formas2D {
    private double lado;
    
    /**
     * Construtor padrão.
     */
    public Quadrado() {}
    
    /**
     * Construtor com parâmetro.
     * @param lado Medida do lado do quadrado.
     */
    public Quadrado(double lado) {
        this.lado = lado;
    }
    
    /**
     * Define o lado do quadrado.
     * @param lado Medida do lado.
     */
    public void setLado(double lado) {
        this.lado = lado;
    }
    
    /**
     * Retorna o lado do quadrado.
     * @return Medida do lado.
     */
    public double getLado() {
        return lado;
    }
    
    /**
     * Calcula a área do quadrado.
     * @return Área do quadrado (lado²).
     */
    @Override
    public double obterArea() {
        return lado * lado;
    }
    
    /**
     * Retorna descrição textual do quadrado.
     * @return String com descrição.
     */
    @Override
    public String toString() {
        return String.format("Quadrado: Lado = %.2f", lado);
    }
}
