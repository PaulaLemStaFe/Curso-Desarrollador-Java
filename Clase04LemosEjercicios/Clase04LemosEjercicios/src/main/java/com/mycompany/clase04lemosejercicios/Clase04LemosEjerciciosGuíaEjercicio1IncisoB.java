package com.mycompany.clase04lemosejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Clase04LemosEjerciciosGuíaEjercicio1IncisoB {
    
    public static void main(String[] args) {
        
        System.out.println("EJERCICIO 1: Tomando los Ejercicios de la clase anterior:\n" +
            "   INCISO b. Haga lo mismo, pero solicitando los parámetros de a uno por consola.");
        
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = solicitarNumeros(scanner);
        char orden = solicitarOrden(scanner);
        
        ordenarYMostrarNumeros(numeros, orden);
        
        scanner.close();
    }
    
    // Solicita los números al usuario y los devuelve en un arreglo
    public static int[] solicitarNumeros(Scanner scanner) {
        int[] numeros = new int[3];
        
        // Pedir al usuario que ingrese los tres números
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese el número #" + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        return numeros;
    }
    
    // Solicita al usuario la letra "A" o "D" para indicar el orden y la devuelve
    public static char solicitarOrden(Scanner scanner) {
        
        // Pedir al usuario que seleccione si desea ordenar en ascendente o descendente
        System.out.println("Ingrese \"A\" para orden ascendente o \"D\" para "
                + "orden descendente: ");
        char orden = scanner.next().toUpperCase().charAt(0);
        return orden;
    }
    
    /* Toma los números y la letra de orden, los ordena según la elección del 
       usuario y muestra el resultado. */
    public static void ordenarYMostrarNumeros(int[] numeros, char orden) {
        
        Arrays.sort(numeros); // Ordena los números en orden ascendente
        
        if (orden == 'A') {
            System.out.println("Números ordenados de forma ascententa: " + 
                    numeros[0] + ", " + numeros[1] + ", " + numeros[2]);
        } else if (orden == 'D') {
            System.out.println("Números ordenados de forma descendente: " + 
                    numeros[2] + ", " + numeros[1] + ", " + numeros[0]);
        } else {
            System.out.println("La letra debe ser \"A\" o \"D\" para indicar el orden");
            return;
        }
    }
}
