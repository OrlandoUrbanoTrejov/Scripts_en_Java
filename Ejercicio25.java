/* Autor:  Orlando Urbano Trejo (Lando)
 * Fecha:  17-07-2023
 * Correo: urbanoorlando79@gmail.com
 
 * Ejercicio: Solicita un numero al usuario y calcula su factorial */

import java.util.Scanner;

public class Ejercicio25{
	public static void main(String[] args){
		 int Numero, Resultado = 1;
		 Scanner Orlando = new Scanner(System.in);
		 System.out.print("Ingresa un numero: ");
		 Numero = Orlando.nextInt();
		 for(int i = 1; i <= Numero; i++){
		 	  Resultado *= i;
		 }
		 System.out.print("El factorial de " + Numero + " es: " + Resultado + "\n");
	}
}
