/* Autor:  Orlando Urbano Trejo (Lando)
 * Fecha:  14-07-2023
 * Correo: urbanoorlando79@gmail.com
 
 * Ejercicio: Genera un programa que determine si eres mayor de edad. */

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        int Edad;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Edad: ");
        Edad = scanner.nextInt();
        if(Edad >= 18){
            System.out.println("Eres mayor de edad");
        } 
	     else{
            System.out.println("Eres menor de edad");
        }
    }
}

