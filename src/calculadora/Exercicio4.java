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
public class Exercicio4 {
         public static void main(String[] args) {
            Scanner scanner = new Scanner (System.in);
         
        String nome;
        int numero;
        int operador;

        System.out.println("Digite seu nome: ");
        nome = scanner.nextLine();
             
        
        System.out.println("Quantas vezes deseja repetir o nome?");
        System.out.println("\n1 vez \n2 vezes \n3 vezes \n4 vezes");
        operador = scanner.nextInt();

       
        for (int i = 1; i <= operador;i++ ) {
            System.out.println(nome);
            
        } 
}
}