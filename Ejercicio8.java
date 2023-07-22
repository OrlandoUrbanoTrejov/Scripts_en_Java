/* Autor: Orlando Urbano Trejo (Lando)
 * Fecha: 14-07-2023
 * Correo: urbanoorlando79@gmail.com

 * Ejercicio: La CONAGUA requiere determinar el pago que debe de realizar a una persona por el total de metros
   cúbicos que consume de agua */

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
    	  int Precio_Metros, Metros;
        Scanner scanner = new Scanner(System.in);
		  System.out.print("Ingresa el precio por metro: ");
        Precio_Metros = scanner.nextInt();
        System.out.print("Metros trabajados: ");
        Metros = scanner.nextInt();
		  System.out.printf("Pago: $" + (Precio_Metros * Metros) + "\n");
    }
}

