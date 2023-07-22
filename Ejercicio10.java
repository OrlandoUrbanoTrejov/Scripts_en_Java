/* Autor: Orlando Urbano Trejo (Lando)
 * Fecha: 14-07-2023
 * Correo: urbanoorlando79@gmail.com

 * l banco bandido de peluche desea calcular para cada uno de sus N clientes su saldo actual, su pago minimo y su pago para no generar intereses
   Ademas quiere calcular el monto de lo que gano por concepto intereses con los clientes morosos. los datos que se conocen de cada clientes son:
   Saldo anterior, monto de las compras que realizo y pago que deposito en el corte anterior. Para calcular el pago minimo se considera 15% del
   saldo actual, y el pago para no generar intereses corresponde al 85% del pago actual, considerando que el saldo actual debe incluir 12% de los
   intereses causados por no realizar el pago minimo y $200 de multa por el mismo motivo. Realice el algoritmo correspondiente.*/


import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        double Saldo_Actual = 0, Pago_Actual = 0, Saldo_Anterior = 0, Saldo_Minimo = 0,
	     Pago_Interes = 0, Monto_Compras = 0, Deposito = 0;
        int Clientes;
        String[] Nombres = new String[20];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Número de clientes: ");
        Clientes = scanner.nextInt();

        for(int i = 0; i < Clientes; i++){
            System.out.print("Nombre del cliente: ");
            Nombres[i] = scanner.next();

            System.out.print("Saldo anterior: ");
            Saldo_Anterior = scanner.nextDouble();

            System.out.print("Último depósito: ");
            Deposito = scanner.nextDouble();

            System.out.print("Monto por ventas: ");
            Monto_Compras = scanner.nextDouble();

            System.out.print("Saldo actual: ");
            Saldo_Actual = scanner.nextFloat();

            Pago_Actual = (Saldo_Actual * 0.12) + 200;
            Saldo_Minimo = Saldo_Actual * 0.15;
            Pago_Interes = Saldo_Actual * 0.85;

            System.out.print("Tu saldo actual " + Nombres[i] + ", es de: $" + Pago_Actual + "\n");
            System.out.print("Tu pago mínimo " + Nombres[i] + ", es de: $" + Saldo_Minimo + "\n");
            System.out.print("El pago para no generar intereses " +Nombres[i] + ", es de: $" +  Pago_Interes + "\n");
        }
    }
}

