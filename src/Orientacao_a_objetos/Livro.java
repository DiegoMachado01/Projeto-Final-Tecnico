/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Orientacao_a_objetos;

/**
 *
 * @author Diego
 */
public class Livro {

    private String Titulo;
    private String NomeLeitor;
    private float PaginasTotal;
    private float PaginasLidas;
    float Porcetagem;

    public void setTitulo(String titulo) {
        this.Titulo = titulo;
    }

    public Livro(String nomeLeitor) {
        this.NomeLeitor = nomeLeitor;
    }

    public Livro(float paginasLidas) {
        this.PaginasLidas = paginasLidas;
    }

    public void resultado() {
        this.Porcetagem = (this.PaginasLidas / this.PaginasTotal) * 100;
        System.out.printf("Porcetagem de paginas lidas: %.2f", this.Porcetagem);

    }

    public void setNomeLeitor(String NomeLeitor) {
        this.NomeLeitor = NomeLeitor;
    }

    public void setPaginasTotal(float PaginasTotal) {
        this.PaginasTotal = PaginasTotal;
    }

    public void setPaginasLidas(float PaginasLidas) {
        this.PaginasLidas = PaginasLidas;
    }

    public void setPorcetagem(float Porcetagem) {
        this.Porcetagem = Porcetagem;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getNomeLeitor() {
        return NomeLeitor;
    }

    public float getPaginasTotal() {
        return PaginasTotal;
    }

    public float getPaginasLidas() {
        return PaginasLidas;
    }

    public float getPorcetagem() {
        return Porcetagem;
    }
    
}
