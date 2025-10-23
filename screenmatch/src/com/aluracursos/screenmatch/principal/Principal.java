package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Pelicula miPelicula =  new Pelicula("Encanto", 2021);


        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();

        miPelicula.evalua(5.1);
        miPelicula.evalua(6.1);
        miPelicula.evalua(7.1);


        System.out.println("Total evaluaciones: " + miPelicula.getTotalDeLasEvaluaciones());
        System.out.println("Media evaluacioens: " + miPelicula.calculaMedia());
        System.out.println("Nombre: " + miPelicula.getNombre());


        Serie casaDragon = new Serie("La casa del dragon", 2022);

        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodios(50);
        casaDragon.setEpisodiosPorTemporada(10);

        Pelicula otraPelicula = new Pelicula("Matrix", 1998);

        otraPelicula.setDuracionEnMinutos(180);


        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());


        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();

        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println(calculadora.getTiempoTotal());


        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);
        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa Targaryen");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(300);


        filtroRecomendacion.filtra(episodio);

        var peliculaDeJoseph = new Pelicula("UP", 2009);
        peliculaDeJoseph.setDuracionEnMinutos(95);

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();

        listaDePeliculas.add(peliculaDeJoseph);
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otraPelicula);

        System.out.println(listaDePeliculas.size());
        System.out.println(listaDePeliculas);
        System.out.println("toString de la película: " +  listaDePeliculas.get(0).toString());








    }
}
