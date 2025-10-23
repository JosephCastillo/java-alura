package com.musicplayerapp.calculos;

import com.musicplayerapp.modelos.Audio;

public class FiltroRecomendacion {

    public void filtrar(Audio audio){
        if(audio.getClasificacion() >= 4.5){
            System.out.println("==> " + audio.getTitulo() + " es Altamente recomendado.");
        } else if (audio.getClasificacion() >= 3.5){
            System.out.println("==> " + audio.getTitulo() + " tiene buena calificación.");
        } else {
            System.out.println("==> " + audio.getTitulo() + "no está siendo muy popular.");
        }
    }
}
