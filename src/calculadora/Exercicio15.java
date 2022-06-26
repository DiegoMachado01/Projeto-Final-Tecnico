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
public class Exercicio15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int numero = 0;
//        int soma = 0;
//        int cont = 0;
//        int escolha;
//
//        for (int i = 1; i <= 3; i++) {
//            System.out.println("Digite o " + i + "º número");
//            numero = scanner.nextInt();
//
//            if (numero >= 0) {
//                cont++;
//            }
//            soma = soma + numero;
//            if (numero < 0) {
//
//                System.out.println("o programa foi encerrado");
//                System.exit(0);
//            }
//
//        }
//        System.out.println("a soma dos numeros é:" + soma);
            int numero =0;
            int resultado =0;
            
            System.out.println("Digite um numero");
            numero = scanner.nextInt();
            
            while (numero >= 0){
                resultado += numero;
                numero = scanner.nextInt();
            }
             System.out.println(resultado);
    }
}
