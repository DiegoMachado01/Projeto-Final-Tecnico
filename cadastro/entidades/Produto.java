/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro.entidades;

/**
 *
 * @author ADMIN
 */
public class Produto {

    private int prod_cod;
    private String prod_nome;
    private String prod_descricao;
    private double prod_valorcompra;
    private double prod_valorvenda;
    private byte[] prod_foto;
    private String prod_marca;
    private int idusuario;

    public Produto() {
    }

    public Produto(int prod_cod, String prod_nome, String prod_descricao, double prod_valorcompra, double prod_valorvenda, byte[] prod_foto, String prod_marca, int idusuario) {
        this.prod_cod = prod_cod;
        this.prod_nome = prod_nome;
        this.prod_descricao = prod_descricao;
        this.prod_valorcompra = prod_valorcompra;
        this.prod_valorvenda = prod_valorvenda;
        this.prod_foto = prod_foto;
        this.prod_marca = prod_marca;
        this.idusuario = idusuario;
    }

    public int getProd_cod() {
        return prod_cod;
    }

    public void setProd_cod(int prod_cod) {
        this.prod_cod = prod_cod;
    }

    public String getProd_nome() {
        return prod_nome;
    }

    public void setProd_nome(String prod_nome) {
        this.prod_nome = prod_nome;
    }

    public String getProd_descricao() {
        return prod_descricao;
    }

    public void setProd_descricao(String prod_descricao) {
        this.prod_descricao = prod_descricao;
    }

    public double getProd_valorcompra() {
        return prod_valorcompra;
    }

    public void setProd_valorcompra(double prod_valorcompra) {
        this.prod_valorcompra = prod_valorcompra;
    }

    public double getProd_valorvenda() {
        return prod_valorvenda;
    }

    public void setProd_valorvenda(double prod_valorvenda) {
        this.prod_valorvenda = prod_valorvenda;
    }

    public byte[] getProd_foto() {
        return prod_foto;
    }

    public void setProd_foto(byte[] prod_foto) {
        this.prod_foto = prod_foto;
    }

    public String getProd_marca() {
        return prod_marca;
    }

    public void setProd_marca(String prod_marca) {
        this.prod_marca = prod_marca;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    

}
