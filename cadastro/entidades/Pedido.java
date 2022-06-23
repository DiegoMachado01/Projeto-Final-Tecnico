/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro.entidades;

import java.util.Date;
import java.util.ArrayList;

public class Pedido {

    private int id;
    private Date dataPedido;
    private int idCliente;
    private double valorTotalPedido;
    private int idUsuario;
    // 1:N
    private ArrayList<ItemPedido> itensPedido;

    public Pedido(){
        
    }
    public Pedido(int id, Date dataPedido, int idCliente, 
                  double valorTotalPedido, int idUsuario, 
                  ArrayList<ItemPedido> itensPedido) {
        this.id = id;
        this.dataPedido = dataPedido;
        this.idCliente = idCliente;
        this.valorTotalPedido = valorTotalPedido;
        this.idUsuario = idUsuario;
        this.itensPedido = itensPedido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public double getValorTotalPedido() {
        return valorTotalPedido;
    }

    public void setValorTotalPedido(double valorTotalPedido) {
        this.valorTotalPedido = valorTotalPedido;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public ArrayList<ItemPedido> getItensPedido() {
        return itensPedido;
    }

    public void setItensPedido(ArrayList<ItemPedido> itensPedido) {
        this.itensPedido = itensPedido;
    }
    

    
    
}
