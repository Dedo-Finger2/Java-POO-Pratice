package com.atv2;
import java.util.Scanner;

public class Funcionario {
    private String nome;
    private Double salario;
    private Scanner input;

    /**
     * Construtor
     * 
     * @param nome - Nome do funcionário
     */
    public Funcionario(String nome) {
        this.nome = nome;
        this.input = new Scanner(System.in);
    }

    public String getNome() {
        return this.nome;
    }

    public void setSalario(Double salario) {
        this.salario = recusarNegativos(salario);
    }

    public void aumentarSalario(Integer percentualDeAumento) {
        while (percentualDeAumento <= 0) {
            System.out.println("Forneça um percentual válido:");
            percentualDeAumento = input.nextInt();
        }

        this.salario += ((this.salario * percentualDeAumento) / 100);
        System.out.println("Novo salário: " + this.salario + "0. Um aumento de " + percentualDeAumento + "%!");
    }

    private Double recusarNegativos(Double valor) {
        while (valor <= 0) {
            System.out.println("ERRO! Digite um valor acima de 0:");
            valor = input.nextDouble();
        }

        return valor;
    }

}
