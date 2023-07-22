/*
 * Autor: Orlando Urbano Trejo (Lando)
 * Fecha: 17-07-2023
 * Correo: urbanoorlando79@gmail.com
 
 * Ejercicio: Un vendedor de vestidos ofrece 3 diferentes tallas, con diferentes precios, la grande con un precio
de $500 por vestido, la mediana con un costo de $400 y la chica de $300. Selecciona la talla a comprar
y solicita el número de vestidos que desee, Posteriormente, calculo el monto final.*/

import java.util.Scanner;

public class Ejercicio27{
	public static void main(String[] args){
		 int Vestido, Cantidad;
		 float Total = 0;
		 Scanner Orlando = new Scanner(System.in);
		 System.out.print("----VESTIDOS----\n");
		 System.out.print("1) Grande $500\n");
		 System.out.print("2) Mediana $400\n");
		 System.out.print("3) Chica $300\n");
		 System.out.print("Elige la marcz que deseas comprar (1-3):");
		 Vestido = Orlando.nextInt();
		 if(Vestido == 1){
		 	  System.out.print("Numero de vestidos que deseas comprar: ");
			  Cantidad = Orlando.nextInt();
			  Total = Cantidad * 500;
		 }
	    else if(Vestido == 2){
			  System.out.print("Numero de vestidos que deseas comprar: ");
           Cantidad = Orlando.nextInt();
           Total = Cantidad * 400;
		 }
		 else if(Vestido == 3){
		     System.out.print("Numero de vestidos que deseas comprar: ");
           Cantidad = Orlando.nextInt();
           Total = Cantidad * 300;
		 }
		 else{
		     System.out.print("Opcion no valida");
		 }
		 System.out.print("Monto total de la venta: $" + Total + "\n" );
	}
}
