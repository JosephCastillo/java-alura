import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Escribe la nota que le darías a la película UP");
            nota = teclado.nextDouble();
            mediaEvaluaciones = mediaEvaluaciones + nota;
        }
        System.out.println("La media de evaluaciones para Matrix es: "  + mediaEvaluaciones / 3);
    }

    public static class Main {
        public static void main(String[] args) {
            System.out.println("Bienvenido a Joseph's movies");
            System.out.println("Película: Matrix");

            int fechaDeLanzamiento = 1999;
            boolean incluidoEnElPlan = true;
            double notaDeLaPelicula = 8.2;

            double media = (8.3 + 6.5 + 9.9 + 7.6) / 4;
            System.out.println(media);

            String sinopsis = """
                    Matrix es una paradoja
                    La mejor película del fin del milenio
                    Fué lanzada  en: 
                    """ + fechaDeLanzamiento;
            System.out.println(sinopsis);
            int clasificacion = (int) notaDeLaPelicula / 2;
            System.out.println(clasificacion);
        }
    }
}
