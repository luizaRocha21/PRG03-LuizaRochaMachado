/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba;

/**
 *
 * @author luiza
 * Classe que representa uma esfera, forma tridimensional.
 */

public class Esfera extends Formas3D {
    private double raio;
    
    /**
     * Construtor padrão.
     */
    public Esfera() {}
    
    /**
     * Construtor com parâmetro.
     * @param raio Medida do raio da esfera.
     */
    public Esfera(double raio) {
        this.raio = raio;
    }
    
    /**
     * Define o raio da esfera.
     * @param raio Medida do raio.
     */
    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    /**
     * Retorna o raio da esfera.
     * @return Medida do raio.
     */
    public double getRaio() {
        return raio;
    }
    
    /**
     * Calcula a área superficial da esfera.
     * @return Área superficial (4 * π * raio²).
     */
    @Override
    public double obterArea() {
        return 4 * Math.PI * raio * raio;
    }
    
    /**
     * Calcula o volume da esfera.
     * @return Volume da esfera (4/3 * π * raio³).
     */
    @Override
    public double obterVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
    }
    
    /**
     * Retorna descrição textual da esfera.
     * @return String com descrição.
     */
    @Override
    public String toString() {
        return String.format("Esfera: Raio = %.2f", raio);
    }
}
