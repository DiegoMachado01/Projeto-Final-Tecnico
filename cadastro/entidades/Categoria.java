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
public class Categoria {
    
    private int cat_cod;
    private String cat_nome;

    public Categoria() {
    }

    public Categoria(int cat_cod, String cat_nome) {
        this.cat_cod = cat_cod;
        this.cat_nome = cat_nome;
    }

    public int getCat_cod() {
        return cat_cod;
    }

    public void setCat_cod(int cat_cod) {
        this.cat_cod = cat_cod;
    }

    public String getCat_nome() {
        return cat_nome;
    }

    public void setCat_nome(String cat_nome) {
        this.cat_nome = cat_nome;
    }
   
}
