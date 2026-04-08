/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto7_funcionario;

/**
 *
 * @author renat
 */

public class Gerente extends Funcionario {

    public double bonus;

    // Construtor
    public Gerente(String nome, double salarioBase, double bonus) {

        super(nome, salarioBase);

        this.bonus = bonus;

    }

    // Sobrescrita do método
    public double calcularSalario() {

        return salarioBase + bonus;

    }

}
