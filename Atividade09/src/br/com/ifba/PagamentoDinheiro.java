/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author luiza
 */

public class PagamentoDinheiro implements Pagamento {
    @Override
    public double calcularTotal(double valor) {
        return valor * 0.90; // 10% de desconto
    }
    
    @Override
    public String imprimirRecibo(double valor) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        double total = calcularTotal(valor);
        double desconto = valor - total;
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataHora = LocalDateTime.now().format(formatter);
        
        return "=== RECIBO - PAGAMENTO EM DINHEIRO ===\n" +
               "Data/Hora: " + dataHora + "\n" +
               "Valor original: R$ " + df.format(valor) + "\n" +
               "Desconto (10%): R$ " + df.format(desconto) + "\n" +
               "Valor final: R$ " + df.format(total) + "\n" +
               "=====================================";
    }
}