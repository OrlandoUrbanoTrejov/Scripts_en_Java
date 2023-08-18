/* Autor: Orlando Urbano Trejo (Lando)
 * Fecha: 18-07-2023
 * Correo: urbanoorlando79@gmail.com

 Ejercicio; Crear un programa que realice un menu de conversiones de unidades */

import java.util.Scanner;

public class ConversionesOrlando {
    public static void main(String[] args) {
        Scanner Orlando = new Scanner(System.in);
        String[] General = {"------CONVERSION DE UNIDADES------", 
	    "0) Longitud", 
	    "1) Masa", 
	    "2) Tiempo", 
	    "3) Volumen", 
	    "4) Tamaño de Datos",
	    "5) Velocidad",
	    "6) Temperatura"};
        String[][] Menu = {
	    {"m","cm","km","mm","mi","yd","ft","in"}, 
	    {"kg","to","g","st","lb","oz"},
	    {"m","ml","s","hr","d"}, 
	    {"l","ml","gal","ozl","m3","ft3","in3"},
	    {"bit", "kl","B","kb"},
	    {"mi/h","ft/s","m/s","km/h","kn"},
	    {"°C","°F","K"}};
        double[][] Operaciones = {
            {1, 100, 0.001, 1000, 0.000621371, 1.09361, 3.28084, 39.3701}, 
	    {1,0.001, 1000, 0.157473, 2.20462, 35.274}, 
	    {1, 6000, 60, 0.0166667, 0.000694444},  
	    {1, 1000, 0.219969, 35.1951, 0.001, 0.0353147, 61.0237},
	    {1,0.001,0.125,0.000125},{1,1.46667,0.44704,1.60934,0.868976},
	    {1,1.8,1}};
        for (int i = 0; i < General.length; i++){
              System.out.print(General[i] + "\n");
        }
        System.out.print("Elige una opcion: " );
        int Opcion = Orlando.nextInt();

        if(Opcion >= 0 && Opcion <=6 ){
            for(int i = 0; i < Menu[Opcion].length; i++) {
                System.out.println((i+0) +  ") "+ Menu[Opcion][i]);
            }
        }
        System.out.print("Elige la unidad de entrada: ");
        int UnidadEntrada = Orlando.nextInt();
        System.out.print("Elige la unidad de destino: ");
        int UnidadDestino = Orlando.nextInt();
        System.out.print("Introduce el valor a convertir: ");
        double Valor = Orlando.nextDouble();
        double Resultado = Valor * (Operaciones[Opcion][UnidadDestino] / Operaciones[Opcion][UnidadEntrada]);
        System.out.println(Valor + " " + Menu[Opcion][UnidadEntrada] + " = " + Resultado + " " + Menu[Opcion][UnidadDestino]);
    }
}

