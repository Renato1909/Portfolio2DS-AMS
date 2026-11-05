/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto4_produto;

/**
 *
 * @author renat
 */

public class Main {

    public static void main(String[] args) {

        // Criando produto
        Produto produto1;

        produto1 = new Produto("Notebook", 2500);

        System.out.println("=== ANTES DO DESCONTO ===");

        produto1.mostrarProduto();

        // Aplicando desconto
        produto1.aplicarDesconto(10);

        System.out.println("\n=== APOS DESCONTO ===");

        produto1.mostrarProduto();

    }

}
