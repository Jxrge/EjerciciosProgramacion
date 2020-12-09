package com.ejerciciosprogramacion;

import javax.swing.*;

public class Figuras {

    private final float Pi = (float) 3.14;
    float cadrado;
    float triangulo;
    float circulo;

    public void Superficie(int seleccion){

        switch (seleccion) {
            case 1 -> {

                float base = Integer.parseInt(JOptionPane.showInputDialog("Introduce a base da figura"));
                float altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce a altura da figura (Se a tes)"));
                cadrado = altura * base;
                System.out.println("A área do teu cadrado é: "+cadrado);
                break;
            }
            case 2 ->  {

                float base = Integer.parseInt(JOptionPane.showInputDialog("Introduce a base da figura"));
                float altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce a altura da figura (Se a tes)"));
                triangulo = (altura * base)/2;
                System.out.println("A área do teu triángulo é: "+triangulo);
                break;
            }
            case 3 ->  {

                float radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce o radio da  figura"));
                circulo = (float) (Pi * Math.pow(radio,2));
                System.out.println("A área do  círculo é: "+circulo);
                break;
            }
            default -> System.out.println("Non é válido");
        }
    }
}
