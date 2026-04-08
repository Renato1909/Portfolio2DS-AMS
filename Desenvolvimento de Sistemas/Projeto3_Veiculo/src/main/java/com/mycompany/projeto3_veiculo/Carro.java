/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto3_veiculo;

/**
 *
 * @author renat
 */

public class Carro extends Veiculo {

    public int velocidade;

    // Construtor
    public Carro(String marca, String modelo) {

        super(marca, modelo);
        velocidade = 0;

    }

    // Método acelerar
    public void acelerar() {

        velocidade += 10;

        System.out.println("Carro acelerando...");
        System.out.println("Velocidade: " + velocidade);

    }

}
