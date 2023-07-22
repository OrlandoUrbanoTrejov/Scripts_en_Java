/* Autor: Orlando Urbano Trejo (Lando)
 * Fecha: 14-07-2023
 * Correo: urbanoorlando79@gmail.com
 
 * Ejercicio: Calcula la cantidad de euros a monedas */

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        System.out.println("-------- MENU DE CONVERSIONES --------");
        System.out.println("1) Euros");
        System.out.println("2) Dólares");
        int Opcion, Dinero;
        double Dolar = 16.89f, Euro = 0.053f, Resultado = 0;
		  Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.print("Elige una opción: ");
        Opcion = scanner.nextInt();

        if(Opcion == 1){
            System.out.print("Dinero: ");
            Dinero = scanner.nextInt();
            Resultado = Dinero / Dolar;
            System.out.print("Dinero: " + Resultado + " dolares\n");
        }
		  else if(Opcion == 2){
            System.out.print("Dinero: ");
            Dinero = scanner.nextInt();
            Resultado = Dinero / Euro;
            System.out.print("Dinero: " + Resultado + "Euros\n");
        } 
		  else{
            System.out.println("Opción no válida");
        }
    }
}

