/* Autor: Orlando Urbano Trejo (Lando)
 * Fecha: 14-07-2023
 * Correo: urbanoorlando79@gmail.com
 
 * Ejercicio: Escriba un algoritmo que dada la cantidad de monedas de 5-10-20 pesos, diga la cantidad de dinero que se tiene en total .*/

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        float[] Cajero = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1, 0.50f};
        float Cantidad = 0, C = 0;
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 11; i++){
            System.out.printf("Cantidad de " + Cajero[i] + " que tiene: ");
            C = scanner.nextFloat();
            Cantidad = Cantidad + (C * Cajero[i]);
            System.out.println("Total: $" + Cantidad + "\n");
        }
    }
}

