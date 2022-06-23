/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro.entidades;

/**
 *
 * @author ivan
 */
public class Itemvenda {

    private int itv_cod;
    private float itv_qtde;
    private double itv_valor;
    private double itv_valorunitario;
    private double itv_valortotal;
    private int idusuario;

    public Itemvenda() {
    }

    public Itemvenda(int itv_cod, float itv_qtde, double itv_valor, double itv_valorunitario, double itv_valortotal, int idusuario) {
        this.itv_cod = itv_cod;
        this.itv_qtde = itv_qtde;
        this.itv_valor = itv_valor;
        this.itv_valorunitario = itv_valorunitario;
        this.itv_valortotal = itv_valortotal;
        this.idusuario = idusuario;
    }

    public int getItv_cod() {
        return itv_cod;
    }

    public void setItv_cod(int itv_cod) {
        this.itv_cod = itv_cod;
    }

    public float getItv_qtde() {
        return itv_qtde;
    }

    public void setItv_qtde(float itv_qtde) {
        this.itv_qtde = itv_qtde;
    }

    public double getItv_valor() {
        return itv_valor;
    }

    public void setItv_valor(double itv_valor) {
        this.itv_valor = itv_valor;
    }

    public double getItv_valorunitario() {
        return itv_valorunitario;
    }

    public void setItv_valorunitario(double itv_valorunitario) {
        this.itv_valorunitario = itv_valorunitario;
    }

    public double getItv_valortotal() {
        return itv_valortotal;
    }

    public void setItv_valortotal(double itv_valortotal) {
        this.itv_valortotal = itv_valortotal;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

   
}
