/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto3_veiculo;

/**
 *
 * @author renat
 */
public class Veiculo {
    

    public String marca;
    public String modelo;

    // Construtor
    public Veiculo(String marca, String modelo) {

        this.marca = marca;
        this.modelo = modelo;

    }

    // Método para mostrar dados
    public void mostrarDados() {

        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);

    }
}
