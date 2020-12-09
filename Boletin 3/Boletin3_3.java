package boletin3_3;

import java.util.Scanner;

public class Boletin3_3 {

    public static void main(String[] args) {
        int b100,b20,b5,m1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Teclea b100");
        b100=sc.nextInt();
        System.out.println("Teclea b20");
        b20=sc.nextInt();
        System.out.println("Teclea b20");
        b5=sc.nextInt();
        System.out.println("Teclea m1");
        m1=sc.nextInt();
        System.out.println((b100*100+b20*20+b5*5+m1*1));
    }

}