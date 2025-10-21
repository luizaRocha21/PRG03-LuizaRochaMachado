/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.com.ifba;

/**
 * Classe abstrata que representa uma forma geométrica.
 * Define o contrato básico para todas as formas.
 */
public abstract class Forma {
    
    /**
     * Retorna uma descrição textual da forma.
     * @return String com descrição da forma.
     */
    @Override
    public abstract String toString();
    
    /**
     * Retorna o tipo da forma (2D ou 3D).
     * @return String com o tipo da forma.
     */
    public abstract String getTipo();
}