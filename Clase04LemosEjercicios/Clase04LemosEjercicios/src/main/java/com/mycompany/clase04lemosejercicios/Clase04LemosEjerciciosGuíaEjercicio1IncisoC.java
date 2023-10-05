package com.mycompany.clase04lemosejercicios;

import static com.mycompany.clase04lemosejercicios.Clase04LemosEjerciciosGuíaEjercicio1IncisoB.ordenarYMostrarNumeros;
import static com.mycompany.clase04lemosejercicios.Clase04LemosEjerciciosGuíaEjercicio1IncisoB.solicitarNumeros;
import static com.mycompany.clase04lemosejercicios.Clase04LemosEjerciciosGuíaEjercicio1IncisoB.solicitarOrden;
import java.util.Arrays;
import java.util.Scanner;

public class Clase04LemosEjerciciosGuíaEjercicio1IncisoC {
    
    public static void main(String[] args) {
        
        System.out.println("EJERCICIO 1: Tomando los Ejercicios de la clase anterior:\n" +
            "   INCISO c. Haga lo mismo, pero usando los parámetros si hay alguno"
                + " (como en a) y haciendo (b)\n" +
            "   si no detecta ninguno. Vea si con una función puede evitar "
                + "repetir código.");
        
        int[] numeros;
        char orden;
        
        if (args.length >= 4) {
            numeros = new int[]{Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2])};
            orden = args[3].toUpperCase().charAt(0);
        } else {
            // Crear un objeto Scanner para leer la entrada del usuario
            Scanner scanner = new Scanner(System.in);
            numeros = solicitarNumeros(scanner);
            orden = solicitarOrden(scanner);
            scanner.close();
        }
        
        ordenarYMostrarNumeros(numeros, orden);
    }
}
