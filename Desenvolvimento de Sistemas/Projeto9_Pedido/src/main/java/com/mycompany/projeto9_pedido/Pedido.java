/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto9_pedido;
import java.util.ArrayList;

/**
 *
 * @author renat
 */

public class Pedido {

    public ArrayList<Produto> listaProdutos;

    // Construtor
    public Pedido() {

        listaProdutos = new ArrayList<Produto>();

    }

    // Adicionar produto
    public void adicionarProduto(Produto produto) {

        listaProdutos.add(produto);

    }

    // Calcular total
    public double calcularTotal() {

        double total = 0;

        for (Produto produto : listaProdutos) {

            total = total + produto.preco;

        }

        return total;

    }

}
