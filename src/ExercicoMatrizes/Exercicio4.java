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
public class Exercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = {{10, 1, 2, 10}, {5, 4, 6, 14}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int contador = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                if (matriz[i][j] > 10) {
                    contador++;
                }
            }

        }

        System.out.println("a Matriz contem   " + contador + " maiores que 10");
    }
}


