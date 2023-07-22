/* Autor:  Orlando Urbano Trejo (Lando)
 * Fecha:  14-07-2023
 * Correo: urbanoorlando79@gmail.com
 
 * Ejercicio: Concatenar 3 numeros o letras y mostrar el resultado */

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args){
    	 int Num1, Num2, Num3, Resultado = 0;
	    Scanner Orlando = new Scanner(System.in);
	    System.out.print("Numero 1: ");
	    Num1 = Orlando.nextInt();
       System.out.print("Numero 2: ");
       Num2 = Orlando.nextInt();
       System.out.print("Numero 3: ");
       Num3 = Orlando.nextInt();
       Resultado = Num1 + Num2 + Num3;
       System.out.print("Concatenacion: " + Resultado + "\n");
    }
	
}
