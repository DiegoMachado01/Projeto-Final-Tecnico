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
public class Exercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] media = new int[4];

        int t, c = 0;

        for (int i = 1; i <= media.length; i++) {

            System.out.println("Insira a média do " + i + "º aluno");
            t = scanner.nextInt();

            media[i] = t;

        }

        for (int i = 1; i <= 4; i++) {

            if (media[i] >= 7) {
                c++;
            }

        }

        System.out.println("O número de alunos com média maior ou igual à 7 é " + c);

    }
}
//        int[] media = {0, 0, 0, 0, 0};
//
//        int x, aluno, c = 0;
//
//        for (x = 1; x <= 4; x++) {
//
//            System.out.println("Insira a média do " + x + "º aluno");
//
//            aluno = scanner.nextInt();
//
//            media[x] = aluno;
//
//        }
//
//        for (x = 1; x <= 4; x++) {
//
//            if (media[x] >= 7) {
//                c++;
//            }
//
//        }
//
//        System.out.println("O número de alunos com média maior ou igual à 7 é " + c);
//
//    }
//}
