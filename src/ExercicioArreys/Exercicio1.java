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
public class Exercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        for (int i =0; i<numeros.length; i++){
        System.out.println("Digite um numero");
        numeros [i]= scanner.nextInt();
    }
        for (int numero: numeros){
            System.out.println("Numeros digitados" + numero);
}
}
}