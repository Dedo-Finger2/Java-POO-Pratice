package com;
import com.atv1.bola.*;
import com.atv1.quadrado.*;
import com.atv1.retangulo.*;
import com.atv1.controleTv.*;

public class MainAtv1 {
    public static void main(String[] args) {
        Bola testeBola = new Bola();
        testeBola.setCor("Vermelho");
        System.out.println(testeBola.getCor());

        // ------------------------------------
        System.out.println("\nQuadrado");
        // ------------------------------------

        Quadrado testeQuadrado = new Quadrado();
        testeQuadrado.setLado(5);
        System.out.println(testeQuadrado.getLado());
        System.out.println("Área: " + testeQuadrado.calcularArea());

        // ------------------------------------
        System.out.println("\nRetangulo");
        // ------------------------------------

        Retangulo testeRetangulo = new Retangulo();
        testeRetangulo.setBase(5);
        testeRetangulo.setAltura(2);
        System.out.println("Área: " + testeRetangulo.calcularArea());
        System.out.println("Períemtro: " + testeRetangulo.calcularPerimetro());

        // ------------------------------------
        System.out.println("\nControleTV");
        // ------------------------------------

        ControleTv testeControleTv = new ControleTv();
        testeControleTv.setCanal(5);
        System.out.println("Canal: " + testeControleTv.getCanal());
        testeControleTv.aumentarVolume();
        System.out.println("Volume: " + testeControleTv.getVolume());
        testeControleTv.diminuirVolume();
        System.out.println("Volume: " + testeControleTv.getVolume());
    }
}
