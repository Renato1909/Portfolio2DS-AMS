/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto8_biblioteca;
import java.util.ArrayList;
/**
 *
 * @author renat
 */

public class Biblioteca {

    public ArrayList<Livro> listaLivros;

    // Construtor
    public Biblioteca() {

        listaLivros = new ArrayList<Livro>();

    }

    // Método adicionar livro
    public void adicionarLivro(Livro livro) {

        listaLivros.add(livro);

    }

    // Método buscar livro
    public Livro buscarLivro(String titulo) {

        for (Livro livro : listaLivros) {

            if (livro.titulo.equalsIgnoreCase(titulo)) {

                return livro;

            }

        }

        return null;

    }

}
