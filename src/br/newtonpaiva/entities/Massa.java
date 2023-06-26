package br.newtonpaiva.entities;

public class Massa {
    public String massa;

    public Double valor;

    public Massa(){

    }

    public Massa(String massa, Double valor) {
        this.massa = massa;
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getMassa() {
        return massa;
    }

    public void setMassa(String massa) {
        this.massa = massa;
    }
}
