/* Autor:  Orlando Urbano Trejo (Lando)
 * Fecha:  14-07-2023
 * Correo: urbanoorlando79@gmail.com
 
 * Ejercicio: Calcular el descuento de un medicamento */

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        String Nombre;
        double Precio, Total = 0;
		  Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre: ");
        Nombre = scanner.next();
        System.out.print("Precio del Medicamento: ");
        Precio = scanner.nextDouble();
        Total = Precio - (Precio * 0.35);
		  System.out.println("Cliente: " + Nombre + " el total a pagar es: $" + Total);
    }
}

