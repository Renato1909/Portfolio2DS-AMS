/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto5_polimorfismo;

/**
 *
 * @author renat
 */

public class Quadrado extends Forma {

    public double lado;

    // Construtor
    public Quadrado(double lado) {

        this.lado = lado;

    }

    // Sobrescrita do método
    public double calcularArea() {

        double area;

        area = lado * lado;

        return area;

    }

}
