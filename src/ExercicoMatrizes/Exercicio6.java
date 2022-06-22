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
public class Exercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] M1 = new int[4][4];
        int[][] M2 = new int[4][4];
        int[][] M3 = new int[4][4];

        System.out.println("ENTRADA DA PRIMEIRA MATRIZ:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("M1" + (i + 1) + " e " + (j + 1));
                M1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("ENTRADA DA SEGUNDA MATRIZ:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("M2 " + (i + 1) + " e " + (j + 1));
                M2[i][j] = scanner.nextInt();
            }
        }
        System.out.println("RESULTADO DAS COMPARAÇÕES:");
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                if (M1[i][j] > M2[i][j]) {
                    M3[i][j] = M1[i][j];
                } else {
                    M3[i][j] = M2[i][j];
                }
                System.out.println(" maior elemento da posição " + (i) + " e " + (j) + "é: " + M3[i][j]);

            }
        }
        for (int i = 1; i < 4; i++) {

            for (int j = 1; j < 4; j++) {
                System.out.print(" " + M3[i][j]);

            }
            System.out.println();
        }
    }
}
