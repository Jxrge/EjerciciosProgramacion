package com.programacion.boletin04;

public class boletin04 {



    public static void main(String[] args) {

        Libro obxLib1 = new Libro();
        obxLib1.amosar();

        Libro obxLib2 = new Libro("Tonecho", "Breogán Riveiro", 200, (short) 2005, 9.5f);
        obxLib2.amosar();
    }

    public static class libro {
    }
}