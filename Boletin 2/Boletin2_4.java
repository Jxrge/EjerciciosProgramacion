package boletin2_4;

import java.util.Scanner;

public class Boletin2_4 {


    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      float primero, segundo;
      System.out.println("Escribe un numero: ");
      primero= sc.nextFloat();
      System.out.println("Escribe un segundo numero: ");
      segundo= sc.nextFloat();
      System.out.println("La suma de "+ primero +" y "+ segundo+" = "+ (primero+segundo));
      System.out.println("La resta de "+ primero +"y"+ segundo+" = "+ (primero-segundo));
      System.out.println("El producto de "+ primero +"y"+ segundo+" = "+ (primero*segundo));
      System.out.println("El cocinte de "+ primero +"y"+ segundo+" = "+ (primero/segundo));
    }

}