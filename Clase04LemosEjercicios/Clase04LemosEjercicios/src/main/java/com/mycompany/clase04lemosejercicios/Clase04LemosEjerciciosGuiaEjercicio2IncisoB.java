package com.mycompany.clase04lemosejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Clase04LemosEjerciciosGuiaEjercicio2IncisoB {
    
    public static void main(String[] args) {
        
        System.out.println("EJERCICIO 2: Haga una main donde por parámetro envíe"
                + " la ruta de un archivo. Ese archivo debe\n" +
                "contener números. El programa debe escribir por consola la suma de esos números\n");
        System.out.println("    INCISO a: Al programa anterior agreguele un "
                + "parámetro para que la operación pueda ser\n" +
                "   suma o multiplicación.\n");
        
        String filePath = "C:\\Users\\Paula\\Documents\\Cursos\\Neoris - UTN\\Repositorio\\Curso-Desarrollador-Java\\Clase04LemosEjercicios\\Clase04LemosEjercicios\\src\\main\\java\\com\\mycompany\\clase04lemosejercicios\\Numeros.txt";
        String operacion = "*"; 
        // Aquí se ingresa el símbolo para la operación: "+" para suma o "*" para multiplicación
        
        try {
            int resultado = realizarOperacionConNumerosDeArchivo(filePath, operacion);
            System.out.println("El resultado de la operación es: " + resultado);
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
    
    /* La función "realizarOperacionConNumerosDeArchivo" realiza la operación 
    deseada: suma ("+") o multiplicación ("*") en función del segundo argumento
    y devuelve el resultado. La operación se realiza mientras se leen los 
    números del archivo. */

    public static int realizarOperacionConNumerosDeArchivo(String filePath, String operacion) throws IOException {
        int resultado = (operacion.equals("+")) ? 0 : 1; // Inicializamos el resultado según la operación

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                try {
                    int numero = Integer.parseInt(linea);
                    if (operacion.equals("+")) {
                        resultado += numero; // Realizar suma
                    } else if (operacion.equals("*")) {
                        resultado *= numero; // Realizar multiplicación
                    } else {
                        throw new IllegalArgumentException("Operación no válida. Use suma (+) o multiplicacion (*).");
                    }
                } catch (NumberFormatException e) {
                    System.err.println("Se encontró una línea que no es un número: " + linea);
                }
            }
        }

        return resultado;

    }
}
