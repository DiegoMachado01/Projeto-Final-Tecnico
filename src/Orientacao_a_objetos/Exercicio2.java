/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Orientacao_a_objetos;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Exercicio2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Exercicio2 Livro = new Exercicio2();

        System.out.println("Digite o nome do leitor:");
        Livro.setNomeLeitor(scan.nextLine());
        System.out.println("Digite o nome do livro");
        Livro.setTitulo(scan.next());
        System.out.println("Digite o número de páginas do livro:");
        Livro.setPaginasTotal(scan.nextFloat());
        System.out.println("Digite o número de láginas lidas:");
        Livro.setPaginasLidas(scan.nextFloat());

        Livro.resultado();
    }

}
