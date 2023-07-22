/* Autor:  Orlando Urbano Trejo (Lando)
 * Fecha:  17-07-2023
 * Correo: urbanoorlando79@gmail.com
 
 * Ejercicio: Realiza un codigo que calcule la mitad de la tercera parte del doble de un numero. */

import java.util.Scanner;

public class Ejercicio24 {
	public static void main(String[] args){
		 int Numero; 
		 int Resul1 = 0, Resul2 = 0, Final = 0;
 		 Scanner scanner = new Scanner(System.in);
		 System.out.print("Ingresa un numero: ");
		 Numero = scanner.nextInt();
		 Resul1 = Numero * 2;
		 Resul2 = Resul1 / 3;
		 Final = Resul2 / 2;
		 System.out.print("La mitad de la tercera parte del doble de " + Numero + " es: " + Final + "\n");
	}
}

