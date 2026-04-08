/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto7_funcionario;

/**
 *
 * @author renat
 */

public class Main {

    public static void main(String[] args) {

        Funcionario funcionario1;
        Funcionario gerente1;

        // Criando objetos
        funcionario1 = new Funcionario("Carlos", 2000);

        gerente1 = new Gerente("Ana", 3000, 1000);

        System.out.println("=== Salarios ===");

        System.out.println("Funcionario: " 
                + funcionario1.calcularSalario());

        System.out.println("Gerente: " 
                + gerente1.calcularSalario());

    }

}