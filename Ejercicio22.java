/* Autor:  Orlando Urbano Trejo (Lando) 
 * Fecha:  14-07-2023
 * Correo: urbanoorlando79@gmail.com
 
 * Ejercicio: Un vendedor recibe un sueldo base más un 10% por comision de sus ventas el vendedor desea saber cuanto dinero obtendra 
   por concepto de comisiones por las 3 ventas que realiza en el mes y el total que recibira en el mes tomando en cuenta su base y comisiones. */

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        float Comision = 0, Sueldo, Precio_Venta, Total;
        int Ventas;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sueldo fijo: ");
        Sueldo = scanner.nextFloat();

        System.out.print("Ventas realizadas: ");
        Ventas = scanner.nextInt();

        for(int i = 0; i < Ventas; i++){
            System.out.print("Precio de la venta " + (i + 1) + ": ");
            Precio_Venta = scanner.nextFloat();
            Comision += Precio_Venta * 0.10;
        }

        Total = Comision + Sueldo;

        System.out.print("Comisión: $" + Comision + "\n");
        System.out.print("Sueldo: $" + Total + "\n");
    }
}

