/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto7_funcionario;

/**
 *
 * @author renat
 */


public class Funcionario {

    public String nome;
    public double salarioBase;

    // Construtor
    public Funcionario(String nome, double salarioBase) {

        this.nome = nome;
        this.salarioBase = salarioBase;

    }

    // Método calcular salário
    public double calcularSalario() {

        return salarioBase;

    }

}