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
public class Exercicio7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade = 0;
        float media = 0;
        int soma = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.println("Informe sua idade");
            idade = scanner.nextInt();

            soma = soma + idade;}
            
            media = (soma/3);
            

        
        System.out.println("a media das idades é:" + media);

    }
}
