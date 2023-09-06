package com.atv1.retangulo;

public class Retangulo {
    private Integer base;
    private Integer altura;

    public Integer getBase() {
        return this.base;
    }

    public void setBase(Integer value) {
        this.base = value;
    }
    
    public Integer getAltura() {
        return this.altura;
    }

    public void setAltura(Integer value) {
        this.altura = value;
    }

    public Integer calcularArea() {
        return this.base * this.altura;
    }

    public Integer calcularPerimetro() {
        return 2 * (this.base + this.altura);
    }
}
