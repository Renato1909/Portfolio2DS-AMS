/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.medianotas;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.UIManager;
/**
 *
 * @author renat
 */
public class PrincipalEx1 {
    public static void main(String[] args) {
        try {
            // Isso aqui deixa o design com a cara do Windows/Sistema atual
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) { }

        SwingUtilities.invokeLater(() -> {
            MediaNotas app = new MediaNotas();
            app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            app.setResizable(false); // Evita que o usuário estrague o layout puxando a janela
            app.setVisible(true);
        });
    }
}
