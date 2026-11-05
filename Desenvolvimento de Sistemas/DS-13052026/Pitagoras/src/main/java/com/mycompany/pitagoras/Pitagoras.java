/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pitagoras;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.LineBorder;

/**
 *
 * @author renat
 */
public class Pitagoras extends JFrame {

   JLabel lblA, lblB, lblRes;
    JTextField txtA, txtB;
    JButton btn;

    public Pitagoras() {
        super("Exercício 3 - Pitágoras");
        Container tela = getContentPane();
        tela.setLayout(null);
        tela.setBackground(new Color(230, 240, 250));

        lblA = new JLabel("Cateto a:"); lblA.setBounds(30, 30, 80, 20);
        txtA = new JTextField(); txtA.setBounds(110, 30, 80, 25);
        lblB = new JLabel("Cateto b:"); lblB.setBounds(30, 70, 80, 20);
        txtB = new JTextField(); txtB.setBounds(110, 70, 80, 25);

        btn = new JButton("CALCULAR C");
        btn.setBounds(30, 115, 160, 35);
        btn.setBackground(new Color(46, 204, 113)); // Verde
        btn.setForeground(Color.BLACK);
        btn.setBorder(new LineBorder(Color.BLACK));

        lblRes = new JLabel("Hipotenusa (c): ---");
        lblRes.setBounds(30, 165, 250, 20);
        lblRes.setFont(new Font("Arial", Font.BOLD, 14));

        btn.addActionListener(e -> {
            try {
                double a = Double.parseDouble(txtA.getText());
                double b = Double.parseDouble(txtB.getText());
                double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
                lblRes.setText("Hipotenusa (c) = " + String.format("%.2f", c));
            } catch (Exception ex) { lblRes.setText("Erro!"); }
        });

        tela.add(lblA); tela.add(txtA); tela.add(lblB); tela.add(txtB); tela.add(btn); tela.add(lblRes);
        setSize(280, 240);
        setLocationRelativeTo(null);
    }
}
