/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.renatoaparecidodasilva.exemplocarro;

/**
 *
 * @author Renato Aparecido da Silva - 1° DS/AMS
 */
public class ExemploCarro {

    public static void main(String[] args) {
        Carro umCarro = new Carro(); // Criando uma instâcia da classe carro.
        
        umCarro.modelo = "Gol"; // Atribuindo valores aos atributos.
        umCarro.cor = "Preto"; // Atribuindo valores aos atributos.
        umCarro.motor = "1.0"; // Atribuindo valores aos atributos.
        
        umCarro.ligar(); // Executando os métodos dos objetos.
        umCarro.desligar(); // Executando os métodos dos objetos.
        umCarro.acelerar(); // Executando os métodos dos objetos.
        umCarro.brecar(); // Executando os métodos dos objetos.
        umCarro.mudarMarcha(); // Executando os métodos dos objetos.
        
        umCarro = null; // Atribuindo null para a variável diz que agora ela não aponta para lugar nenhum.
        
    }
}
