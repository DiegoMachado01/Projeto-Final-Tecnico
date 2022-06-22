/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App_Delivery;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class POOaplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seja bem vindo\n");
        Menu menu = new Menu();
        int opcao = 3;

        while (opcao < 4) {
            menu.Menu();
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    menu.ListaCardapio();
                    break;
                case 2:
                    menu.Selecionador();
                    break;
                case 3:
                    menu.comanda();
                    break;

            }

        }
    }
}
