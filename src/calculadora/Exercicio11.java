/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class Exercicio11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = 0;
        int contador = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("digite um numero :");
            numero = scanner.nextInt();

            if (numero > 8) {
                contador = contador + 1;

            }

        }
        System.out.println("numero maior que 8: " + contador);
    }
}
