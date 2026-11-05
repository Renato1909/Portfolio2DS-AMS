/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controlecomissao;

/**
 *
 * @author renat
 */
public class Vendedor {
  private String nome;
    private double salarioBase;

    public Vendedor(String nome,
                     double salarioBase) {

        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double calcularComissao(
            double vendas) {

        double comissao =
                vendas * 0.10;

        return salarioBase + comissao;
    }

}
