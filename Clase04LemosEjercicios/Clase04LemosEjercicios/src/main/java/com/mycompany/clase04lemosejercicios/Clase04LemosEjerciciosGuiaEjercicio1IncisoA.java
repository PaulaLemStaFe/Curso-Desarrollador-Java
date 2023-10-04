package com.mycompany.clase04lemosejercicios;

public class Clase04LemosEjerciciosGuiaEjercicio1IncisoA {

    public static void main(String[] args) {
        
        System.out.println("EJERCICIO 1: Tomando los Ejercicios de la clase anterior:\n" +
            "   INCISO a. Haga un main, donde por parámetro ponga 3 números y una letra que\n" +
            "   represente ascendente o descendente y los muestre ordenados por tal criterio\n");
        
        int numero1 = 60;
        int numero2 = 9;
        int numero3 = 38;
        char orden = 'A'; 
        // Para convertir la letra en mayúscula en caso de que el usuario la ingrese en minúscula
        
        if (orden == 'A') {
            ordenarAscendente(numero1, numero2, numero3);
        } else if (orden == 'D') {
            ordenarDescendente(numero1, numero2, numero3);
        } else {
            System.out.println("La letra debe ser \"A\" o \"D\" para indicar el orden.");
        }
    }
    
    public static void ordenarAscendente(int numero1, int numero2, int numero3) {
        if (numero1 > numero2) {
            int aux = numero1;
            numero1 = numero2;
            numero2 = aux;
        }
        
        if (numero2 > numero3) {
            int aux = numero2;
            numero2 = numero3;
            numero3 = aux;
        }
        
        if (numero1 > numero2) {
            int aux = numero1;
            numero1 = numero2;
            numero2 = aux;
        }
        
        System.out.println("Números ordenados en forma ascendente: " + numero1 +
                ", " + numero2 + ", " + numero3);
    }
    
    public static void ordenarDescendente(int numero1, int numero2, int numero3) {
        if (numero1 < numero2) {
            int aux = numero1;
            numero1 = numero2;
            numero2 = aux;
        }
        
        if (numero2 < numero3) {
            int aux = numero2;
            numero2 = numero3;
            numero3 = aux;
        }
        
        if (numero1 < numero2) {
            int aux = numero1;
            numero1 = numero2;
            numero2 = aux;
        }
        
        System.out.println("Números ordenados en forma descendente: " + numero1 +
                ", " + numero2 + ", " + numero3);
    }
}
