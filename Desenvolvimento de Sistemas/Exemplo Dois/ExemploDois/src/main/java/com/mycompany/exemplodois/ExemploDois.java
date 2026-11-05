/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplodois; // Define o pacote ao qual a classe pertence.

import javax.swing.JOptionPane; // Importa a biblioteca para usar janelas de diálogo.

/**
 *
 * @author Renato Aparecido da Silva - 1° MTec DS/AMS
 */
public class ExemploDois { // Declaração da classe principal.

    public static void main(String[] args) { // Método principal - ponto de início do programa.
        int t; // Variável inteira que armazenará o tamanho da palavra.
        String p; // Variável do tipo String que armazenará a palavra digitada.

        p = JOptionPane.showInputDialog("Digite uma palavra:"); // Exibe uma janela pedindo para o usuário digitar uma palavra.
        t = tamanho(p); // Chama o método tamanho() passando a palavra digitada e armazena o valor retornado na variável t.

        JOptionPane.showMessageDialog(null, p + " possui " + t + " caracteres"); // Exibe uma mensagem mostrando a palavra digitada e a quantidade de caracteres que ela possui,
    }

    static int tamanho(String x)  { // Método estático que recebe uma String como parâmetro e retorna a quantidade de caracteres dessa String.
        return x.length(); // Retorna o tamanho da String usando o método length().
    }
}