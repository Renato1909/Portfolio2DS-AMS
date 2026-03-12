/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tempo;
import javax.swing.JOptionPane;
/**
 *
 * @author Renato Aparecido da Silva - 2° DS/AMS
 */
public class Tempo {
    
    // Atributo
    int minutos;

    // Método de conversão
    public void converterParaHoras() {
        double horas = minutos / 60.0; // Usamos 60.0 para garantir que o resultado tenha casas decimais 
        JOptionPane.showMessageDialog(null, minutos + " minutos equivalem a " + horas + " horas.");
    }

    public static void main(String[] args) {
        
        Tempo t = new Tempo();
        
        // Entrada de dados
        String input = JOptionPane.showInputDialog("Digite a quantidade de minutos:");
        t.minutos = Integer.parseInt(input);
        
        t.converterParaHoras();
    }
}
