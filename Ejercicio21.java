/* Autor:  Orlando Urbano Trejo (Lando)
 * Fecha:  14-07-2023
 * Correo: urbanoorlando79@gmail.com
 
 * Ejercicio: Obtener la edad de una persona en meses, si se ingresa su edaden años y meses. 
   Ejemplo: Ingresado 3 años 4 meses debe mostrar 40 meses. */

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        int Edad, Meses, Resultado = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Edad en años: ");
        Edad = scanner.nextInt();

        System.out.print("¿Cuántos meses adicionales?: ");
        Meses = scanner.nextInt();

        Resultado = (Edad * 12) + Meses;

        System.out.printf("Edad: " + Resultado + " meses\n");
    }
}

