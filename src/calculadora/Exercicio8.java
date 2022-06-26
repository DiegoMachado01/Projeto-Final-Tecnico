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
public class Exercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int idade =0;
        int cont=0;
        for (int i= 1; i<20; i++){
            System.out.println("informe sua idade");
            idade = scanner.nextInt();
            if (idade >= 18){
                cont = cont +1;
                System.out.println("A quantidade de pessoas com idade maior ou igual a 18 anos é:"+cont);
            }
        }
        
        

    }
}
