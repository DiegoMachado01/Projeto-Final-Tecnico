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
public class Exercicio13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        int cont = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.println("Digite o " + i + "º número");
            numero = scanner.nextInt();

            if (numero > 0 && numero < 100) {
                cont++;
            }
        }
        System.out.println("a quantidade de numeros entre 0 a 100 é: " + cont);
    }
}
