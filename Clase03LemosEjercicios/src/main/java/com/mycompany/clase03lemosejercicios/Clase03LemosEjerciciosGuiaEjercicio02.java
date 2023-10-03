package com.mycompany.clase03lemosejercicios;

import java.util.Scanner;

public class Clase03LemosEjerciciosGuiaEjercicio02 {
    
    public static void main(String[] args) {
        System.out.println("EJERCICIO 2: Dado un String y un número de desplazamiento,"
                + " se procederá a codificar o decodificar dicho String.");
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un mensaje: ");
        String mensaje = scanner.nextLine();

        System.out.print("Ingrese el número de desplazamiento: ");
        int desplazamiento = scanner.nextInt();

        System.out.print("¿El mensaje ingresado ya está codificado? (Sí: 1, No: 2): ");
        int opcion = scanner.nextInt();

        String resultado = "";

        if (opcion == 1) {
            for (char caracter : mensaje.toCharArray()) {
                if (Character.isLetter(caracter)) {
                    char base = Character.isLowerCase(caracter) ? 'a' : 'A';
                    char descodificado = (char) (((caracter - base - desplazamiento + 26) % 26) + base);
                    resultado += descodificado;
                } else {
                    resultado += caracter;
                }
            }
            System.out.println("Mensaje descodificado: " + resultado);
        } else if (opcion == 2) {
            for (char caracter : mensaje.toCharArray()) {
                if (Character.isLetter(caracter)) {
                    char base = Character.isLowerCase(caracter) ? 'a' : 'A';
                    char codificado = (char) (((caracter - base + desplazamiento) % 26) + base);
                    resultado += codificado;
                } else {
                    resultado += caracter;
                }
            }
            System.out.println("Mensaje codificado: " + resultado);
        } else {
            System.out.println("Opción no válida. Por favor, ingrese 1 para mensaje codificado o 2 para mensaje no codificado.");
        }

        scanner.close();
    }

}