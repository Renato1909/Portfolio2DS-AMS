/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoracompleta;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.LineBorder;
/**
 *
 * @author renat
 */

public class CalculadoraCompleta extends JFrame {
    JLabel rotulo1, rotulo2, exibir;
    JTextField texto1, texto2;
    JButton somar, subtrair, multiplicar, dividir, raiz, limpar;

    public CalculadoraCompleta() {
        super("Calculadora Pro - Java Swing");
        Container tela = getContentPane();
        tela.setLayout(null);
        
        // Design e Cores
        tela.setBackground(new Color(45, 52, 54)); // Fundo grafite escuro
        Font fonteLabel = new Font("Tahoma", Font.BOLD, 12);
        Color corTexto = Color.WHITE;

        rotulo1 = new JLabel("1º Número:");
        rotulo1.setForeground(corTexto);
        rotulo1.setFont(fonteLabel);
        
        rotulo2 = new JLabel("2º Número:");
        rotulo2.setForeground(corTexto);
        rotulo2.setFont(fonteLabel);

        exibir = new JLabel("Resultado: ");
        exibir.setForeground(new Color(85, 239, 196)); // Verde menta
        exibir.setFont(new Font("Tahoma", Font.BOLD, 16));

        texto1 = new JTextField();
        texto2 = new JTextField();
        
        // Estilizando botões
        somar = criarBotao("+", new Color(9, 132, 227));
        subtrair = criarBotao("-", new Color(225, 112, 85));
        multiplicar = criarBotao("*", new Color(108, 92, 231));
        dividir = criarBotao("/", new Color(253, 203, 110));
        raiz = criarBotao("√ Raiz Quadrada", new Color(0, 184, 148));
        limpar = criarBotao("Limpar Campos", new Color(214, 48, 49));

        // Posicionamento
        rotulo1.setBounds(50, 20, 100, 20);  texto1.setBounds(150, 20, 120, 25);
        rotulo2.setBounds(50, 60, 100, 20);  texto2.setBounds(150, 60, 120, 25);
        
        somar.setBounds(50, 110, 60, 40);    subtrair.setBounds(120, 110, 60, 40);
        multiplicar.setBounds(190, 110, 60, 40); dividir.setBounds(260, 110, 60, 40);
        
        raiz.setBounds(50, 160, 270, 40);
        limpar.setBounds(50, 210, 270, 30);
        exibir.setBounds(50, 260, 320, 30);

        // Tratamento de Erros Profissional (Try-Catch)
        ActionListener operacao = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double n1 = Double.parseDouble(texto1.getText());
                    double res = 0;

                    if (e.getSource() == raiz) {
                        if (n1 < 0) throw new ArithmeticException("Raiz Negativa");
                        res = Math.sqrt(n1); // Math.sqrt
                    } else {
                        double n2 = Double.parseDouble(texto2.getText());
                        if (e.getSource() == somar) res = n1 + n2;
                        if (e.getSource() == subtrair) res = n1 - n2;
                        if (e.getSource() == multiplicar) res = n1 * n2;
                        if (e.getSource() == dividir) {
                            if (n2 == 0) throw new ArithmeticException("Divisão por zero");
                            res = n1 / n2;
                        }
                    }
                    exibir.setText("Resultado: " + String.format("%.2f", res));
                } catch (NumberFormatException ex) {
                    exibir.setText("Erro: Digite apenas números!");
                } catch (ArithmeticException ex) {
                    exibir.setText("Erro: " + ex.getMessage());
                }
            }
        };

        // Associando o mesmo listener para todos (Código mais limpo)
        somar.addActionListener(operacao);
        subtrair.addActionListener(operacao);
        multiplicar.addActionListener(operacao);
        dividir.addActionListener(operacao);
        raiz.addActionListener(operacao);

        limpar.addActionListener(e -> {
            texto1.setText(""); texto2.setText(""); exibir.setText("Resultado:");
            texto1.requestFocus();
        });

        // Adicionando componentes
        tela.add(rotulo1); tela.add(texto1); tela.add(rotulo2); tela.add(texto2);
        tela.add(somar); tela.add(subtrair); tela.add(multiplicar); tela.add(dividir);
        tela.add(raiz); tela.add(limpar); tela.add(exibir);

        setSize(400, 350);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    // Método auxiliar para criar botões padronizados (refatoração)
    private JButton criarBotao(String texto, Color cor) {
        JButton b = new JButton(texto);
        b.setBackground(cor);
        b.setForeground(Color.WHITE);
        b.setFocusPainted(false);
        b.setBorder(new LineBorder(Color.DARK_GRAY));
        return b;
    }
}