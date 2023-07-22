/* Autor: Orlando Urbano Trejo (Lando)
 * Fecha: 14-07-2023
 * Correo: urbanoorlando79@gmail.com

 * Ejercicio: Realice un algoritmo que calcule el precio total del boleto de una persona, ingresando el precio por kilometro y 
   la cantidad de kilometros a recorrer. Represente el diagrama de flujo, el pseudocodigo correspondiente */

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
	     float Precio_Kilometro, Distancia, Precio_Boleto = 0;
        Scanner Orlando = new Scanner(System.in);
        System.out.println("Precio por kilometro: ");
		  Precio_Kilometro = Orlando.nextFloat();
  		  System.out.println("Cantidad de kilómetros a recorrer:");
        Distancia = Orlando.nextFloat();
		  Precio_Boleto = Precio_Kilometro * Distancia;
		  System.out.printf("Precio del boleto: $" + Precio_Boleto + "\n");
    }
}
