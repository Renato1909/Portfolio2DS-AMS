/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemploum; // Define o pacote onde a classe está localizada.
import javax.swing.JOptionPane; // Importa a classe JOptionPane para usar janelas de diálogo.


/**
 *
 * @author renat
 */
public class ExemploUm { // Declaração da classe principal.

    public static void main(String[] args) { // Método principal (main) - ponto de início da execução do programa.
       int a; // Declara uma variável do tipo inteiro para armazenar o número digitado.
        
        a = Integer.parseInt( // JOptionPane.showInputDialog() exibe uma caixa de entrada, onde o valor digitado é retornado como String (texto) e o Integer.parseInt() converte essa String para inteiro.
                JOptionPane.showInputDialog("Digite um número:")
        );
        
        dobro(a); // Chama o método dobro(), passando o valor digitado como argumento.
    }

    static void dobro(int n) { // Método estático que recebe um número inteiro como parâmetro e o "void" significa que o método não retorna nenhum valor.
        int d = n * 2; // Calcula o dobro do número recebido (multiplica por 2).
        JOptionPane.showMessageDialog(null, "Dobro de " + n + " é " + d); // Exibe uma mensagem na tela mostrando primeiro o número digitado e depois o resultado do dobro.
    }
}
