/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoracompleta;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author renat
 */
public class CalculadoraCompleta extends JFrame {

    // Componentes de interface (variáveis globais)
    JLabel rotulo1, rotulo2, exibir;
    JTextField texto1, texto2;
    JButton somar, subtrair, multiplicar, dividir, raiz, limpar;

    public CalculadoraCompleta() {
        // Título e definições da janela (Baseado nos slides)
        super("Calculadora - Exercício de Fixação");
        Container tela = getContentPane();
        tela.setLayout(null); // Layout manual como nos slides
        tela.setBackground(new Color(220, 220, 220)); // Cor de fundo personalizada

        // Rótulos (Labels)
        rotulo1 = new JLabel("1º Número:");
        rotulo2 = new JLabel("2º Número:");
        exibir = new JLabel("Resultado: ");

        // Caixas de Texto (TextFields)
        texto1 = new JTextField(10);
        texto2 = new JTextField(10);

        // Botões (Buttons)
        somar = new JButton("+ Somar");
        subtrair = new JButton("- Subtrair");
        multiplicar = new JButton("* Multiplicar");
        dividir = new JButton("/ Dividir");
        raiz = new JButton("√ Raiz Quadrada (do 1º)");
        limpar = new JButton("Limpar");

        // Posicionamento (setBounds) - Alinhado conforme exemplos dos slides
        rotulo1.setBounds(50, 20, 100, 20);
        texto1.setBounds(150, 20, 100, 20);
        
        rotulo2.setBounds(50, 50, 100, 20);
        texto2.setBounds(150, 50, 100, 20);

        somar.setBounds(50, 90, 120, 30);
        subtrair.setBounds(180, 90, 120, 30);
        multiplicar.setBounds(50, 130, 120, 30);
        dividir.setBounds(180, 130, 120, 30);
        
        raiz.setBounds(50, 170, 250, 30);
        limpar.setBounds(50, 210, 250, 30);

        exibir.setBounds(50, 260, 300, 20);
        exibir.setFont(new Font("Arial", Font.BOLD, 14));
        exibir.setForeground(new Color(0, 102, 0)); // Cor verde para o resultado

        // --- LÓGICA DOS EVENTOS ---

        // Evento Somar
        somar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double n1 = Double.parseDouble(texto1.getText());
                double n2 = Double.parseDouble(texto2.getText());
                double res = n1 + n2;
                exibir.setText("Resultado: " + res);
            }
        });

        // Evento Subtrair
        subtrair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double n1 = Double.parseDouble(texto1.getText());
                double n2 = Double.parseDouble(texto2.getText());
                double res = n1 - n2;
                exibir.setText("Resultado: " + res);
            }
        });

        // Evento Multiplicar
        multiplicar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double n1 = Double.parseDouble(texto1.getText());
                double n2 = Double.parseDouble(texto2.getText());
                double res = n1 * n2;
                exibir.setText("Resultado: " + res);
            }
        });

        // Evento Dividir
        dividir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double n1 = Double.parseDouble(texto1.getText());
                double n2 = Double.parseDouble(texto2.getText());
                if (n2 == 0) {
                    exibir.setText("Erro: Divisão por zero!");
                } else {
                    double res = n1 / n2;
                    exibir.setText("Resultado: " + res);
                }
            }
        });

        // EVENTO RAIZ QUADRADA COM MATH.SQRT
        raiz.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double n1 = Double.parseDouble(texto1.getText());
                if (n1 < 0) {
                    exibir.setText("Erro: Raiz de número negativo!");
                } else {
                    // USO DO MATH.SQRT
                    double res = Math.sqrt(n1);
                    exibir.setText("A raiz de " + n1 + " é: " + String.format("%.2f", res));
                }
            }
        });

        // Evento Limpar (Baseado no slide de Limpando caixa de texto)
        limpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                texto1.setText("");
                texto2.setText("");
                exibir.setText("Resultado: ");
                texto1.requestFocus();
            }
        });

        // Adicionando à tela (Ordem correta para exibição)
        tela.add(rotulo1); tela.add(texto1);
        tela.add(rotulo2); tela.add(texto2);
        tela.add(somar); tela.add(subtrair);
        tela.add(multiplicar); tela.add(dividir);
        tela.add(raiz); tela.add(limpar);
        tela.add(exibir);

        // Configurações finais da janela (Baseado nos slides)
        setSize(380, 350);
        setVisible(true);
        setLocationRelativeTo(null); // Janela centralizada
        setResizable(false); // Fixar tamanho conforme sugerido nos slides
    }

    public static void main(String args[]) {
        CalculadoraCompleta app = new CalculadoraCompleta();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}