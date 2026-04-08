/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto10_menuscanner;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author renat
 */

public class Main {

    public static void main(String[] args) {

        Scanner scanner;

        scanner = new Scanner(System.in);

        ArrayList<Produto> listaProdutos;

        listaProdutos = new ArrayList<Produto>();

        int opcao;

        opcao = 0;

        while (opcao != 3) {

            System.out.println("\n=== MENU ===");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Sair");

            System.out.print("Escolha uma opcao: ");

            opcao = scanner.nextInt();

            scanner.nextLine();

            switch (opcao) {

                case 1:

                    String nome;
                    double preco;

                    System.out.print("Nome do produto: ");
                    nome = scanner.nextLine();

                    System.out.print("Preco do produto: ");
                    preco = scanner.nextDouble();

                    scanner.nextLine();

                    Produto produto;

                    produto = new Produto(nome, preco);

                    listaProdutos.add(produto);

                    System.out.println("Produto adicionado!");

                    break;

                case 2:

                    System.out.println("\n=== LISTA DE PRODUTOS ===");

                    for (Produto p : listaProdutos) {

                        System.out.println(
                                "Nome: " + p.nome +
                                " | Preco: " + p.preco
                        );

                    }

                    break;

                case 3:

                    System.out.println("Saindo do sistema...");

                    break;

                default:

                    System.out.println("Opcao invalida!");

            }

        }

        scanner.close();

    }

}
