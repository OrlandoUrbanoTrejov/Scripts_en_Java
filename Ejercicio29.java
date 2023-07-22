/* Autor: Orlando Urbano Trejo (Lando)
 * Fecha: 18-07-2023
 * Correo: urbanoorlando79@gmail.com
 
 * Ejercicio: Haciendo uso de arreglos, almacena la calificación de una materia (Recuerda que son 5 unidades).Posteriormente, calcula el promedio final e imprime los resultados */

import java.util.Scanner;

public class Ejercicio39{
	public static void main (String[] args){
		Scanner Orlando = new Scanner(System.in);
		int[] Calificacion = new int[5];
		String Materia; 
		double Suma = 0, Promedio = 0;
		System.out.print("Materia: ");
		Materia = Orlando.nextLine();

		for(int i =0; i<5; i++){
		    System.out.print("Calificacion de la unidad " + (i+1) + ": " );
			 Calificacion[i] = Orlando.nextInt();
			 Suma += Calificacion[i];
		}
		System.out.print("\n");
		System.out.print("Asignatura: " + Materia + "\n");
	   System.out.print("Unidad 1\tUnidad 2\tUnidad 3\tUnidad 4\tUnidad 5\t Promedio\n");

	   for(int i = 0; i < 5; i++){
			 System.out.printf("%8d\t", Calificacion[i]);
		}	
		Promedio = Suma / 5;
      System.out.printf("%.2f\n", Promedio);
	}
}
