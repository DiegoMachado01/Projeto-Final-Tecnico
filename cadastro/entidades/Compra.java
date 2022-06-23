/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro.entidades;

import java.util.Date;
import java.util.ArrayList;

public class Compra {

    private int com_cod;
    private Date com_data;
    private int com_total;
    private int com_status;
    private int idusuario;
    private ArrayList <Itemcompra>itenscompra;

    public Compra(int com_cod, Date com_data, int com_total, int com_status, int idusuario, ArrayList<Itemcompra> itenscompra) {
        this.com_cod = com_cod;
        this.com_data = com_data;
        this.com_total = com_total;
        this.com_status = com_status;
        this.idusuario = idusuario;
        this.itenscompra = itenscompra;
    }

    public int getCom_cod() {
        return com_cod;
    }

    public void setCom_cod(int com_cod) {
        this.com_cod = com_cod;
    }

    public Date getCom_data() {
        return com_data;
    }

    public void setCom_data(Date com_data) {
        this.com_data = com_data;
    }

    public int getCom_total() {
        return com_total;
    }

    public void setCom_total(int com_total) {
        this.com_total = com_total;
    }

    public int getCom_status() {
        return com_status;
    }

    public void setCom_status(int com_status) {
        this.com_status = com_status;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public ArrayList<Itemcompra> getItenscompra() {
        return itenscompra;
    }

    public void setItenscompra(ArrayList<Itemcompra> itenscompra) {
        this.itenscompra = itenscompra;
    }
    

    public Compra() {
    }

    public int getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setId(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


 

}