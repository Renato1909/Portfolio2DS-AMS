/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto6_interfaceanimal;

/**
 *
 * @author renat
 */


public class Main {

    public static void main(String[] args) {

        // Usando interface (polimorfismo também)
        Animal animal1;
        Animal animal2;

        animal1 = new Cachorro();
        animal2 = new Gato();

        System.out.println("=== Sons dos Animais ===");

        animal1.emitirSom();
        animal2.emitirSom();

    }

}
