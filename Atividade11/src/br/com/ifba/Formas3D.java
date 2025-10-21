/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba;

/**
 * Classe abstrata que representa formas tridimensionais.
 * Herda de Forma e define contratos para cálculo de área e volume.
 * @author luiza
 */
public abstract class Formas3D extends Forma {
    
    /**
     * Calcula e retorna a área da superfície da forma tridimensional.
     * @return double representando a área superficial.
     */
    public abstract double obterArea();
    
    /**
     * Calcula e retorna o volume da forma tridimensional.
     * @return double representando o volume.
     */
    public abstract double obterVolume();
    
    /**
     * Retorna o tipo da forma.
     * @return "Forma Tridimensional"
     */
    @Override
    public String getTipo() {
        return "Forma Tridimensional";
    }
}
