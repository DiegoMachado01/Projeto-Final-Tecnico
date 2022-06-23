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
public class Fornecedor {

    private int forn_cod;
    private String forn_cnpj;
    private String for_endereco;
    private String for_fone;
    private String for_cidade;
    private String for_estado;
    private int idusuario;

    public Fornecedor() {
    }

    public Fornecedor(int forn_cod, String forn_cnpj, String for_endereco, String for_fone, String for_cidade, String for_estado, int idusuario) {
        this.forn_cod = forn_cod;
        this.forn_cnpj = forn_cnpj;
        this.for_endereco = for_endereco;
        this.for_fone = for_fone;
        this.for_cidade = for_cidade;
        this.for_estado = for_estado;
        this.idusuario = idusuario;
    }

    public int getForn_cod() {
        return forn_cod;
    }

    public void setForn_cod(int forn_cod) {
        this.forn_cod = forn_cod;
    }

    public String getForn_cnpj() {
        return forn_cnpj;
    }

    public void setForn_cnpj(String forn_cnpj) {
        this.forn_cnpj = forn_cnpj;
    }

    public String getFor_endereco() {
        return for_endereco;
    }

    public void setFor_endereco(String for_endereco) {
        this.for_endereco = for_endereco;
    }

    public String getFor_fone() {
        return for_fone;
    }

    public void setFor_fone(String for_fone) {
        this.for_fone = for_fone;
    }

    public String getFor_cidade() {
        return for_cidade;
    }

    public void setFor_cidade(String for_cidade) {
        this.for_cidade = for_cidade;
    }

    public String getFor_estado() {
        return for_estado;
    }

    public void setFor_estado(String for_estado) {
        this.for_estado = for_estado;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }
    
}
    