import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.swapi.model.Film;
import com.swapi.service.SwapiService;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        SwapiService servicio = new SwapiService();

        try (Scanner entrada = new Scanner(System.in)) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            System.out.println("Bienvenido al cliente SWAOI de Star Wars");
            System.out.println("Obteniendo lista de peliculas");
            Film[] peliculas = servicio.obtenerPeliculas();

            for (int i = 0; i < peliculas.length; i++) {
                System.out.println((i + 1) + ". " + peliculas[i].title());
            }

            System.out.println("\nIngrese el número de la película que sea consultar: ");
            int opcion = entrada.nextInt();

            if (opcion < 1 || opcion > peliculas.length) {
                System.out.println("Opción no válida. Debe elegir entre 1 y " + peliculas.length);
                return;
            }

            Film peliculaSeleccionada = peliculas[opcion - 1];

            String nombreArchivo = peliculaSeleccionada.title()
                    .replace(" ", "_")
                    .toLowerCase() + ".json";

            try (FileWriter escritor = new FileWriter(nombreArchivo)) {
                gson.toJson(peliculaSeleccionada, escritor);
            }
            System.out.println("\n Archivo guardado exitosamente: " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al conectar con la API: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocurrió un error inesperado: " + e.getMessage());
        }
    }
}

