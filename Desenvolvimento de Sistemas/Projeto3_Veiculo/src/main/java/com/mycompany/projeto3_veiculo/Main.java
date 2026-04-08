/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto3_veiculo;

/**
 *
 * @author renat
 */

public class Main {

    public static void main(String[] args) {

        // Criando carro
        Carro carro1 = new Carro("Toyota", "Corolla");

        System.out.println("=== CARRO ===");

        carro1.mostrarDados();
        carro1.acelerar();

        // Criando moto
        Moto moto1 = new Moto("Honda", "CG 160");

        System.out.println("\n=== MOTO ===");

        moto1.mostrarDados();

    }

}
