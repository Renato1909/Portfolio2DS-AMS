/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.triangulos;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author renat
 */
public class Triangulos extends JFrame {

 JTextField t1, t2, t3;
    JLabel res;
    JButton btn;

    public Triangulos() {
        super("Exercício 4 - Triângulos");
        Container tela = getContentPane();
        tela.setLayout(null);

        new JLabel("Lado 1:").setBounds(30, 20, 60, 20);
        t1 = new JTextField(); t1.setBounds(90, 20, 60, 25);
        new JLabel("Lado 2:").setBounds(30, 55, 60, 20);
        t2 = new JTextField(); t2.setBounds(90, 55, 60, 25);
        new JLabel("Lado 3:").setBounds(30, 90, 60, 20);
        t3 = new JTextField(); t3.setBounds(90, 90, 60, 25);

        btn = new JButton("VERIFICAR TIPO");
        btn.setBounds(30, 130, 150, 35);
        btn.setBackground(new Color(155, 89, 182)); // Roxo
        btn.setForeground(Color.BLACK);

        res = new JLabel("Tipo: ---");
        res.setBounds(30, 180, 200, 20);
        res.setFont(new Font("Arial", Font.BOLD, 14));

        btn.addActionListener(e -> {
            try {
                double a = Double.parseDouble(t1.getText());
                double b = Double.parseDouble(t2.getText());
                double c = Double.parseDouble(t3.getText());
                if (a == b && b == c) res.setText("Equilátero");
                else if (a == b || a == c || b == c) res.setText("Isósceles");
                else res.setText("Escaleno");
            } catch (Exception ex) { res.setText("Erro!"); }
        });

        tela.add(t1); tela.add(t2); tela.add(t3); tela.add(btn); tela.add(res);
        // Loop para adicionar os labels estáticos (mais limpo)
        tela.add(new JLabel("Lado 1:")).setBounds(30, 20, 60, 20);
        tela.add(new JLabel("Lado 2:")).setBounds(30, 55, 60, 20);
        tela.add(new JLabel("Lado 3:")).setBounds(30, 90, 60, 20);

        setSize(250, 260);
        setLocationRelativeTo(null);
    }
}

