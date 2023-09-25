package com.mycompany.clase01lemosejercicios;

import java.util.Scanner;

public class Clase01CategoriaMonotributo {
    public static void main(String[] args) {
        // CATEGORIA A: ingresos Brutos, Superficie Afectada, Energía Eléctrica
        double ingresosCatA = 748382.07;
        int supCatA = 30;
        int energiaCatA = 3330;
        
        // CATEGORIA B: ingresos Brutos, Superficie Afectada, Energía Eléctrica
        double ingresosCatB = 1112459.83;
        int supCatB = 45;
        int energiaCatB = 5000;
        
        // CATEGORIA C: ingresos Brutos, Superficie Afectada, Energía Eléctrica
        double ingresosCatC = 1557443.75;
        int supCatC = 60;
        int energiaCatC = 6700;
        
        // CATEGORIA D: ingresos Brutos, Superficie Afectada, Energía Eléctrica
        double ingresosCatD = 1934273.04;
        int supCatD = 85;
        int energiaCatD = 10000;
        
        // CATEGORIA E: ingresos Brutos, Superficie Afectada, Energía Eléctrica
        double ingresosCatE = 2277684.56;
        int supCatE = 110;
        int energiaCatE = 13000;
        
        // CATEGORIA F: ingresos Brutos, Superficie Afectada, Energía Eléctrica
        double ingresosCatF = 2847105.70;
        int supCatF = 150;
        int energiaCatF = 16500;
        
        // CATEGORIA G: ingresos Brutos, Superficie Afectada, Energía Eléctrica
        double ingresosCatG = 3416526.83;
        int supCatG = 200;
        int energiaCatG = 20000;
        
        // CATEGORIA H: ingresos Brutos, Superficie Afectada, Energía Eléctrica
        double ingresosCatH = 4229985.60;
        int supCatH = 200;
        int energiaCatH = 20000;
        
        // Datos de la persona a analizar
        /*double ingreso = 1112460;
        int superficie = 0;
        int energia = 0;*/
        
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Ingrese sus Ingresos Brutos:");
        float ingreso = Float.parseFloat(obj.nextLine());
        //Float.parseFloat(input);
        
        System.out.println("Ingrese su Superficie Afectada:");
        int superficie = Integer.parseInt(obj.nextLine());
        
        System.out.println("Ingrese la Energia Electrica consumida anualmente:");
        int energia = Integer.parseInt(obj.nextLine());
        
        if (ingreso < ingresosCatA && superficie < supCatA && energia < energiaCatA) {
            System.out.println("Es Categoria A.");
        } else {
            if (ingreso < ingresosCatB && superficie < supCatB && energia < energiaCatB) {
                System.out.println("Es Categoria B.");
            } else {
                if (ingreso < ingresosCatC && superficie < supCatC && energia < energiaCatC) {
                    System.out.println("Es Categoria C.");
                } else {
                    if (ingreso < ingresosCatD && superficie < supCatD && energia < energiaCatD) {
                        System.out.println("Es Categoria D.");
                    } else {
                        if (ingreso < ingresosCatE && superficie < supCatE && energia < energiaCatE) {
                            System.out.println("Es Categoria E.");
                        } else {
                            if (ingreso < ingresosCatF && superficie < supCatF && energia < energiaCatF) {
                                System.out.println("Es Categoria F.");
                            } else {
                                if (ingreso < ingresosCatG && superficie < supCatG && energia < energiaCatG) {
                                    System.out.println("Es Categoria G.");
                                } else {
                                    if (ingreso < ingresosCatH && superficie < supCatH && energia < energiaCatH)  {
                                        System.out.println("Es Categoria H.");
                                    } else {
                                        System.out.println("Es Responsable Inscripto.");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
