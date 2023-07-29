/* Autor:  Orlando Urbano Trejo (Lando)
 * Fecha:  28-07-2023
 * Correo: urbanorlando79@gmail.com
 *
 * Ejercicio: Sumar numeros pares desde n hasta m. */
import java.util.Scanner;

public class Ejercicio66 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Num_Inicio, Num_Final, Contador = 1, Suma = 0;

        System.out.print("Ingresa un numero para el inicio de la suma: ");
        Num_Inicio = scanner.nextInt();
        System.out.print("Ingresa un numero para el limite de la suma: ");
        Num_Final = scanner.nextInt();

        for (int i = Num_Inicio; i <= Num_Final; i++) {
            if (i % 2 == 0) {
                Suma += i;
            }
        }

        System.out.println("Suma: " + Suma);
        scanner.close();
    }
}

