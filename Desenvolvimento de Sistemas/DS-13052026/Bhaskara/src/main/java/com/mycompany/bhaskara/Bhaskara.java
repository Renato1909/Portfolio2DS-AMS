/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bhaskara;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.LineBorder;
/**
 *
 * @author renat
 */
public class Bhaskara extends JFrame {
    
        JLabel lblA, lblB, lblC, lblX1, lblX2, lblFormula;
    JTextField txtA, txtB, txtC;
    JButton btnCalcular;

    public Bhaskara() {
        super("Exercício 2 - Fórmula de Bhaskara");
        Container tela = getContentPane();
        tela.setLayout(null);
        tela.setBackground(new Color(245, 245, 245));

        lblFormula = new JLabel("ax² + bx + c = 0");
        lblFormula.setBounds(100, 5, 150, 20);
        lblFormula.setFont(new Font("Arial", Font.ITALIC, 12));

        lblA = new JLabel("Valor de a:"); lblA.setBounds(30, 30, 80, 20);
        txtA = new JTextField(); txtA.setBounds(110, 30, 60, 25);
        
        lblB = new JLabel("Valor de b:"); lblB.setBounds(30, 65, 80, 20);
        txtB = new JTextField(); txtB.setBounds(110, 65, 60, 25);
        
        lblC = new JLabel("Valor de c:"); lblC.setBounds(30, 100, 80, 20);
        txtC = new JTextField(); txtC.setBounds(110, 100, 60, 25);

        btnCalcular = new JButton("CALCULAR");
        btnCalcular.setBounds(30, 140, 140, 35);
        btnCalcular.setBackground(new Color(255, 204, 0)); // Amarelo
        btnCalcular.setForeground(Color.BLACK); // Texto visível
        btnCalcular.setFont(new Font("Arial", Font.BOLD, 12));
        btnCalcular.setBorder(new LineBorder(Color.BLACK, 1));

        lblX1 = new JLabel("x1: ---"); lblX1.setBounds(30, 185, 200, 20);
        lblX2 = new JLabel("x2: ---"); lblX2.setBounds(30, 210, 200, 20);
        lblX1.setFont(new Font("Arial", Font.BOLD, 14));
        lblX2.setFont(new Font("Arial", Font.BOLD, 14));

        btnCalcular.addActionListener(e -> {
            try {
                double a = Double.parseDouble(txtA.getText());
                double b = Double.parseDouble(txtB.getText());
                double c = Double.parseDouble(txtC.getText());
                double delta = (b * b) - (4 * a * c);
                if (delta < 0) {
                    lblX1.setText("Delta negativo (sem raízes)");
                    lblX2.setText("");
                } else {
                    double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                    lblX1.setText("x1 = " + String.format("%.2f", x1));
                    lblX2.setText("x2 = " + String.format("%.2f", x2));
                }
            } catch (Exception ex) { lblX1.setText("Erro: Dados inválidos!"); }
        });

        tela.add(lblFormula); tela.add(lblA); tela.add(txtA); tela.add(lblB); tela.add(txtB);
        tela.add(lblC); tela.add(txtC); tela.add(btnCalcular); tela.add(lblX1); tela.add(lblX2);
        setSize(250, 280);
        setLocationRelativeTo(null);
    }
}
