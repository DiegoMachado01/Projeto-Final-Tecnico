/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 
 * @author ivan
 */
public class Exercicio2 {
    
public static void main(String[] args){
        int soma = 0;
            for(int i= 2; i<=15; i++){
            soma = soma +i;
            i+=2;           
        }
        System.out.println(soma);
    }
}