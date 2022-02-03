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
public class Exercicio12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num, contPar = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.println("Digite o " + i + "º número");
            num = scanner.nextInt();

            if (num % 2 == 0) {
                contPar++;
            }
            System.out.println("Foram digitados " + contPar + " números pares \n");

        }
    }

}
