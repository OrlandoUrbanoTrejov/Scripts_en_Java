/* Autor: Orlando Urbano Trejo (Lando) 
 * Fecha: 14-07-2023
 * Correo: urbanoorlando79@gmail.com
 
 * Ejercicio: Realice un algoritmo que, con base en una calificacion proporcionada (0-10), inidique con letra la calificacion que le corresponde:
   10 es "A", 9 es "B", 8 es "C", 7 y 6 son "D", y de 5 a 0 son "F". Represente el diagrama de flujo, el pseudocodigo correspondiente  */

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingresa la calificacion obtenida: (0-10)");
    int calificacion = scanner.nextInt();

    switch (calificacion) {
	     case 0:
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
	     System.out.println("Tu calificacion es: F");
        break;
        case 6:
        case 7:
        System.out.println("Tu calificacion es: D");
        break;
        case 8:
        System.out.println("Tu calificacion es: C");
        break;
        case 9:
        System.out.println("Tu calificacion es: B");
        break;
        case 10:
        System.out.println("Tu calificacion es: A");
        break;
        default:
        System.out.println("Calificacion invalida");
        break;
        }
    }
}





