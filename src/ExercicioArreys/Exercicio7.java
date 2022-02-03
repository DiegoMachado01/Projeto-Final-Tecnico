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
public class Exercicio7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];
        int soma = 0;
        int multiplicação = 0;
        for (int i = 1; i <= vetor.length; i++) {
            System.out.println("Digite o " + i + "° numero");
            vetor[i] = scanner.nextInt();
            soma += vetor[i];
            multiplicação *= vetor[i];
            
        }
        for (int i = 1; i <= vetor.length; i++)
            System.out.println("os numeros digitados foram " + vetor[i]);
            System.out.println("a soma dos numeros é " + soma);
            System.out.println("a multiplicação dos numeros é " + multiplicação);
        }
    }

