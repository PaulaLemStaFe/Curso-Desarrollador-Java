package com.mycompany.clase01lemosejercicios;

public class Clase01LemosEjercicios {

    public static void main(String[] args) {
        // EJERCICIO 1 INCISO a
        System.out.println("EJERCICIO 1 INCISO a:");
        
        // Variables con los valores que se van a usar en la comparación del While
        int numeroInicio = 5;
        int numeroFin = 14;
        
        // Contador para cada proceso del While
        int contador = numeroInicio;
        
        // Mientras contador sea menor o igual que numeroFin imprimir en pantalla el valor del contador y luego sumarle uno
        while (contador <= numeroFin) {
            System.out.println(contador);
            contador++;
        }
        
        // EJERCICIO 1 INCISO b
        System.out.println("EJERCICIO 1 INCISO b:");
        
        // Contador para cada proceso del While
        int contadorB = numeroInicio;
        
        /* Mientras contador sea menor o igual que numeroFin, se calcula el resto de la división por 2,
            si dá cero entonces el contador es un numero par y se lo imprime en pantalla y, al final, se le suma uno */
        while (contadorB <= numeroFin) {
            int resultado = contadorB % 2;
            if (resultado == 0) {
                System.out.println(contadorB);
            }
            contadorB++;
        }
        
        // EJERCICIO 1 INCISO c
        System.out.println("EJERCICIO 1 INCISO c:");
        
        // Contador para cada proceso del While
        contadorB = numeroInicio;
        char parImpar = 'i'; // Para indicar si se desean mostrar los números pares o impares
        
        /* Mientras contador sea menor o igual que numeroFin
            se ingresa si se desean los números pares o impares
            y se hace el cálculo del resto de la división por dos
            Luego se procede a mostrar los pares o impares según se indicó anteriormente */
        while (contadorB <= numeroFin) {
            switch (parImpar) {
                case 'p':
                    if (contadorB % 2 == 0) {
                        System.out.println(contadorB);
                    }
                    break;
                case 'i':
                    if (contadorB % 2 != 0) {
                        System.out.println(contadorB);
                    }
                    break;
                default:
                    System.out.println("Opcion ingresada es incorrecta");
                    break;
            }
            contadorB++;
        }
        
        // EJERCICIO 1 INCISO d
        System.out.println("EJERCICIO 1 INCISO d:");
        
        for (contadorB = numeroFin; numeroInicio <= contadorB; contadorB--) {
            int resultado = contadorB % 2;
            if (resultado == 0) {
                System.out.println(contadorB);
            }
        }
    }
}
