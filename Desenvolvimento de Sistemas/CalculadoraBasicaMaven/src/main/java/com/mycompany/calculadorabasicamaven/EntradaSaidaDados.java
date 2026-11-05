/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadorabasicamaven;
import javax.swing.JOptionPane;
/**
 *
 * @author renat
 */

public class EntradaSaidaDados {

    public static int lerInteiro(String mensagem) {

        return Integer.parseInt(
                JOptionPane.showInputDialog(mensagem)
        );

    }

    public static double lerDouble(String mensagem) {

        return Double.parseDouble(
                JOptionPane.showInputDialog(mensagem)
        );

    }

    public static void mostrarMensagem(String mensagem) {

        JOptionPane.showMessageDialog(
                null,
                mensagem
        );

    }

}