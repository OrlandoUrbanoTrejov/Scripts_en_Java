/* Autor: Orlando Urbano Trejo (Lando)
 * Fecha: 14-07-2023
 * Correo: urbanoorlando79@gmail.com

 * Ejercicio: Realice un algoritmo que determine el sueldo semanal de N trabajadores considerando que se les descuenta
   5% de su sueldo si ganan entre 0 y 150 pesos. Se les descuenta 7% si ganan mas de 150 pero menos de 300, y 
   9% si ganan mas de 300 pero menos de 450. Los datos son horas trabajadas, sueldo por hora, y nombre de cada trabajador */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int Trabajadores;
        double Horas_Trabajadas, Sueldo_Hora, Salario = 0, Nuevo_Salario = 0, Total = 0;
        String[] Nombres = new String[20];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Numero de trabajadores: ");
        Trabajadores = scanner.nextInt();
        for(int i = 0; i < Trabajadores; i++){
            System.out.print("Nombre del trabajador: " + (i + 1) + "\n");
         	Nombres[i] = scanner.next();
				System.out.print("Horas trabajadas: ");
         	Horas_Trabajadas = scanner.nextDouble();
				System.out.print("Sueldo por hora: ");
         	Sueldo_Hora = scanner.nextDouble();
				Salario = Horas_Trabajadas * Sueldo_Hora;
         	if(Salario >= 0 && Salario <= 150){
                Nuevo_Salario = Salario * 0.5;
	         } 
	         else if(Salario > 150 && Salario <= 300){
                Nuevo_Salario = Salario * 0.7;
            } 
	         else if(Salario > 300 && Salario <= 450){
                Nuevo_Salario = Salario * 0.9;
            } 
	         else{
                Nuevo_Salario = 0;
            }
   			Total = Salario - Nuevo_Salario;
         	System.out.print("Trabajador: " + Nombres[i] + "\n");
         	System.out.print("Salario final: " + Total + "\n");
        }
    }
}

