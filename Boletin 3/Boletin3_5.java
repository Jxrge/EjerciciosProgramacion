
package boletin3_5;

import java.util.Scanner;

public class Boletin3_5 {

   
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float bruto,fixo,liquido,quilometraxe,comision,dieta;
        System.out.println("Introduce o soldo fixo");
        fixo=sc.nextFloat ();
        System.out.println("Introduce o total de ventas");
        comision=sc.nextFloat ();
        System.out.println("Introduce o quilometraxe");
        quilometraxe=sc.nextFloat ();
        System.out.println("Introduce os días desplazados");
        dieta=sc.nextFloat();
        bruto = fixo+quilometraxe*2+comision*5/100+dieta*30;
        System.out.println("o soldo fixo e " + bruto + "euros");
        liquido=(float) (0.82*bruto-36);
        System.out.println("o soldo liquido e " + liquido + "euros");
                }
    
}
