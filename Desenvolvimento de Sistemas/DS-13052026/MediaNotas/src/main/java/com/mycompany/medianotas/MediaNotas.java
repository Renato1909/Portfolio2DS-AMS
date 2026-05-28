/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.medianotas;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.LineBorder;
/**
 *
 * @author renat
 */
public class MediaNotas extends JFrame {
    JLabel lblN1, lblN2, lblN3, lblN4, lblResultado;
    JTextField txtN1, txtN2, txtN3, txtN4;
    JButton btnCalcular;

    public MediaNotas() {
        super("Cálculo de Média das Notas");
        Container tela = getContentPane();
        tela.setLayout(null);
        
        // Fundo um pouco mais escuro para destacar as caixas brancas
        tela.setBackground(new Color(236, 240, 241)); 

        // Configuração de Labels
        lblN1 = new JLabel("Nota 1:"); lblN1.setBounds(30, 20, 80, 20);
        lblN2 = new JLabel("Nota 2:"); lblN2.setBounds(30, 50, 80, 20);
        lblN3 = new JLabel("Nota 3:"); lblN3.setBounds(30, 80, 80, 20);
        lblN4 = new JLabel("Nota 4:"); lblN4.setBounds(30, 110, 80, 20);

        // Configuração de Campos de Texto
        txtN1 = new JTextField(); txtN1.setBounds(100, 20, 80, 25);
        txtN2 = new JTextField(); txtN2.setBounds(100, 50, 80, 25);
        txtN3 = new JTextField(); txtN3.setBounds(100, 80, 80, 25);
        txtN4 = new JTextField(); txtN4.setBounds(100, 110, 80, 25);

        // BOTÃO CORRIGIDO: Azul com Letra PRETA bem visível
        btnCalcular = new JButton("CALCULAR MÉDIA");
        btnCalcular.setBounds(30, 155, 150, 40);
        btnCalcular.setBackground(new Color(52, 152, 219)); // Azul
        btnCalcular.setForeground(Color.BLACK); // FORÇANDO COR PRETA
        btnCalcular.setFont(new Font("Arial", Font.BOLD, 12));
        btnCalcular.setFocusPainted(false); // Remove aquele quadradinho feio de foco
        btnCalcular.setBorder(new LineBorder(Color.BLACK, 1)); // Borda preta fina para destaque

        // Resultado
        lblResultado = new JLabel("Resultado: ---");
        lblResultado.setBounds(30, 210, 200, 25);
        lblResultado.setFont(new Font("Arial", Font.BOLD, 14));
        lblResultado.setForeground(new Color(44, 62, 80));

        btnCalcular.addActionListener(e -> {
            try {
                double n1 = Double.parseDouble(txtN1.getText());
                double n2 = Double.parseDouble(txtN2.getText());
                double n3 = Double.parseDouble(txtN3.getText());
                double n4 = Double.parseDouble(txtN4.getText());
                double media = (n1 + n2 + n3 + n4) / 4;
                
                lblResultado.setText("Média Final: " + String.format("%.2f", media));
                
                // Extra: Muda a cor do resultado se aprovado (Dica para a oral!)
                if(media >= 6) lblResultado.setForeground(new Color(39, 174, 96)); // Verde
                else lblResultado.setForeground(Color.RED);
                
            } catch (Exception ex) {
                lblResultado.setText("Erro: Digite apenas números!");
                lblResultado.setForeground(Color.RED);
            }
        });

        // Adicionando à tela
        tela.add(lblN1); tela.add(txtN1);
        tela.add(lblN2); tela.add(txtN2);
        tela.add(lblN3); tela.add(txtN3);
        tela.add(lblN4); tela.add(txtN4);
        tela.add(btnCalcular); tela.add(lblResultado);

        setSize(250, 300);
        setLocationRelativeTo(null);
    }
}
