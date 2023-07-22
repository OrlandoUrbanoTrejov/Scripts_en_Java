/* Autor: Orlando Urbano Trejo (Lando)
 * Fecha: 14-07-2023
 * Correo: urbanoorlando79@gmail.com

 * Ejercicio: Se desea saber el total de una caja registradora de un almacén, se conoce el numero de billetes y 
   monedas asi como su valor */

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        int Convertidor = 0;
        double Resultado = 0, Dinero[]={ 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1, .50, .20, .10};
        Scanner scanner = new Scanner (System.in);
        for(int i=0; i<=12; i++){
	         System.out.print("Cantidad de dinero que tiene $"+ Dinero[i] + ":\n");
	         Convertidor = scanner.nextInt();
	         Resultado = Resultado + (Convertidor * Dinero[i]);
		  }
	     System.out.print("Total almacando: $" + Resultado + "\n");
	}
}

