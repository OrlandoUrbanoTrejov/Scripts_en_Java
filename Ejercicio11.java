/* Autor: Orlando Urbano Trejo (Lando) 
 * Fecha: 14-07-2023
 * Correo: urbanoorlando79@gmail.com

 * Ejercicio: Multiplicar dos numeros */

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        double Num1, Num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Numero 1: ");
        Num1 = scanner.nextDouble();
        System.out.print("Numero 2: ");
        Num2 = scanner.nextDouble();
        System.out.printf("Resultado: "+ (Num1 * Num2) + "\n" );
    }
}

