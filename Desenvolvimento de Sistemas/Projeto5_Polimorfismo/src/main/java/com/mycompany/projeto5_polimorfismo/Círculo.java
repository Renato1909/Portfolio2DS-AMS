/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto5_polimorfismo;

/**
 *
 * @author renat
 */


public class Círculo extends Forma {

    public double raio;

    // Construtor
    public Círculo(double raio) {

        this.raio = raio;

    }

    // Sobrescrita do método
    public double calcularArea() {

        double area;

        area = Math.PI * raio * raio;

        return area;

    }

}
