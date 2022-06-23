/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro.entidades;

import java.util.Date;

/**
 *
 * @author ivan
 */
public class Venda {
    
    private int venda_cod;
    private Date  venda_data;
    private double venda_total;
    private int venda_status;
    private int idusuario;

    public Venda() {
    }

    public Venda(int venda_cod, Date venda_data, double venda_total, int venda_status, int idusuario) {
        this.venda_cod = venda_cod;
        this.venda_data = venda_data;
        this.venda_total = venda_total;
        this.venda_status = venda_status;
        this.idusuario = idusuario;
    }

    public int getVenda_cod() {
        return venda_cod;
    }

    public void setVenda_cod(int venda_cod) {
        this.venda_cod = venda_cod;
    }

    public Date getVenda_data() {
        return venda_data;
    }

    public void setVenda_data(Date venda_data) {
        this.venda_data = venda_data;
    }

    public double getVenda_total() {
        return venda_total;
    }

    public void setVenda_total(double venda_total) {
        this.venda_total = venda_total;
    }

    public int getVenda_status() {
        return venda_status;
    }

    public void setVenda_status(int venda_status) {
        this.venda_status = venda_status;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

  
}
