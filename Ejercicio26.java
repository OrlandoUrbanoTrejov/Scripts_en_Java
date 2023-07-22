/* Autor: Orlando Urbano Trejo (Lando)
 * Fecha: 17-07-2023
 * Correo: urbanoorlando79@gmail.com
 
 * Ejercicio: Solicita al usuario el numero de alumnos en un salon, posteriormente pida la edad de cada uno de ellos y calcula su promedio de edad */

import java.util.Scanner;

public class Ejercicio26{
	public static void main(String[] args){
		int Alumno, Edad;
		float Suma = 0, Promedio = 0;
		Scanner Orlando = new Scanner(System.in);
		System.out.print("Cuantos alumnos hay en el salon: ");
		Alumno = Orlando.nextInt();
		for(int i = 1; i <= Alumno; i++){
			System.out.print("Edad del alumno " + i +": " );
			Edad = Orlando.nextInt();
			Suma += Edad;
		}
		Promedio = Suma / Alumno;
		System.out.print("El promedio de las edades de los alumnos es: " + Promedio + "\n");
	}
}
