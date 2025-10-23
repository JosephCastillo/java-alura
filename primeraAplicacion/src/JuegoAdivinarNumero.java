import java.util.Scanner;

public class JuegoAdivinarNumero {
    public static void main(String[] args) {

        int contadorIntentos = 1;
        int numeroAleatorio;
        int numeroUsuario = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("----------------------------------------------------------------------");
        System.out.println("Intenta adivinar el número del 1 al 100. Generado de forma aleatoria");
        System.out.println("----------------------------------------------------------------------");

        System.out.println(" ");

        // Generamos y asignamos el número random del 1 al 100.
        numeroAleatorio = (int) (Math.random() * 100) + 1;

        //Mientras se cumpla la condición el ciclo while continuará ejecutándose.
        while (numeroAleatorio != numeroUsuario) {

            //Solicitamos el número del 1 al 100 al usuario.
            System.out.print("Ingresa un número del 1 al 100: ");
            numeroUsuario = teclado.nextInt();

            // Mostramos en consola el número de intentos.
            System.out.println("Intento número: " + contadorIntentos);

            // Indicamos al usuario si el número es mayo o menor.
            if (numeroUsuario < numeroAleatorio) {
                System.out.println(" ===> El número es mayor.");
                System.out.println();
            } else if (numeroUsuario > numeroAleatorio) {
                System.out.println(" ===> El número es menor.");
                System.out.println();
            }

            // Validamos si el número de intentos es igual a 5. Utilizamos la expresión Break para finalizar
            if (contadorIntentos == 5) {
                System.out.println();
                System.out.println("----------------------------------------------------------------------");
                System.out.println("Haz alcanzado el número máximo de intentos");
                System.out.println("Mejor suerte para la próxima!");
                System.out.println("----------------------------------------------------------------------");
                System.out.println("El número era: " + numeroAleatorio);

                break;
            }


            if (numeroUsuario == numeroAleatorio) {

                System.out.println(" ");
                System.out.println("----------------------------------------------------------------------");
                System.out.println("Felicidades!. Adivinaste en número!");
                System.out.println("----------------------------------------------------------------------");
            }

            //Incrementamos el contador.
            contadorIntentos++;

        }

    }
}
