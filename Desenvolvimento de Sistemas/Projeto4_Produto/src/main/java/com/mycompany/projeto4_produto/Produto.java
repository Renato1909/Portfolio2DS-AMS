/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto4_produto;

/**
 *
 * @author renat
 */

public class Produto {

    public String nome;
    public double preco;

    // Construtor
    public Produto(String nome, double preco) {

        this.nome = nome;
        this.preco = preco;

    }

    // Método aplicar desconto
    public void aplicarDesconto(double porcentagem) {

        double desconto;

        desconto = preco * (porcentagem / 100);

        preco = preco - desconto;

    }

    // Método mostrar produto
    public void mostrarProduto() {

        System.out.println("Produto: " + nome);
        System.out.println("Preco atual: " + preco);

    }

}
