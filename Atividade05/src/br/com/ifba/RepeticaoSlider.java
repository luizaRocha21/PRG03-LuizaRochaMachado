/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.com.ifba;

/**
 *
 * @author luiza
 */
public class RepeticaoSlider {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Inicia a interface gráfica
        java.awt.EventQueue.invokeLater(() -> {
            new RepeticaoSliderView().setVisible(true);
        });
    }
    
}
