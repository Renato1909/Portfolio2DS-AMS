/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadorabasicamaven;

/**
 *
 * @author renat
 */

public class MenuCalculadora {

    public void exibirMenu() {

        int opcao;

        do {

            opcao = EntradaSaidaDados.lerInteiro(
                    "\n=== CALCULADORA ==="
                    + "\n1 - Somar"
                    + "\n2 - Subtrair"
                    + "\n3 - Multiplicar"
                    + "\n4 - Dividir"
                    + "\n5 - Converter Decimal para Binário"
                    + "\n0 - Sair"
                    + "\nEscolha uma opção: "
            );

            switch (opcao) {

                case 1:
                    executarSoma();
                    break;

                case 2:
                    executarSubtracao();
                    break;

                case 3:
                    executarMultiplicacao();
                    break;

                case 4:
                    executarDivisao();
                    break;

                case 5:
                    executarConversao();
                    break;

                case 0:
                    EntradaSaidaDados.mostrarMensagem("Encerrando...");
                    break;

                default:
                    EntradaSaidaDados.mostrarMensagem("Opção inválida!");

            }

        } while (opcao != 0);

    }

    private void executarSoma() {

        double n1 = EntradaSaidaDados.lerDouble("Digite o primeiro número:");
        double n2 = EntradaSaidaDados.lerDouble("Digite o segundo número:");

        double resultado = Calculadora.somar(n1, n2);

        EntradaSaidaDados.mostrarMensagem("Resultado: " + resultado);

    }

    private void executarSubtracao() {

        double n1 = EntradaSaidaDados.lerDouble("Digite o primeiro número:");
        double n2 = EntradaSaidaDados.lerDouble("Digite o segundo número:");

        double resultado = Calculadora.subtrair(n1, n2);

        EntradaSaidaDados.mostrarMensagem("Resultado: " + resultado);

    }

    private void executarMultiplicacao() {

        double n1 = EntradaSaidaDados.lerDouble("Digite o primeiro número:");
        double n2 = EntradaSaidaDados.lerDouble("Digite o segundo número:");

        double resultado = Calculadora.multiplicar(n1, n2);

        EntradaSaidaDados.mostrarMensagem("Resultado: " + resultado);

    }

    private void executarDivisao() {

        double n1 = EntradaSaidaDados.lerDouble("Digite o primeiro número:");
        double n2 = EntradaSaidaDados.lerDouble("Digite o segundo número:");

        double resultado = Calculadora.dividir(n1, n2);

        EntradaSaidaDados.mostrarMensagem("Resultado: " + resultado);

    }

    private void executarConversao() {

        int numero = EntradaSaidaDados.lerInteiro(
                "Digite um número decimal:"
        );

        String binario =
                ConversorNumeros.decimalParaBinario(numero);

        EntradaSaidaDados.mostrarMensagem(
                "Binário: " + binario
        );

    }

}
