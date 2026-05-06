/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadoracompleta;
import javax.swing.JFrame;
/**
 *
 * @author renat
 */
public class Principal {
    public static void main(String[] args) {
        CalculadoraCompleta calc = new CalculadoraCompleta();
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calc.setVisible(true);
    }
}
