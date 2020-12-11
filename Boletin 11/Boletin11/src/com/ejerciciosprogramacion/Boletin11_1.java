package com.ejerciciosprogramacion;

import javax.swing.*;

public class Ej1 {

    private int intentos;
    private int respuesta;
    private int num;

    public void establecerJuego(){
        boolean correcto = false;
        do{
            num= Integer.parseInt(JOptionPane.showInputDialog("Introducir un número entre o 1 e o 50:"));
            if(num > 0 && num <= 50){
                correcto = true;
            }
            else{
                JOptionPane.showMessageDialog(null, "Ese número non é válido, introduce outro diferente");
            }
        }while(correcto == false);
        intentos = Integer.parseInt(JOptionPane.showInputDialog("Introduce o número de intentos do xogo:"));
    }

    public void iniciarJuego(){
        this.establecerJuego();
        for(int i= 0; i < intentos; i++){
            respuesta = Integer.parseInt(JOptionPane.showInputDialog("Adiviña un número entre o 1 e o 50:"));
            if(respuesta > num){
                JOptionPane.showMessageDialog(null, "O número é menor");
            }
            else if(respuesta < num){
                JOptionPane.showMessageDialog(null, "O número é maior");
            }
            else{
                JOptionPane.showMessageDialog(null, "Resposta correcta");
                break;
            }
        }
        JOptionPane.showMessageDialog(null, "Termináronse os intentos");
    }
}
