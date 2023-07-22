/* Autor:  Orlando Urbano Trejo (Lando)
 * Fecha:  14-07-2023
 * Correo: urbanoorlando79@gmail.com
 
 * Ejercicio: Escriba un algoritmo que, dado el número de horas trabajadas por un empleado 
   y el sueldo por hora, calcule el sueldo total de ese empleado. */

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        float Horas, Sueldo_Hora, Sueldo_Final = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Horas trabajadas: ");
        Horas = scanner.nextFloat();

        System.out.print("Sueldo por hora: ");
        Sueldo_Hora = scanner.nextFloat();

        Sueldo_Final = Horas * Sueldo_Hora;

        System.out.print("Sueldo total: $" + Sueldo_Final + "\n");
    }
}

