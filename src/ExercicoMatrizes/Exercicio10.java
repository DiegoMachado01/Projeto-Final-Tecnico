/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercicoMatrizes;

import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class Exercicio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int soma = 0;

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.printf("Digite o numero da matriz: ", matriz[i][j]);

                matriz[i][j] = scanner.nextInt();

            }

            System.out.println("cls");

        }
        for (int i = 0; i < 3; i++) {
            System.out.println(" ");
            for (int j = 0; j < 3; j++) {
                System.out.print("  " + matriz[i][j]);

            }
            System.out.println();
        }

        soma = matriz[0][0] + matriz[1][1] + matriz[2][2];

        System.out.printf("A soma da diagonal principal da matriz é: %d ", soma);

    }

}
