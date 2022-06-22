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
public class Exercicio7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
              int[][] matriz = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i < j) {
                    matriz[i][j] = 2 * 1 + 7 * j - 2;

                } else if (i > j) {
                    matriz[i][j] = (4 * ((int) Math.pow(i, 3))) - (5 * ((int) Math.pow(j, 2)))+1;
                } else {
                    matriz[i][j] = (3 * ((int) Math.pow(1, 2)))-1;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("|%d", matriz[i][j]);
            }
            System.out.println("|");
        }

    }
}
