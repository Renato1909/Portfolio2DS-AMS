/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pessoa;

/**
 *
 * @author Admin
 */
public class Pessoa {
  public String nome;
    public int idade;

    // Construtor (Exercício 3)
    public Pessoa(String nome, int idade) {

        this.nome = nome;
        this.idade = idade;

    }

    // Getters e Setters (Exercício 1)

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}

