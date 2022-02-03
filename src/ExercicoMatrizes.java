
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ivan
 */
public class ExercicoMatrizes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int maior10 = 0;

        for (int i = 0; i <= matriz.length; i++) {
            for (int j = 0; j <= matriz.length; j++) {
                System.out.print("Insira a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();

                if (matriz[i][j] > 10) {

                    maior10++;
                }
            }
        }
        System.out.println("os valores maiores do que DEZ são." + maior10);
    }
}
