package com.musicplayerapp.modelos;

public class Audio {

    private String titulo;
    private double duracionMinutos;
    private int totalReproducciones;
    private int totalMeGusta;
    private double clasificacion;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(double duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public int getTotalReproducciones() {
        return totalReproducciones;
    }


    public int getTotalMeGusta() {
        return totalMeGusta;
    }

    public void setClasificacion(double clasificacion){
        this.clasificacion = clasificacion;
    }

    public double getClasificacion() {
        return clasificacion;
    }

    public void reproducir(){
        totalReproducciones++;
    }

    public void darMeGusta(){
        totalMeGusta++;
    }

    @Override
    public String toString(){
        return  "------------------------------------" +
                "Título: " + titulo +
                ", Duración: " + duracionMinutos +
                ", Reproducciones: " + totalReproducciones +
                ", Me gusta: " + totalMeGusta +
                ", Clasificación " + clasificacion +
                "------------------------------------";
    }
}
