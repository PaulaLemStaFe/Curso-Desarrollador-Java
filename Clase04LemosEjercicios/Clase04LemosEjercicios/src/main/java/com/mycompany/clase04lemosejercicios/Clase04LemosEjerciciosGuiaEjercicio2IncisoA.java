package com.mycompany.clase04lemosejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Clase04LemosEjerciciosGuiaEjercicio2IncisoA {
    
    public static void main(String[] args) {
        
        System.out.println("EJERCICIO 2: Haga una main donde por parámetro envíe"
                + " la ruta de un archivo. Ese archivo debe\n" +
                "contener números. El programa debe escribir por consola la suma de esos números\n");
        
        String filePath = "C:\\Users\\Paula\\Documents\\Cursos\\Neoris - UTN\\Repositorio\\Curso-Desarrollador-Java\\Clase04LemosEjercicios\\Clase04LemosEjercicios\\src\\main\\java\\com\\mycompany\\clase04lemosejercicios\\Numeros.txt";
        
        try {
            int suma = sumarNumerosDeArchivo(filePath);
            System.out.println("La suma de los números en el archivo es: " + suma);
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        } /* Se verifica si se proporciona la ruta del archivo como argumento 
             y se llama a la función "sumarNumerosDeArchivo" para calcular y 
             mostrar la suma. */
    }
    
    /* La función "sumarNumerosDeArchivo" toma la ruta del archivo como parámetro,
       lee los números del archivoy calcula la suma de éstos */

    public static int sumarNumerosDeArchivo(String filePath) throws IOException {
        int suma = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                try {
                    int numero = Integer.parseInt(linea);
                    suma += numero;
                } catch (NumberFormatException e) {
                    System.err.println("Se encontró una línea que no es un número: " + linea);
                }
            }
        }

        return suma;
    }
}
