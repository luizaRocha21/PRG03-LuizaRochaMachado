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

public class PagamentoPix implements Pagamento {
    @Override
    public double calcularTotal(double valor) {
        return valor * 0.98; // 2% de cashback (equivale a 2% de desconto)
    }
    
    @Override
    public String imprimirRecibo(double valor) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        double total = calcularTotal(valor);
        double cashback = valor - total;
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataHora = LocalDateTime.now().format(formatter);
        
        return "=== RECIBO - PAGAMENTO PIX ===\n" +
               "Data/Hora: " + dataHora + "\n" +
               "Valor original: R$ " + df.format(valor) + "\n" +
               "Cashback (2%): R$ " + df.format(cashback) + "\n" +
               "Valor final: R$ " + df.format(total) + "\n" +
               "=============================";
    }
}