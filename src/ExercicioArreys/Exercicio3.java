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
public class Exercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float media = 0;
        int[] notas = new int[4];
        for (int i = 1; i <= notas.length; i++) {
            System.out.println("insira a " + i + "° nota");
            notas[1] = scanner.nextInt();
            media += notas[1];
        }

        media = media / 4;

        System.out.println(
                "a media das notas é:" + media);
    }
}
