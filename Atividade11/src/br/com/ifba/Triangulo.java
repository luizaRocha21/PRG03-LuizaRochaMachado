/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba;

/**
 *
 * @author luiza
 * Classe que representa um triângulo, forma bidimensional.
 */

public class Triangulo extends Formas2D {
    private double base;
    private double altura;
    
    /**
     * Construtor padrão.
     */
    public Triangulo() {}
    
    /**
     * Construtor com parâmetros.
     * @param base Medida da base do triângulo.
     * @param altura Medida da altura do triângulo.
     */
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    /**
     * Define a base do triângulo.
     * @param base Medida da base.
     */
    public void setBase(double base) {
        this.base = base;
    }
    
    /**
     * Define a altura do triângulo.
     * @param altura Medida da altura.
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    /**
     * Retorna a base do triângulo.
     * @return Medida da base.
     */
    public double getBase() {
        return base;
    }
    
    /**
     * Retorna a altura do triângulo.
     * @return Medida da altura.
     */
    public double getAltura() {
        return altura;
    }
    
    /**
     * Calcula a área do triângulo.
     * @return Área do triângulo (base * altura / 2).
     */
    @Override
    public double obterArea() {
        return (base * altura) / 2;
    }
    
    /**
     * Retorna descrição textual do triângulo.
     * @return String com descrição.
     */
    @Override
    public String toString() {
        return String.format("Triângulo: Base = %.2f, Altura = %.2f", base, altura);
    }
}
