/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Orientacao_a_objetos;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Excercicio {

    public static void main(String[] args) {

        //variaveis
        Scanner scan = new Scanner(System.in);
        String nome;
        String sobreNome;
        String cidade;
        String estado;
        float horasTrabalhadas;
        float valorHora;
        int escolha = 0;
        float valor;

        //lendo variaveis
        System.out.println("Digite o nome:");
        nome = scan.nextLine();
        System.out.println("Digite o sobrenome");
        sobreNome = scan.nextLine();
        System.out.println("Digite a cidade:");
        cidade = scan.nextLine();
        System.out.println("Digite o estado:");
        estado = scan.nextLine();
        System.out.println("Digite as horas trabalhadas");
        horasTrabalhadas = scan.nextFloat();
        System.out.println("Digite o valor da hora trabalhada:");
        valorHora = scan.nextFloat();

        //criando o funcionario da classe funcionario, utilizando o construtor com valores
        Funcionario funcionario1 = new Funcionario(nome, sobreNome, cidade, estado, horasTrabalhadas, valorHora);

        //usando o metodo para retornar o nome
        funcionario1.retornarNome();

        //while para fechar o programa quando escolher 4
        while (escolha != 4) {
            //Printando opções para o usuário e lendo escolha
            System.out.println("Digite 1 para incrementar a quantidades de horas digitas \nDigite 2 para substituir o valor da hora do funcionario \nDigite 3 para calcular o valor do salario funcionario\nDigite 4 para sair");
            escolha = scan.nextInt();

            //if's conforme escolha, puxando o metodo correspondente.
            if (escolha == 1) {
                System.out.println("Digite o número de horas para incrementar:");
                valor = scan.nextFloat();
                funcionario1.adicionarHoras(valor);
                System.out.println("Horas acumuladas: " + funcionario1.getHorasTrabalhadas());
            }
            if (escolha == 2) {
                System.out.println("Digite o novo valor das horas");
                valor = scan.nextInt();
                funcionario1.valorPorHora(valor);
            }
            if (escolha == 3) {
                funcionario1.calculoSalario();
                
                
            }
        }
    }
}


