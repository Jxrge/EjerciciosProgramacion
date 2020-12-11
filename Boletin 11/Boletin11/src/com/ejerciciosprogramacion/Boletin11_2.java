package com.ejerciciosprogramacion;

import javax.swing.*;
import java.util.Random;

public class Boletin11_2 {
    public void iniciarJuego(){
        Random aleatorio= new Random();
        int num= 1+aleatorio.nextInt(50);
        int intentos= Integer.parseInt(JOptionPane.showInputDialog("Introduce o número de intentos do xogo:"));
        for(int i= 0; i < intentos; i++){
            int respuesta= Integer.parseInt(JOptionPane.showInputDialog("Adiviña un número entre o 1 e o 50:"));
            if(respuesta == num){
                JOptionPane.showMessageDialog(null, "Resposta correcta");
                break;
            }
            else if(Math.abs(num-respuesta) <= 5){
                JOptionPane.showMessageDialog(null, "Moi cerca");
            }
            else if(Math.abs(num-respuesta) <= 10){
                JOptionPane.showMessageDialog(null, "Cerca");
            }
            else if(Math.abs(num-respuesta) <= 20){
                JOptionPane.showMessageDialog(null, "Lexos");
            }
            else if(Math.abs(num-respuesta) > 20){
                JOptionPane.showMessageDialog(null, "Moi lexos");
            }
        }
        JOptionPane.showMessageDialog(null, "Termináronse os intentos");
    }
}