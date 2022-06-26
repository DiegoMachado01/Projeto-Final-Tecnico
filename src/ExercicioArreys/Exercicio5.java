/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercicioArreys;

import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class Exercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[20];
        int[] vetorPar = new int[20];
        int[] vetorImpar = new int[20];
        int cont = 0;
        int contPar = 0;
        int contImpar = 0;

        for (int i = 0; i <= 3; i++) {
            System.out.println("Digite um numero");
            vetor[i] = scanner.nextInt();
        }
        for (int i = 0; i <= 3; i++) {
            if (vetor[i] >= 0) {
                cont++;
            }

            if (vetor[i] % 2 == 0) {
                vetorPar[i] = vetor[i];
                contPar++;
            } else {
                vetorImpar[i] = vetor[i];
                contImpar++;
            }

        }

        System.out.println("Vetor com 20 elementos: " + cont);
        System.out.println("Vetor com elementos pares:" + contPar);
        System.out.println("Vetor com elementos impares: " + contImpar);

    }

}
