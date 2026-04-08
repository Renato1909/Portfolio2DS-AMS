/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto9_pedido;

/**
 *
 * @author renat
 */

public class Main {

    public static void main(String[] args) {

        // Criando cliente
        Cliente cliente1;

        cliente1 = new Cliente("Carlos");

        // Criando produtos
        Produto produto1;
        Produto produto2;

        produto1 = new Produto("Mouse", 50);
        produto2 = new Produto("Teclado", 120);

        // Adicionando produtos ao pedido
        cliente1.pedido.adicionarProduto(produto1);
        cliente1.pedido.adicionarProduto(produto2);

        // Calculando total
        double total;

        total = cliente1.pedido.calcularTotal();

        System.out.println("Cliente: " 
                + cliente1.nome);

        System.out.println("Total do pedido: " 
                + total);

    }

}
