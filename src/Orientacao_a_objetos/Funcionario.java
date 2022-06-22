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
public class Funcionario {

    //atributos funcionario
    private String nome;
    private String sobreNome;
    private String cidade;
    private String estado;
    private float horasTrabalhadas;
    private float valorHora;
    private float salario;

    //construtor default
    Funcionario() {
    }

    public Funcionario(String nome, String sobreNome, String cidade, String estado, float horasTrabalhadas, float valorHora, float salario) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.cidade = cidade;
        this.estado = estado;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
        this.salario = salario;
    }

    Funcionario(String nome, String sobreNome, String cidade, String estado, float horasTrabalhadas, float valorHora) {
       
    }

    //get para pegar o valor das horas trabalhadas
    public float getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    //método para retornar nome
    public void retornarNome() {
        System.out.println(this.nome + " " + this.sobreNome);
    }

    //metodo para adicionar horas trabalhadas
    public void adicionarHoras(float horas) {
        this.horasTrabalhadas += horas;
        System.out.println("Horas adicionadas");
    }

    //metodo para alterar o valor por hora trabalhada
    public void valorPorHora(float valor) {
        this.valorHora = valor;
        System.out.println("O valor por hora é:" + valorHora);
    }
    
//metodo para calcular salario
    public void calculoSalario(){
        this.salario = this.valorHora * this.horasTrabalhadas;
        System.out.println("Salario: " + salario);
    }
}