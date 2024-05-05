package com.marcello.calculadoraapi.model;

public class Calculadora {
    private float numero1;
    private float numero2;
    private float somar;
    private float subtrair;
    private float multiplicar;
    private float dividir;

    public Calculadora(float numero1, float numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public float getNumero1() {
        return numero1;
    }

    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

    public float getNumero2() {
        return numero2;
    }

    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }


    public float somar() {
       return somar = getNumero1() + getNumero2();

    }

    public float subtrair() {
        return subtrair = getNumero1() - getNumero2();
    }

    public float multiplicar() {
       return multiplicar = getNumero1() * getNumero2();

    }

    public float dividir() {
        return dividir = getNumero1() / getNumero2();

    }

}
