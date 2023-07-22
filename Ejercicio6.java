/* Autor: Orlando Urbano Trejo (Lando)
 * Fecha: 14-07-2023
 * Correo: urbanoorlando79@gmail.com
 
 * Ejercicio: Se requiere determinar el costo que tendra que realizar una llamada telefonica con base en el tiempo que dura la llamada
   y el costo por minuto. */

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        int Tiempo, Costo;
        double total = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tiempo de la llamada en minutos: ");
        Tiempo = scanner.nextInt();
        System.out.print("Costo por minuto en pesos: ");
        Costo = scanner.nextInt();
        System.out.print("Costo de la llamada: $" + Tiempo * Costo + "\n");
    }
}

