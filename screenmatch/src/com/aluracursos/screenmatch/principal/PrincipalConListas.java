package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalConListas {
    public static void main(String[] args) {

        Pelicula miPelicula =  new Pelicula("Encanto", 2021);
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("Matrix", 1998);
        otraPelicula.evalua(6);
        var peliculaDeJoseph = new Pelicula("UP", 2009);
        peliculaDeJoseph.evalua(10);
        Serie lost = new Serie("Lost", 2000);


        ArrayList<Titulo> lista = new ArrayList<>();

        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(peliculaDeJoseph);
        lista.add(lost);

        for (Titulo item : lista){
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 2) {
                System.out.println(pelicula.getClasificacion());
            }
        }

        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Shakira");
        listaDeArtistas.add("Fonseca");
        listaDeArtistas.add("Juanes");

        Collections.sort(listaDeArtistas);
        System.out.println("Lista de artistas ordenada" + listaDeArtistas);

        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("Lista ordenada por fecha: " + lista);

    }
}
