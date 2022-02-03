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
public class Exercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] consoantes = new char[3];
        char caracter = 0;
        int qtdConsoantes = 0;
        for (int i = 1; i <= consoantes.length; i++) {
            System.out.println("digite a " + i + "° letra");
            consoantes[i] = scanner.next().charAt(0);

            switch (caracter) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    consoantes[i] = 0;
                    break;
                default:
                    consoantes[i] = caracter;
                    qtdConsoantes++;
            }
        }
        System.out.println("a quantidade de consoantes é" + qtdConsoantes);
    }
}
