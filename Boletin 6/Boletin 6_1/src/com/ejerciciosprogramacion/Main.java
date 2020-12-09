package com.programacion.boletin 6_1;



public class boletin6_1 {

    public static void main(String[] args) {
        coche obxCoc1 = new coche ();
        obxCoc1.acelerar(50);
        obxCoc1.frenar(5);

        System.out.println("velocidade = " + obxCoc1.getVelocidade() + " KM/h");


    }
}