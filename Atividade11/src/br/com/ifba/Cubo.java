/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba;

/**
 *
 * @author luiza
 * Classe que representa um cubo, forma tridimensional.
 */

public class Cubo extends Formas3D {
    private double aresta;
    
    /**
     * Construtor padrão.
     */
    public Cubo() {}
    
    /**
     * Construtor com parâmetro.
     * @param aresta Medida da aresta do cubo.
     */
    public Cubo(double aresta) {
        this.aresta = aresta;
    }
    
    /**
     * Define a aresta do cubo.
     * @param aresta Medida da aresta.
     */
    public void setAresta(double aresta) {
        this.aresta = aresta;
    }
    
    /**
     * Retorna a aresta do cubo.
     * @return Medida da aresta.
     */
    public double getAresta() {
        return aresta;
    }
    
    /**
     * Calcula a área superficial do cubo.
     * @return Área superficial (6 * aresta²).
     */
    @Override
    public double obterArea() {
        return 6 * aresta * aresta;
    }
    
    /**
     * Calcula o volume do cubo.
     * @return Volume do cubo (aresta³).
     */
    @Override
    public double obterVolume() {
        return aresta * aresta * aresta;
    }
    
    /**
     * Retorna descrição textual do cubo.
     * @return String com descrição.
     */
    @Override
    public String toString() {
        return String.format("Cubo: Aresta = %.2f", aresta);
    }
}