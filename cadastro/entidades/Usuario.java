/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro.entidades;

public class Usuario {

    private int idusuario;
    private String nomeusuario;
    private String email;
    private String senha;
    private String permissoes;

    public Usuario() {
    }

    public Usuario(int idusuario, String nomeusuario, String email, String senha, String permissoes) {
        this.idusuario = idusuario;
        this.nomeusuario = nomeusuario;
        this.email = email;
        this.senha = senha;
        this.permissoes = permissoes;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getNomeusuario() {
        return nomeusuario;
    }

    public void setNomeusuario(String nomeusuario) {
        this.nomeusuario = nomeusuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPermissoes() {
        return permissoes;
    }

    public void setPermissoes(String permissoes) {
        this.permissoes = permissoes;
    }

}
