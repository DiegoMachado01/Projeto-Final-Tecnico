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
public class Exercicio14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = 0;
        int contador = 0;
        int contadorUm = 0;
        int contadorDois = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.println("Digite o " + i + "º número");
            numero = scanner.nextInt();

            if (numero >= 0 && numero <= 100) {
                contador++;
            }
            if (numero > 100 && numero <=200) {
                contadorUm++;
            }
            if (numero > 200) {
                contadorDois++;
            }
        }
        System.out.println("a quantidade de numeros entre 0 e 100  é: " + contador);
        System.out.println("a quantidade de numeros entre 0 e 101 e 200 é: " + contadorUm);
        System.out.println(" a quantidade de numeros que são maiores que 200 é: " + contadorDois);

    }
}
