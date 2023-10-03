package com.mycompany.clase03lemosejercicios;

import java.util.Scanner;

public class Clase03LemosEjerciciosGuiaEjercicio01IncisoB {
    
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------");
        System.out.println("-----------------------------------------------");
        System.out.println("INCISO b: Dados 3 números y un orden (ascendente o "
                + "decreciente) ordenarlos para retornar como vector de 3.");
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese los tres números
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();
        
        // Pedir al usuario que seleccione si desea ordenar en ascendente o descendente
        System.out.print("¿Desea ordenar en ascendente (true) o descendente (false)? ");
        boolean ascendente = scanner.nextBoolean();
        
        // Método para ordenar tres números en orden ascendente o descendente
        int[] numeros = { num1, num2, num3 };
        if (ascendente) {
            for (int i = 0; i < numeros.length - 1; i++) {
                for (int j = i + 1; j < numeros.length; j++) {
                    if (numeros[i] > numeros[j]) {
                        int temp = numeros[i];
                        numeros[i] = numeros[j];
                        numeros[j] = temp;
                    }
                }
            }
        } else {
            for (int i = 0; i < numeros.length - 1; i++) {
                for (int j = i + 1; j < numeros.length; j++) {
                    if (numeros[i] < numeros[j]) {
                        int temp = numeros[i];
                        numeros[i] = numeros[j];
                        numeros[j] = temp;
                    }
                }
            }
        }
        
        System.out.println("Números ordenados:");
        for (int num : numeros) {
            System.out.println(num);
        }
        
        // Cerrar el Scanner
        scanner.close();
    }
}
