/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba;

/**
 * Classe abstrata que representa formas bidimensionais.
 * Herda de Forma e define contrato para cálculo de área.
 * @author luiza
 */
public abstract class Formas2D extends Forma {
    
    /**
     * Calcula e retorna a área da forma bidimensional.
     * @return double representando a área.
     */
    public abstract double obterArea();
    
    /**
     * Retorna o tipo da forma.
     * @return "Forma Bidimensional"
     */
    @Override
    public String getTipo() {
        return "Forma Bidimensional";
    }
}