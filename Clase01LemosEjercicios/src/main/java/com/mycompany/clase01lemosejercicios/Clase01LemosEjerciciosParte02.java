package com.mycompany.clase01lemosejercicios;

import java.util.Scanner;

public class Clase01LemosEjerciciosParte02 {
    public static void main(String[] args) {
         // EJERCICIO 1 INCISO c
        System.out.println("EJERCICIO 1 INCISO c (hecho por el profesor):");
        
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Ingresa un numero de inicio:");
        int numeroInicioUsuario = Integer.parseInt(obj.nextLine());
        
        System.out.println("Ingresa un numero de fin:");
        int numeroFinUsuario = Integer.parseInt(obj.nextLine());
        
        System.out.println("Ingresa si queres imprimir los pares (p) o impares (i):");
        String textoUsuario = obj.nextLine();
        
        while (numeroInicioUsuario <= numeroFinUsuario) {
            switch (textoUsuario) {
                case "p":
                    if (numeroInicioUsuario % 2 == 0) {
                        System.out.println(numeroInicioUsuario);
                    }
                    break;
                case "i":
                    if (numeroInicioUsuario % 2 != 0) {
                        System.out.println(numeroInicioUsuario);
                    }
                    break;
                default:
                    System.out.println("Opcion ingresada es incorrecta");
                    break;
            }
            numeroInicioUsuario++;
        }
    }
}
