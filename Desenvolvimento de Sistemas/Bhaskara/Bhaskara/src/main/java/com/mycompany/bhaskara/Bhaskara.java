/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bhaskara;
import java.util.Scanner;

/**
 *
 * @author Renato Aparecido da Silva - 1° DS/AMS
 */
public class Bhaskara {

    public static void main(String[] args) {
         Scanner novo = new Scanner(System.in);

        double a, b, c;
        double delta, x1, x2;

        System.out.println("Fórmula de Bhaskara");

        System.out.print("Digite o valor de a: ");
        a = novo.nextDouble();

        if (a == 0) {
            System.out.println("Não pode ser 0.");
        } else {

            System.out.print("Digite o valor de b: ");
            b = novo.nextDouble();

            System.out.print("Digite o valor de c: ");
            c = novo.nextDouble();

            delta = (b * b) - (4 * a * c);

            System.out.println("Delta = " + delta);

            if (delta < 0) {
                System.out.println("A equação não possui raízes reais.");
            } else {

                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);

                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }

        novo.close();
    }
}
