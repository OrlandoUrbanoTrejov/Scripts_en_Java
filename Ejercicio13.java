/* Autor: Orlando Urbano Trejo (Lando)
 * Fecha: 14-07-2023
 * Correo: urbanoorlando79@gmail.com
 
 * Ejercicio:alcula el precio de un boleto de viaje, tomando en cuenta el numero de kilometros que se van a recorrer. El precio por kilometro es de $20.50 */

import java.util.Scanner;

public class Ejercicio13 {
   public static void main(String[] args){
       double Precio_Boleto = 20.50, Num_Kilometros;
       Scanner scanner = new Scanner(System.in);
       System.out.print("Numero de kilometros a recorre: ");
       Num_Kilometros = scanner.nextDouble();
       System.out.print("Precio del boleto: $" + (Num_Kilometros * Precio_Boleto) + "\n");
   }
}
