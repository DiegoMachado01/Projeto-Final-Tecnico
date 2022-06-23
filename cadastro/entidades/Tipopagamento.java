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
public class Tipopagamento {

    private int tpa_cod;
    private String tpa_nome;
    private int idusuario;

    public Tipopagamento() {
    }

    public Tipopagamento(int tpa_cod, String tpa_nome, int idusuario) {
        this.tpa_cod = tpa_cod;
        this.tpa_nome = tpa_nome;
        this.idusuario = idusuario;
    }

    public int getTpa_cod() {
        return tpa_cod;
    }

    public void setTpa_cod(int tpa_cod) {
        this.tpa_cod = tpa_cod;
    }

    public String getTpa_nome() {
        return tpa_nome;
    }

    public void setTpa_nome(String tpa_nome) {
        this.tpa_nome = tpa_nome;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    
}
