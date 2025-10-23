package com.musicplayerapp.modelos;

public class Podcast extends Audio {
    private String presentador;
    private String descripcion;
    private int episodio;

    public String getPresentador() {
        return presentador;
    }

    public void setPresentador(String presentador) {
        this.presentador = presentador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getEpisodio() {
        return episodio;
    }

    public void setEpisodio(int episodio) {
        this.episodio = episodio;
    }

    @Override
    public String toString() {
        return  "------------------------------------" +
                "\nPodcast: " + getTitulo() +
                "\nPresentador: " + getPresentador() +
                "\nEpisodio: " + getEpisodio() +
                "\nDescripción: " + getDescripcion() +
                "\nDuración: " + getDuracionMinutos() + " min" +
                "\nReproducciones: " + getTotalReproducciones() +
                "\nMe gusta: " + getTotalMeGusta() +
                "\nClasificación: " + getClasificacion() +
                "\n-----------------------------------";
    }
}
