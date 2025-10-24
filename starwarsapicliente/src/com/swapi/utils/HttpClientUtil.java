package com.swapi.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpClientUtil {
    public static String obtener(String urlTexto) throws IOException{
        StringBuilder respuesta = new StringBuilder();

        URL url = new URL(urlTexto);

        HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
        conexion.setRequestMethod("GET");

        int codigoRespuesta = conexion.getResponseCode();
        if (codigoRespuesta != HttpURLConnection.HTTP_OK){
            throw new IOException("Error en la petición. Código HTTP: " + codigoRespuesta);
        }

        BufferedReader lector = new BufferedReader(
                new InputStreamReader(conexion.getInputStream())
        );

        String linea;
        while ((linea = lector.readLine()) != null){
            respuesta.append(linea);
        }
        lector.close();
        conexion.disconnect();
        return respuesta.toString();
    }
}
