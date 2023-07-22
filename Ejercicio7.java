/* Autor: Orlando Urbano Trejo (Lando)
 * Fecha: 14-07-2023
 * Correo: urbanoorlando79@gmail.com
 
 * Ejercicio: Realice un algoritmo para leer calificaciones de N alumnos y determine el numero de alumnos aprobados y reprobados */

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        int Alumnos;
        double Calificacion;
        Scanner scanner = new Scanner(System.in);
  		  System.out.print("Cantidad de alumnos: ");
        Alumnos = scanner.nextInt();
        for(int i = 0; i < Alumnos; i++){
         	System.out.printf("Calificacion del alumno " + (i + 1) + "(1-100):\n");
         	Calificacion = scanner.nextDouble();
				if(Calificacion > 70){
         		 System.out.println("APROBADO");
            } 
            else{
        			  System.out.println("REPROBADO");
           }
        }
    }
}


