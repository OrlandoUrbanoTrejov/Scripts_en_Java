/* Autor: Orlando Urbano Trejo (Lando)
 * Fecha: 17-07-2023
 * Correo: urbanoorlando79@gmail.com
 
 * Ejercicio: Realiza un codigo que imprima un arbol de navidad, de la siguiente manera. Recuerda hacer uso de ciclos.*/

import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner Orlando = new Scanner(System.in);
        int Altura, Espacios, Tronco;

        System.out.print("Altura del árbol: ");
        Altura = Orlando.nextInt();

        for(int i = 1; i <= Altura; i++){
            Espacios = Altura - i;
            // Imprimir espacios en blanco
            for(int j = 1; j <= Espacios; j++){
                System.out.print(" ");
            }  
				// Imprimir asteriscos
            for(int j = 1; j <= (2 * i - 1); j++){
                System.out.print("*");
            }
				System.out.println();
        }

        Tronco = Altura - 1;
        // Imprimir el tronco del árbol
        for(int i = 1; i <= 2; i++){
            for(int j = 1; j <= Tronco; j++){
                System.out.print(" ");
            }
            System.out.println("**");
        }
    }
}

