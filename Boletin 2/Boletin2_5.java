
package boletin2_5;

import java.util.Scanner;

public class Boletin2_5 {

    public static void main(String[] args) {
   Scanner sc = new Scanner (System.in);
   float millas;
   final int CAMBIO=1852;
   System.out.println("Teclea las millas marinas");
   millas=sc.nextFloat ();
   System.out.println(millas*1852+"metros");
    }
    
}
