/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App_Delivery;

import java.util.ArrayList;

/**
 *
 * @author Diego
 */
public class FechaPedido extends TaxaEntrega {

    ArrayList<String> itens = new ArrayList<>();
    ArrayList<Integer> valores = new ArrayList<>();
    ArrayList<Integer> quantidadeItem = new ArrayList<>();
    int contador;
    int total;

    public void comanda() {
        System.out.println("\nSegue seu pedido:");
        for (int i = 0; i < this.contador; i++) {
            System.out.println(this.quantidadeItem.get(i) + " - " + this.itens.get(i) + " " + this.valores.get(i) + "$");
            this.total += this.valores.get(i);
        }

        System.out.println("Taxa de entrega: " + getTaxa() + "$");
        this.total += getTaxa();

        System.out.println("Total do seu pedido: " + this.total + "$");

        System.out.println("\nObrigado pelo pedido – Conte conosco!");

        System.exit(0);
    }
}


