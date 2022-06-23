/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro.entidades;

public class Itemcompra {

    private int itc_cod;
    private float itc_qtde;
    private double itc_valorunitario;
    private double itc_valortotal;
    private double com_cod;
    private int idusuario;

    public Itemcompra() {
    }

    public Itemcompra(int itc_cod, float itc_qtde, double itc_valorunitario, double itc_valortotal, double com_cod, int idusuario) {
        this.itc_cod = itc_cod;
        this.itc_qtde = itc_qtde;
        this.itc_valorunitario = itc_valorunitario;
        this.itc_valortotal = itc_valortotal;
        this.com_cod = com_cod;
        this.idusuario = idusuario;
    }

    public int getItc_cod() {
        return itc_cod;
    }

    public void setItc_cod(int itc_cod) {
        this.itc_cod = itc_cod;
    }

    public float getItc_qtde() {
        return itc_qtde;
    }

    public void setItc_qtde(float itc_qtde) {
        this.itc_qtde = itc_qtde;
    }

    public double getItc_valorunitario() {
        return itc_valorunitario;
    }

    public void setItc_valorunitario(double itc_valorunitario) {
        this.itc_valorunitario = itc_valorunitario;
    }

    public double getItc_valortotal() {
        return itc_valortotal;
    }

    public void setItc_valortotal(double itc_valortotal) {
        this.itc_valortotal = itc_valortotal;
    }

    public double getCom_cod() {
        return com_cod;
    }

    public void setCom_cod(double com_cod) {
        this.com_cod = com_cod;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    
}
