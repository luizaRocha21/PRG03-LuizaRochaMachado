/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba;

/**
 *
 * @author luiza
 * Classe que representa uma pirâmide de base quadrada, forma tridimensional.
 */

public class Piramide extends Formas3D {
    private double base;
    private double altura;
    
    /**
     * Construtor padrão.
     */
    public Piramide() {}
    
    /**
     * Construtor com parâmetros.
     * @param base Medida da base da pirâmide.
     * @param altura Medida da altura da pirâmide.
     */
    public Piramide(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    /**
     * Define a base da pirâmide.
     * @param base Medida da base.
     */
    public void setBase(double base) {
        this.base = base;
    }
    
    /**
     * Define a altura da pirâmide.
     * @param altura Medida da altura.
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    /**
     * Retorna a base da pirâmide.
     * @return Medida da base.
     */
    public double getBase() {
        return base;
    }
    
    /**
     * Retorna a altura da pirâmide.
     * @return Medida da altura.
     */
    public double getAltura() {
        return altura;
    }
    
    /**
     * Calcula a área superficial da pirâmide.
     * @return Área superficial (área da base + área lateral).
     */
    @Override
    public double obterArea() {
        double areaBase = base * base;
        double apotema = Math.sqrt(Math.pow(altura, 2) + Math.pow(base / 2, 2));
        double areaLateral = 2 * base * apotema;
        return areaBase + areaLateral;
    }
    
    /**
     * Calcula o volume da pirâmide.
     * @return Volume da pirâmide (área da base * altura / 3).
     */
    @Override
    public double obterVolume() {
        double areaBase = base * base;
        return (areaBase * altura) / 3;
    }
    
    /**
     * Retorna descrição textual da pirâmide.
     * @return String com descrição.
     */
    @Override
    public String toString() {
        return String.format("Pirâmide: Base = %.2f, Altura = %.2f", base, altura);
    }
}
