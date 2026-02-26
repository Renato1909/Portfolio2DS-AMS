/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.renatoaparecidodasilva.exerciciopessoads;

/**
 *
 * @author Renato Aparecido da Silva - 2° DS/AMS
 */
public class ExercicioPessoaDS {

    public static void main(String[] args) {
    Pessoa umPessoa = new Pessoa();
        
        umPessoa.Nome = "Renato";
        umPessoa.Sexo = "Masculino";
        umPessoa.País = "Brasil";
        
        umPessoa.PessoaAnda();
        umPessoa.PessoaFala ();
        umPessoa.PessoaCorre ();
        umPessoa.PessoaEstuda ();
        umPessoa.PessoaBrinca ();
        umPessoa.caracteristicas();
        
        umPessoa = null;
    }
}
