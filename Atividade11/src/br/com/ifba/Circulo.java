/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba;

/**
 *
 * @author luiza
 * Classe que representa um círculo, forma bidimensional.
 */

public class Circulo extends Formas2D {
    private double raio;
    
    /**
     * Construtor padrão.
     */
    public Circulo() {}
    
    /**
     * Construtor com parâmetro.
     * @param raio Medida do raio do círculo.
     */
    public Circulo(double raio) {
        this.raio = raio;
    }
    
    /**
     * Define o raio do círculo.
     * @param raio Medida do raio.
     */
    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    /**
     * Retorna o raio do círculo.
     * @return Medida do raio.
     */
    public double getRaio() {
        return raio;
    }
    
    /**
     * Calcula a área do círculo.
     * @return Área do círculo (π * raio²).
     */
    @Override
    public double obterArea() {
        return Math.PI * raio * raio;
    }
    
    /**
     * Retorna descrição textual do círculo.
     * @return String com descrição.
     */
    @Override
    public String toString() {
        return String.format("Círculo: Raio = %.2f", raio);
    }
}
