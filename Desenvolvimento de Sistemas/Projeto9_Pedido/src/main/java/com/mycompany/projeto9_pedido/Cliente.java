/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto9_pedido;

/**
 *
 * @author renat
 */

public class Cliente {

    public String nome;
    public Pedido pedido;

    // Construtor
    public Cliente(String nome) {

        this.nome = nome;
        pedido = new Pedido();

    }

}
