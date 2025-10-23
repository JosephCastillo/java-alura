import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        /*
        *************************************
            - Desafío cuenta bancaria.
        *************************************
        */

        final String NOMBRE_CLIENTE;
        final String TIPO_CUENTA;

        double saldo = 0;

        // Objeto
        Scanner teclado = new Scanner(System.in);

        System.out.println();
        System.out.println(" ==> CUENTA BANCARIA.");
        System.out.println();

        // Datos cliente.
        NOMBRE_CLIENTE = "Carlos Mendieta";
        TIPO_CUENTA = "Corriente";
        saldo = 1599.99;


        // Mostrar datos cliente.
        System.out.println("********************************************");
        System.out.println("*  - Nombre del cliente: " + NOMBRE_CLIENTE);
        System.out.println("*  - Tipo de cuenta: " + TIPO_CUENTA);
        System.out.println("*  - Saldo disponible: $ " + saldo);
        System.out.println("********************************************");

        /*
         ******************************************
         * Escriba el número de la opción deseada *
         * ****************************************
         */

        // Menú de opciones.
        int opcion = 0;


        while (opcion != 9) {

            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Retirar");
            System.out.println("3 - Depositar");
            System.out.println("9 - Salir");

            System.out.println();
            System.out.print(" ==> Escriba el número de la opción deseada: ");


            //Leer opción
            opcion = teclado.nextInt();

            if (opcion == 1) {
                System.out.println();
                System.out.println("**********************************");
                System.out.println(" ---> Tu saldo es de: $ " + saldo);
                System.out.println("***********************************");
                System.out.println();
            }
            if (opcion == 2) {
                System.out.println("***********************************");
                System.out.println(" ---> Retirar. ");
                System.out.println("***********************************");
                System.out.print("Ingresa el monto a retirar: ");
                double retiro = teclado.nextDouble();
                if (saldo < retiro) {
                    System.out.println();
                    System.out.println(" --> Fondos insuficientes");
                    System.out.println();
                } else {
                    saldo = saldo - retiro;
                    System.out.println();
                    System.out.println(" ---> Retiro exitoso.");
                    System.out.println();
                }
            }
            if (opcion == 3) {
                System.out.println("***********************************");
                System.out.println(" ---> Depositar. ");
                System.out.println("***********************************");
                System.out.print("Ingresa el monto a consignar: ");
                double deposito = teclado.nextDouble();
                saldo = saldo + deposito;
                System.out.println();
                System.out.println(" ---> Consignación exitosa.");
                System.out.println(" ----> Saldo actualizado: " + saldo);
                System.out.println();
            }
            if (opcion == 9) {
                System.out.println();
                System.out.println(" ---> Salir");
                break;
            }
        }

    }
}
