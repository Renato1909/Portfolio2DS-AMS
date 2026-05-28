/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conversortemp;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author renat
 */
public class ConversorTemp extends JFrame {
JTextField tC, tF, tK;
    JButton btn;

    public ConversorTemp() {
        super("Exercício 6 - Temperaturas");
        Container tela = getContentPane();
        tela.setLayout(null);
        tela.setBackground(new Color(45, 52, 54));

        Color b = Color.WHITE;
        JLabel l1 = new JLabel("Celsius:"); l1.setForeground(b); l1.setBounds(30, 20, 80, 20);
        tC = new JTextField(); tC.setBounds(110, 20, 80, 25);
        
        JLabel l2 = new JLabel("Fahrenheit:"); l2.setForeground(b); l2.setBounds(30, 60, 80, 20);
        tF = new JTextField(); tF.setBounds(110, 60, 80, 25); tF.setEditable(false);
        
        JLabel l3 = new JLabel("Kelvin:"); l3.setForeground(b); l3.setBounds(30, 100, 80, 20);
        tK = new JTextField(); tK.setBounds(110, 100, 80, 25); tK.setEditable(false);

        btn = new JButton("CONVERTER");
        btn.setBounds(30, 145, 160, 35);
        btn.setBackground(new Color(253, 203, 110)); // Amarelo Pastel
        btn.setForeground(Color.BLACK);

        btn.addActionListener(e -> {
            try {
                double c = Double.parseDouble(tC.getText());
                tF.setText(String.format("%.2f", (c * 9/5) + 32));
                tK.setText(String.format("%.2f", c + 273.15));
            } catch (Exception ex) { tC.setText("Erro!"); }
        });

        tela.add(l1); tela.add(tC); tela.add(l2); tela.add(tF); tela.add(l3); tela.add(tK); tela.add(btn);
        setSize(250, 240);
        setLocationRelativeTo(null);
    }
}
