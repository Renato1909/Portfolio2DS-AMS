/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculoimc;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author renat
 */
public class CalculoIMC extends JFrame {
JTextField txtP, txtA;
    JLabel lblRes;
    JButton btn;

    public CalculoIMC() {
        super("Exercício 5 - IMC");
        Container tela = getContentPane();
        tela.setLayout(null);

        new JLabel("Peso (kg):").setBounds(30, 20, 80, 20);
        txtP = new JTextField(); txtP.setBounds(110, 20, 80, 25);
        new JLabel("Altura (m):").setBounds(30, 60, 80, 20);
        txtA = new JTextField(); txtA.setBounds(110, 60, 80, 25);

        btn = new JButton("CALCULAR IMC");
        btn.setBounds(30, 105, 160, 35);
        btn.setBackground(new Color(255, 127, 80)); // Coral
        btn.setForeground(Color.BLACK);

        lblRes = new JLabel("Status: ---");
        lblRes.setBounds(30, 155, 300, 20);
        lblRes.setFont(new Font("Arial", Font.BOLD, 12));

        btn.addActionListener(e -> {
            try {
                double p = Double.parseDouble(txtP.getText());
                double a = Double.parseDouble(txtA.getText());
                double imc = p / (a * a);
                String s = (imc < 18.5) ? "Abaixo do Peso" : (imc < 25) ? "Peso Ideal" : "Acima do Peso";
                lblRes.setText(String.format("IMC: %.2f - %s", imc, s));
            } catch (Exception ex) { lblRes.setText("Erro!"); }
        });

        tela.add(txtP); tela.add(txtA); tela.add(btn); tela.add(lblRes);
        tela.add(new JLabel("Peso (kg):")).setBounds(30, 20, 80, 20);
        tela.add(new JLabel("Altura (m):")).setBounds(30, 60, 80, 20);

        setSize(320, 230);
        setLocationRelativeTo(null);
    }
}

