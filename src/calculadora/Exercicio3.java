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
public class Exercicio3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner (System.in);
         
        String nome;

        System.out.println("Digite seu nome: ");
        nome = scanner.nextLine();

        for (int i = 0; i <= 10; ) {
            System.out.println(nome);
            i++;
        }
    
}
}
