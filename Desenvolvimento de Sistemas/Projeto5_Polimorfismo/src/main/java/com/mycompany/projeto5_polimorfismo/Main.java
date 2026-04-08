/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto5_polimorfismo;

/**
 *
 * @author renat
 */


public class Main {

    public static void main(String[] args) {

        // Polimorfismo
        Forma forma1;
        Forma forma2;

        // Criando objetos
        forma1 = new Quadrado(4);
        forma2 = new Círculo(3);

        // Chamando métodos
        System.out.println("Area do Quadrado: " 
                + forma1.calcularArea());

        System.out.println("Area do Circulo: " 
                + forma2.calcularArea());

    }

}
