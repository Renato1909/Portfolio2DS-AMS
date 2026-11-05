/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto2_contabancaria;

/**
 *
 * @author renat
 */
public class Main {
    

    public static void main(String[] args) {

        // Criando conta
        ContaBancaria conta = new ContaBancaria();

        // Testando depósito
        conta.depositar(500);

        // Testando saque
        conta.sacar(200);

        // Mostrando saldo final
        System.out.println("Saldo final: " + conta.saldo);

    }

}
