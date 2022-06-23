/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro.entidades;

public class ItemPedido {

    private int id;
    private int idPedido;
    private int idProduto;
    private double qtd;
    private double valorUnitario;
    private double valorTotalItem;

    public ItemPedido() {
    }
    

    
    public ItemPedido(int id, int idPedido, int idProduto, double qtd, double valorUnitario, double valorTotalItem) {
        this.id = id;
        this.idPedido = idPedido;
        this.idProduto = idProduto;
        this.qtd = qtd;
        this.valorUnitario = valorUnitario;
        this.valorTotalItem = valorTotalItem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public double getQtd() {
        return qtd;
    }

    public void setQtd(double qtd) {
        this.qtd = qtd;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public double getValorTotalItem() {
        return valorTotalItem;
    }

    public void setValorTotalItem(double valorTotalItem) {
        this.valorTotalItem = valorTotalItem;
    }

}
