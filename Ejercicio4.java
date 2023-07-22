/* Autor: Orlando Urbano Trejo (Lando)
 * Fecha: 14-07-2023
 * Correo: urbanoorlando79@gmail.com
 
 * Ejercicio: Se requiere determinar el tiempo en que tarda una persona en llegar de una ciudad a otra en bicicleta, 
   considerando que lleva una velocidad constante */

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        double KH, Distancia, Tiempo = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Velocidad en (km/h):");
        KH = scanner.nextDouble();
        System.out.println("Distancia recorrida:");
        Distancia = scanner.nextDouble();
        Tiempo = (KH * Distancia) / 60;
        System.out.print("Tiempo: " + Tiempo + " horas\n");
    }
}
