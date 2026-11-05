/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controlecomissao;

/**
 *
 * @author renat
 */
public class MenuComissao {
    Vendedor vendedor;

    ConversorNumeros conv =
            new ConversorNumeros();

    EntradaSaidaDados esd =
            new EntradaSaidaDados();

    public void executaControleComissao() {

        String nome;
        String salarioStr;
        String vendasStr;

        nome = esd.entradaDados(
                "Digite o nome do vendedor:");

        salarioStr = esd.entradaDados(
                "Digite o salário base:");

        vendasStr = esd.entradaDados(
                "Digite o valor das vendas:");

        double salario =
                conv.stringToDouble(salarioStr);

        double vendas =
                conv.stringToDouble(vendasStr);

        vendedor =
                new Vendedor(nome, salario);

        double total =
                vendedor.calcularComissao(vendas);

        esd.saidaDados(
                "Total com comissão: "
                        + total);
    }
}
