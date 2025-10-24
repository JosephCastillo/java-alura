package com.alura.screenmatch.principal;

import com.alura.screenmatch.exception.ErrorEnConversionDeDuracionException;
import com.alura.screenmatch.modelos.Titulo;
import com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalConBusqueda {
    public static void main(String[] args) throws IOException, InterruptedException {

        List<Titulo> miListaTitulos = new ArrayList<>();

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();

        while (true) {
            Scanner teclado = new Scanner(System.in);
            System.out.print("Escriba el nombre de la película: ");
            var busqueda = teclado.next();

            if (busqueda.equalsIgnoreCase("salir")) {
                break;
            }

            String direccion = "https://www.omdbapi.com/?t=" + busqueda + "&apikey=ad1f8862";
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println(json);


            TituloOmdb miTituloOmdb = gson.fromJson(json, TituloOmdb.class);
            System.out.println(miTituloOmdb);
            try {
                Titulo miTitulo = new Titulo(miTituloOmdb);
                System.out.println("Mi título ya convertido: " + miTitulo);

                miListaTitulos.add(miTitulo);

            } catch (NumberFormatException e) {
                System.out.println("Ha ocurrido un error...");
                System.out.println(e.getMessage());
            } catch (ErrorEnConversionDeDuracionException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(miListaTitulos);

        FileWriter escritura = new FileWriter("miListaTitulos.txt");
        escritura.write(gson.toJson(miListaTitulos));
        escritura.close();

        System.out.println("Finalizó la ejecución del programa.");
    }
}
