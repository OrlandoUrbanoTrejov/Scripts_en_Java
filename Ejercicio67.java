/* Autor:  Orlando Urbano Trejo (Lando)
 * Fecha:  28-07-2023
 * Correo: urbanorlando79@gmail.com
 *
 * Ejercicio: Hacer una piramide de numeros */

import java.util.Scanner;

public class Ejercicio67 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Numero, Posicion_Central, Numero_Posiciones, Posicion_Inicial, Posicion_Final;
        System.out.print("Ingresa un numero: ");
        Numero = scanner.nextInt();

        Posicion_Central = Numero;
        Numero_Posiciones = Numero * 2 - 1;
        Posicion_Inicial = Numero;
        Posicion_Final = Numero;

        for (int i = 0; i < Numero; i++) {
            int Contador = 1;
            for (int j = 1; j <= Numero_Posiciones; j++) {
                if (j < Posicion_Inicial || j > Posicion_Final) {
                    System.out.print(" ");
                } else {
                    if (j < Numero) {
                        System.out.print(Contador);
                        Contador++;
                    } else {
                        System.out.print(Contador);
                        Contador--;
                    }
                }
            }
            System.out.println();
            Posicion_Final++;
            Posicion_Inicial--;
        }

        scanner.close();
    }
}

