/* Autor:  Orlando Urbano Trejo (Lando)
 * Fecha:  14-07-2023
 * Correo: urbanoorlando79@gmail.com
 
 * Ejercicio: Calcular el nuevo salario de un empleado si se le descuenta el 20% de su salario actual. */

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        String Nombre;
        float Salario, Total = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre: ");
        Nombre = scanner.next();

        System.out.print("Salario: ");
        Salario = scanner.nextFloat();

        Total = Salario - (Salario * 0.20f);

        System.out.print("Empleado: " + Nombre + " su salario es: $"+ Total + "\n" );
    }
}

