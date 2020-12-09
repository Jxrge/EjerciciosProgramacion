package com.programacion.boletin04;

class Libro {
    private String titulo,autor;
    private int ano;
    private short numPaginas;
    private float valoracion;

    public Libro () {

    }

    public Libro (String t,String au, int an, short num, float va){
        titulo = t;
        autor = au;
        ano = an;
        numPaginas = num;
        valoracion = va;
    }



    public void setTitulo(String t){
        titulo = t;
    }

    public String getTitulo(){
        return titulo;

    }

    public void setAutor(String au){
        autor = au;
    }

    public String getAutor(){
        return autor;

    }

    public void setAno(int an){
        ano = an;
    }

    public int getAno(){
        return ano;

    }

    public void setNumPaginas(short num){
        numPaginas = num;
    }

    public short getNumPaginas(){
        return numPaginas;

    }

    public void setValoracion(float va){
        valoracion = va;
    }

    public float getValoracion(){
        return valoracion;

    }

    public void amosar(){
        System.out.println("Titulo =" + titulo + "\n Autor =" + autor + "\n Ano =" + ano + "\n Nº Paginas =" + numPaginas + "\n Valoracion =" + valoracion);




    }
}