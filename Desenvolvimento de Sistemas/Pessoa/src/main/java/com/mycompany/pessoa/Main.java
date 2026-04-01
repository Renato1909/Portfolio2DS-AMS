/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pessoa;

/**
 *
 * @author Admin
 */
public class Main {
    
    public static void main(String[] args) {

    
     // Criando objeto Aluno
        Aluno aluno1 = new Aluno("Carlos", 18, "2024001");

        // Mostrando dados
        System.out.println("Nome: " + aluno1.nome);
        System.out.println("Idade: " + aluno1.idade);
        System.out.println("Matrícula: " + aluno1.matricula);

        // Testando setters
        aluno1.setNome("Maria");
        aluno1.setIdade(20);

        System.out.println("\nApós alteração:");

        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Idade: " + aluno1.getIdade());

    }

}
