/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.produto;
import javax.swing.JOptionPane;
/**
 *
 * @author Renato Aparecido da Silva - 2° DS/AMS
 */
public class Produto {
    
    // Atributos
    String nome;
    double preco;

    // Método para calcular e mostrar o desconto
    public void calcularDesconto() {
        double desconto = preco * 0.15; // 15% de desconto
        double precoFinal = preco - desconto;
        
        JOptionPane.showMessageDialog(null, "Produto: " + nome + 
                "\nPreço original: R$ " + preco + 
                "\nPreço com 15% de desconto: R$ " + precoFinal);
    }

    public static void main(String[] args) {
        
        Produto p = new Produto();
        
        // Entrada de dados
        p.nome = JOptionPane.showInputDialog("Digite o nome do produto:");
        String leituraPreco = JOptionPane.showInputDialog("Digite o preço do produto:");
        p.preco = Double.parseDouble(leituraPreco); // Converte texto para número
        
        // Executa o cálculo e mostra o resultado
        p.calcularDesconto();
    }
}
