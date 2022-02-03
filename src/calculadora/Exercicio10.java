/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class Exercicio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int entrada = 0;
        int multiplicador = 0;
        int total = 0;
        System.out.println("Digite um numero");
        entrada = scanner.nextInt();

        for (int I = 1; I < 10; I++) {
            total = entrada * ++multiplicador;
            System.out.println(entrada + " x " + multiplicador + " = " + total);

//        int entrada;
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Informar um número: ");
//        entrada = scanner.nextInt();
//
//        int multiplicador = 1;
//        while (multiplicador <= 10) {
//            int resultado = entrada * multiplicador;
//            System.out.println(resultado);
//            multiplicador++;
        }
    }
}
