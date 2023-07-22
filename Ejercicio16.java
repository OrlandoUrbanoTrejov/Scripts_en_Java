/* Autor: Orlando Urbano Trejo (Lando)
 * Fecha: 14-07-2023
 * Correo: urbanoorlando79@gmail.com
 
 * Ejercicio: En un hospital existen 3 áreas: Urgencias, Pediatría y Traumatología. 
    El presupuesto anual del hospital se reparte de la siguiente manera: Pediatría 42% y Traumatología 21% */ 

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        int Presupuesto;
        double Urgencias = 0, Pediatria = 0, Traumatologia = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Presupuesto anual: ");
        Presupuesto = scanner.nextInt();

        Urgencias = Presupuesto * 0.37f;
        Pediatria = Presupuesto * 0.42f;
        Traumatologia = Presupuesto * 0.21f;

        System.out.print("Presupuesto Urgencias: $" + Urgencias + "\n");
        System.out.print("Presupuesto Pediatria: $" + Pediatria + "\n");
        System.out.print("Presupuesto Traumatologia: $" + Traumatologia + "\n");
    }
}

