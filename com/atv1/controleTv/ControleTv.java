package com.atv1.controleTv;

/**
 * 
 */
public class ControleTv {

    private Integer canal = 0;
    private Integer volume = 0;

    /**
     * 
     * @return valor do canal
     */
    public Integer getCanal() {
        return this.canal;
    }

    /**
     * 
     * @param value - Valor do canal
     */
    public void setCanal(Integer value) {
        this.canal = value;
    }

    /**
     * getVolume
     * @return volume da tv [INTEIRO]
     */
    public Integer getVolume() {
        return this.volume;
    }

    public void aumentarVolume() {
        this.volume += 1;
    }

    public void diminuirVolume() {
        this.volume -= 1;
    }
}
