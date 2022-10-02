package model;

import constants.Naipe;
import constants.Valor;

public class Carta {
    private Valor valor;
    private Naipe naipe;

    public Valor getValor() {
        return valor;
    }

    public void setValor(Valor valor) {
        this.valor = valor;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    public void setNaipe(Naipe naipe) {
        this.naipe = naipe;
    }

    @Override
    public String toString(){
        return this.valor + " de " + this.naipe;
    }
}
