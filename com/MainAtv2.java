package com;

import com.atv2.Funcionario;
import com.atv2.Macaco;

public class MainAtv2 {
    public static void main(String[] args) {
        // FUNCIONARIO ------------------------------------------------------------------------------------
        Funcionario funcionarioTeste = new Funcionario("Leone");
        funcionarioTeste.getNome();
        funcionarioTeste.setSalario(2.0);
        funcionarioTeste.aumentarSalario(50);
        // FUNCIONARIO ------------------------------------------------------------------------------------

        System.out.println("\n--------------------------------------------------------------\n");

        // MACACO ------------------------------------------------------------------------------------
        Macaco macacoPrego = new Macaco("");

        System.out.println(macacoPrego.verEstomago());
        macacoPrego.digerir();

        macacoPrego.comer("Banana");
        System.out.println(macacoPrego.verEstomago());
        macacoPrego.digerir();

        System.out.println(macacoPrego.verEstomago());
        // MACACO ------------------------------------------------------------------------------------
    }
}
