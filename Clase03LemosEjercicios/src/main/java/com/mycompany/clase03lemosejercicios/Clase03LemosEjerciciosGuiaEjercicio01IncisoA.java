package com.mycompany.clase03lemosejercicios;

import java.util.Scanner;

public class Clase03LemosEjerciciosGuiaEjercicio01IncisoA {
    
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------");
        System.out.println("-----------------------------------------------");
        System.out.println("INCISO a: Dado un String y una letra, cuenta la cantidad "
                + "de apariciones de la letra en el String.");
        
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese el texto
        System.out.print("Ingrese un texto: ");
        String texto = scanner.nextLine();
        
        // Pedir al usuario que ingrese la letra a contar
        System.out.print("Ingrese una letra: ");
        char letra = scanner.nextLine().charAt(0); // Leer el primer carácter
        
        // Método para contar la cantidad de apariciones de una letra en un String
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == letra) {
                contador++;
            }
        }
        
        System.out.println("Apariciones de '" + letra + "': " + contador);
        
        // Cerrar el Scanner
        scanner.close();

        System.out.println("-----------------------------------------------");
        System.out.println("-----------------------------------------------");
    }
}
