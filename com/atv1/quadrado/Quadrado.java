package com.atv1.quadrado;
import java.lang.Math;

public class Quadrado {
    private Integer lado;

    public Integer getLado() {
        return this.lado;
    }

    public void setLado(Integer value) {
        this.lado = value;
    }

    public Double calcularArea() {
        return Math.pow(this.lado, 2);
    }
}
