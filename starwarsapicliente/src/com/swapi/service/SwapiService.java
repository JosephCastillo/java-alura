package com.swapi.service;

import com.google.gson.Gson;
import com.swapi.model.Film;
import com.swapi.utils.HttpClientUtil;

import java.io.IOException;

public class SwapiService {
    private static final String URL_PELICULAS = "https://swapi.dev/api/films/";
    private final Gson gson = new Gson();

    public Film[] obtenerPeliculas() throws IOException {
        String jsonRespuesta = HttpClientUtil.obtener(URL_PELICULAS);

        ContenedorPeliculas contenedor = gson.fromJson(jsonRespuesta, ContenedorPeliculas.class);

        return contenedor.results();

    }
    private  record ContenedorPeliculas(Film[] results){ }
}
