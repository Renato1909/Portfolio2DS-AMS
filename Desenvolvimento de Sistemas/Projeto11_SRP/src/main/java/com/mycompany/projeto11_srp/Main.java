/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto11_srp;

/**
 *
 * @author renat
 */

public class Main {

    public static void main(String[] args) {

        ProdutoService produtoService;
        RelatorioService relatorioService;
        EmailService emailService;

        produtoService = new ProdutoService();
        relatorioService = new RelatorioService();
        emailService = new EmailService();

        produtoService.salvarProduto();

        relatorioService.gerarRelatorio();

        emailService.enviarEmail();

    }

}
