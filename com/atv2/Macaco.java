package com.atv2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Macaco {
    public String nome;
    private List<String> estomago;
    private Scanner input;

    /**
     * Construtor
     * @param nome - Nome do macaco
     */
    public Macaco(String nome) {
        this.input = new Scanner(System.in);

        while (nome.isEmpty()) {
            System.out.println("\nERRO! Digite algum nome para o macaco");
            nome = input.next();
        }

        this.nome = nome;
        this.estomago = new ArrayList<String>();
    }

    /**
     * comer - Método responsável por adicionar um alimento no estomago do macaco
     * @param alimento - Nome do alimento
     */
    public void comer(String alimento) {
        while (alimento.isBlank()) {
            System.out.println("\nDigite um nome válido para um alimento:");
            alimento = input.next();
        }

        this.estomago.add(alimento);
        System.out.println("\n" + this.nome + " comeu um(a) " + alimento + ".");
    }

    /**
     * verEstomago - Método responsável por retornar a visuzalização do estmoago do macaco
     * @return
     */
    public List<String> verEstomago() {
        if (this.estomago.isEmpty()) {
            System.out.println("\nOps... Estomago vazio!");
            return this.estomago;
        } else {
            return this.estomago;
        }
    }

    /**
     * digerir - método responsável por limpar o estomado do macaco
     */
    public void digerir() {
        if (this.estomago.isEmpty()) {
            System.out.println("\nNao há nada para digerir no momento.");
        } else {
            this.estomago.clear();
            System.out.println("\n" + this.nome + " digeriu todos os alimentos em seu estomago!");
        }
    }
}
