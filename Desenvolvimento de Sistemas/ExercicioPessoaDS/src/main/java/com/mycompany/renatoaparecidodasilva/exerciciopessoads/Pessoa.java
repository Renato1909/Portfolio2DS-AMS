/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.renatoaparecidodasilva.exerciciopessoads;

/**
 *
 * @author Renato Aparecido da Silva - 2° DS/AMS
 */
public class Pessoa {
    
    String Nome;
    String Sexo;
    String País;
    
    public void PessoaAnda() {
    System.out.println("A pessoa está andando.");
    }
     
    void PessoaFala() {
    System.out.println("A pessoa está falando.");
    }
    
    void PessoaCorre () {
    System.out.println("A pessoa está correndo.");
    }
    
    void PessoaEstuda() {
    System.out.println("A pessoa está estudando.");    
    }
    
    void PessoaBrinca() {
    System.out.println("A pessoa está brincando.");

     
   }

    void caracteristicas() {
   System.out.println(Nome);
       System.out.println(Sexo);
       System.out.println(País);
    }
}
