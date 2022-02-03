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
public class Exercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = 0;
        int soma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Informe um número");
            numero = scanner.nextInt();

            soma = soma + numero;
        }
            System.out.println("a soma dos numeros é:" + soma);

        
    }
}
