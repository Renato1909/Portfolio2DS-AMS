/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoramedia;
import javax.swing.JOptionPane;
/**
 *
 * @author Renato Aparecido da Silva - 2° DS/AMS
 */
public class CalculadoraMedia {
    
    // Atributos
    double num1, num2, num3;

    // Método para calcular a média.
    public void calcularMedia() {
        double media = (num1 + num2 + num3) / 3; // Fórmula 
        JOptionPane.showMessageDialog(null, "A média dos números é: " + media);
    }

    public static void main(String[] args) {
        
        CalculadoraMedia calc = new CalculadoraMedia();
        
        // Entrada de dados com conversão imediata
        calc.num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1º número:"));
        calc.num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 2º número:"));
        calc.num3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 3º número:"));
        
        calc.calcularMedia();
    }
}
