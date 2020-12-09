package boletin3_1;

import java.util.Scanner;

public class Boletin3_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float precioPagado, precioTotal;
        System.out.println("Teclea el precio total");
        precioTotal=sc.nextFloat();
        System.out.println("Teclea el precio pagado");
        precioPagado=sc.nextFloat();
        System.out.println("Porcentaje descuento"+((1-precioPagado/precioTotal)*100));
    }

}
