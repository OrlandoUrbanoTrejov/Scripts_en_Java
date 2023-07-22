/* Autor: Orlando Urbano Trejo (Lando)
 * Fecha: 14-07-2023
 * Correo: urbanoorlando79@gmail.com

 * Ejercicio: Un vendedor a realizado N ventas y desea saber cuantas fueron por 10,000 o menos, cuantas fueron por mas de 10,000 pero por menos de 20,000 y cuanto fue el monto de las ventas de cada una,
   y el monto global, realice el algoritmo para determinar los totales. */

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int Ventas;
        int[] Cantidad = new int[40];
        float Total_Final = 0;
        float Total = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Numero de ventas: ");
        Ventas = scanner.nextInt();
        for(int i = 0; i < Ventas; i++){
				System.out.print("Precio de la venta " + (i + 1) + ": ");
        		Cantidad[i] = scanner.nextInt();
        		Total_Final += Cantidad[i];
				if(Cantidad[i] < 1000){
           		 Total += Cantidad[i];
            }
      		else if (Cantidad[i] > 1000 && Cantidad[i] < 2000) {
                Total += Cantidad[i];
            }
         }
         System.out.print("Total final: " + Total_Final + "\n");
    }
}

