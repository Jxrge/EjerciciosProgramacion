package com.ejerciciosprogramacion;



public class circulo {

    private double radio;
    private double PI=3.14;

    public Circulo(){

    }

    public Circulo(double r,double p){
        radio = r;
        PI=p;

    }

    public void setRadio(double r){

        radio = r;
    }

    public  double getRadio () {
        return radio;
    }

    public double calcularArea(){
        double area;
        area=Math.pow(radio,2)*PI;
        return area;

    }

    public double calcularLonxitude (){
        double lonxitude;
        lonxitude = 2*radio*Math.PI;
        return lonxitude;
    }


}
