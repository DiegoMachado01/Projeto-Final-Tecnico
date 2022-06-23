/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro.entidades;

import java.util.Date;

public class Cliente {

    private int cli_cod;
    private String cli_nome;
    private String cli_cpfcnpj;
    private String cli_endereco;
    private String cli_bairro;
    private String cli_cel;
    private String cli_email;
    private String cli_cidade;
    private int idusuario;

    public Cliente() {
    }

    public Cliente(int cli_cod, String cli_nome, String cli_cpfcnpj, String cli_endereco, String cli_bairro, String cli_cel, String cli_email, String cli_cidade, int idusuario) {
        this.cli_cod = cli_cod;
        this.cli_nome = cli_nome;
        this.cli_cpfcnpj = cli_cpfcnpj;
        this.cli_endereco = cli_endereco;
        this.cli_bairro = cli_bairro;
        this.cli_cel = cli_cel;
        this.cli_email = cli_email;
        this.cli_cidade = cli_cidade;
        this.idusuario = idusuario;
    }

    public int getCli_cod() {
        return cli_cod;
    }

    public void setCli_cod(int cli_cod) {
        this.cli_cod = cli_cod;
    }

    public String getCli_nome() {
        return cli_nome;
    }

    public void setCli_nome(String cli_nome) {
        this.cli_nome = cli_nome;
    }

    public String getCli_cpfcnpj() {
        return cli_cpfcnpj;
    }

    public void setCli_cpfcnpj(String cli_cpfcnpj) {
        this.cli_cpfcnpj = cli_cpfcnpj;
    }

    public String getCli_endereco() {
        return cli_endereco;
    }

    public void setCli_endereco(String cli_endereco) {
        this.cli_endereco = cli_endereco;
    }

    public String getCli_bairro() {
        return cli_bairro;
    }

    public void setCli_bairro(String cli_bairro) {
        this.cli_bairro = cli_bairro;
    }

    public String getCli_cel() {
        return cli_cel;
    }

    public void setCli_cel(String cli_cel) {
        this.cli_cel = cli_cel;
    }

    public String getCli_email() {
        return cli_email;
    }

    public void setCli_email(String cli_email) {
        this.cli_email = cli_email;
    }

    public String getCli_cidade() {
        return cli_cidade;
    }

    public void setCli_cidade(String cli_cidade) {
        this.cli_cidade = cli_cidade;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

}