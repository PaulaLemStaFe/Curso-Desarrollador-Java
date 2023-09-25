package com.mycompany.clase01lemosejercicios;

public class Clase01Ejercicio02Lemos {
    public static void main(String[] args) {
        float ingresosMensuales = 100000; // Ingresos mensuales totales del hogar equivalentes o superiores a $489.083
        int cantidadVehiculosMenosDe5Anios = 2; // Vehiculos con antigüedad menor a 5 (cinco) años
        int cantidadInmuebles = 1; // Cantidad de inmuebles
        int cantidadVehiculosLujo = 1; // Poseer embarcación, una aeronave de lujo o ser titular de activos societarios
        
        if (ingresosMensuales >= 489083 || cantidadVehiculosMenosDe5Anios >= 3 || cantidadInmuebles >= 3 || cantidadVehiculosLujo > 0) {
            System.out.println("El hogar pertenece al segmento de ingresos altos.");
        } else {
            System.out.println("El hogar NO pertenece al segmento de ingresos altos.");
        }
    }
}
