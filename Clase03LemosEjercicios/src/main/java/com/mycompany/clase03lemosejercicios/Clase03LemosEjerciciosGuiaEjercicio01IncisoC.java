package com.mycompany.clase03lemosejercicios;

import java.util.Scanner;

public class Clase03LemosEjerciciosGuiaEjercicio01IncisoC {
    
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------");
        System.out.println("-----------------------------------------------");
        System.out.println("INCISO c: Dados un vector de números, y un número"
                + "X, sumará todos los números > X para luego retornar el resultado.");
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese los números separados por comas
        System.out.print("Ingrese un conjunto de números separados por comas (por ejemplo, 5,10,15,20,25): ");
        String input = scanner.nextLine();
        
        // Pedir al usuario que ingrese el valor de X
        System.out.print("Ingrese el valor de X: ");
        int x = scanner.nextInt();
        
        // Dividir la entrada en un array de números
        String[] numerosStr = input.split(",");
        int[] numerosC = new int[numerosStr.length];
        
        for (int i = 0; i < numerosStr.length; i++) {
            numerosC[i] = Integer.parseInt(numerosStr[i].trim());
        }
        
        // Método para sumar todos los números mayores que X en el vector
        int suma = 0;
        for (int num : numerosC) {
            if (num > x) {
                suma += num;
            }
        }
        
        System.out.println("Suma de números mayores que " + x + ": " + suma);
        
        // Cerrar el Scanner
        scanner.close();
    }
}
