/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto8_biblioteca;

/**
 *
 * @author renat
 */

public class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca;

        biblioteca = new Biblioteca();

        // Criando livros
        Livro livro1;
        Livro livro2;

        livro1 = new Livro("Java Basico", "Joao Silva");

        livro2 = new Livro("POO em Java", "Maria Souza");

        // Adicionando livros
        biblioteca.adicionarLivro(livro1);

        biblioteca.adicionarLivro(livro2);

        // Buscando livro
        Livro resultado;

        resultado = biblioteca.buscarLivro("Java Basico");

        if (resultado != null) {

            System.out.println("Livro encontrado:");

            System.out.println("Titulo: " 
                    + resultado.titulo);

            System.out.println("Autor: " 
                    + resultado.autor);

        } 
        else {

            System.out.println("Livro nao encontrado.");

        }

    }

}
