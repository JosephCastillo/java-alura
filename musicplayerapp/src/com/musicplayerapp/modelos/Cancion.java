package com.musicplayerapp.modelos;

public class Cancion extends Audio {

    private String artista;
    private String nombreAlbum;
    private String genero;

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getNombreAlbum() {
        return nombreAlbum;
    }

    public void setNombreAlbum(String nombreAlbum) {
        this.nombreAlbum = nombreAlbum;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString(){
        return  "Título: " + getTitulo() +
                "\nArtista: " + getArtista() +
                "\nÁlbum: " + getNombreAlbum() +
                "\nGénero: " + getGenero() +
                "\nDuración: " + getDuracionMinutos() +
                "\nReproducciones: " + getTotalReproducciones() +
                "\nMe gusta: " + getTotalMeGusta() +
                "\nClasificación: " + getClasificacion() +
                "\n-----------------------------------";
    }

}
