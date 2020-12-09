package com.ejerciciosprogramacion;

import javax.swing.JOptionPane;

public class Clase {
    int numero;

    public void tabla(){
        numero =(int) Float.parseFloat(JOptionPane.showInputDialog("teclea o numero "));
        while(numero > 0 ){
            System.out.println(numero + "x" + 1 + "______=" + numero*1 );
            System.out.println(numero + "x" + 2 + "______=" + numero*2 );
            System.out.println(numero + "x" + 3 + "______=" + numero*3 );
            System.out.println(numero + "x" + 4 + "______=" + numero*4 );
            System.out.println(numero + "x" + 5 + "______=" + numero*5 );
            System.out.println(numero + "x" + 6 + "______=" + numero*6 );
            System.out.println(numero + "x" + 7 + "______=" + numero*7 );
            System.out.println(numero + "x" + 8 + "______=" + numero*8 );
            System.out.println(numero + "x" + 9 + "______=" + numero*9 );
            System.out.println(numero + "x" + 10 + "______=" + numero*10 );
            numero =(int) Float.parseFloat(JOptionPane.showInputDialog("teclea o  numero "));
        }
        System.out.println("saimos do bucle");

    }

}