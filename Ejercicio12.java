/* Autor: Orlando Urbano Trejo (Lando)
 * Fecha: 14-07-2023
 * Correo: urbanoorlando79@gmail.com
 
 * Ejercicio: Una persona recibe un prestamo de 10,000 de un banco y desea saber cuanto pagara de interes, si el banco le 
   cobrara una tasa de 27% anual. */

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        int Tiempo, Tiempo_Transcurrido;
        double Prestamo = 10000, Interes = 0.27f;
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Año en que solicitó el préstamo?: ");
        Tiempo = scanner.nextInt();
        System.out.print("Año actual: ");
        Tiempo_Transcurrido = scanner.nextInt();
        for(int i = Tiempo; i <= Tiempo_Transcurrido; i++){
            Prestamo = Prestamo + (Prestamo * Interes);
            System.out.printf("El interés de " + i + " es de: $" + Prestamo + "\n");
        }
    }
}

