/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto2_contabancaria;

/**
 *
 * @author renat
 */
public class ContaBancaria {

    public double saldo = 0;

    // Método depositar
    public void depositar(double valor) {

        saldo += valor;

        System.out.println("Deposito realizado: " + valor);

    }

    // Método sacar
    public void sacar(double valor) {

        if (valor <= saldo) {

            saldo -= valor;

            System.out.println("Saque realizado: " + valor);

        } else {

            System.out.println("Saldo insuficiente!");

        }

    }

}
