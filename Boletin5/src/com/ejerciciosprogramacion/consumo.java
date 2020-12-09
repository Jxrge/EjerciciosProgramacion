package com.programacion.boletin5;

public class consumo {
    private float kilometrosPercorridos;
    private float litrosConsumidos;
    private float velocidadMedia;
    private float prezoGasolina;
    private float tempo;


    public consumo () {

    }

    public consumo (float km, float litros, float vMed, float pGas, float t) {
        kilometrosPercorridos = km;
        litrosConsumidos = litros;
        velocidadMedia = vMed;
        prezoGasolina = pGas;
        tempo = t;

    }

    public float getTempo(){
        return tempo=kilometrosPercorridos/velocidadMedia;

    }

    public float consumoMedio () {
        return (litrosConsumidos * 100)/kilometrosPercorridos;
    }

    public double consumoEuros () {
        return consumoMedio() * prezoGasolina;

    }

    public void setKms (float km){
        kilometrosPercorridos = km;

    }

    public void setLitros (float litros) {
        litrosConsumidos = litros;

    }

    public void setvMed(float vMed) {
        velocidadMedia = vMed;

    }

    public float getvMed () {
        return velocidadMedia;

    }

    public void setPGas (float pGas) {
        prezoGasolina = pGas;

    }







}