
package boletin3_4;

import java.util.Scanner;

public class Boletin3_4 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b100, b20 ,b5 , m1, cantidade_enteira, r1, r2;
        System.out.println("Teclea a cantidade enteira");
        cantidade_enteira =sc.nextInt();
        b100 = cantidade_enteira / 100;
        r1 = cantidade_enteira % 100;
        b20 = r1/20;
        r2 = r1%20;
        b5 = r2 / 5;
        m1 = r2 % 5 ;
        System.out.println(" \n billetes de 100= " + b100 + " \n billetes de 20 = " + b20 + " \n billetes de cinco = " +b5 + " \n monedas de un euro = " + m1);
    }
    
}
