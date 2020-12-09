package com.programacion.boletin5;

public class boletin05 {
    public static void main(String[] args) {
        consumo obxCon1 = new consumo ();

        obxCon1.setLitros(50);
        obxCon1.setPGas(1.57f);

        consumo obxCon2 = new consumo (250,18, 80,(float) 1.2, 3);


        System.out.println("Consumo Medio =" + obxCon2.consumoMedio());
        System.out.println("Consumo Euros =" + obxCon2.consumoEuros());
        System.out.println("Velocidad Media =" + obxCon2.getvMed());
    }
}
