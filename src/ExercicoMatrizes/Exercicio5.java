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
public class Exercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[5][5];
        int linha = 0;
        int coluna = 0;
        int numeroEncontrado = 0;
        int valor = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Digite o valor da linha " + (i + 1) + " coluna " + (j + 1) + ":");
                matriz[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Digite o numero que gostaria de buscar na Matriz");
        valor = scanner.nextInt();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] == valor) {
                    coluna = i + 1;
                    linha = j + 1;
                    numeroEncontrado = 1;

                }
            }

        }
        if (valor == 0) {
            System.out.println("Não encontrado");
        } else {
            System.out.println("o valor " + valor + " foi encontrado na linha " + linha + " na coluna " + coluna);
        }
    }
}
