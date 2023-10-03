package com.mycompany.clase03lemosejercicios;

public class Clase03LemosEjerciciosDiapositivas {

    public static void main(String[] args) {
        System.out.println("Clase 03: Ejercicios de las Diapositivas");
        // ARRAYS
        System.out.println("Página 5: Ejemplo de array de números");
        /* Del lado izquierdo del igual se declara la variable y del lado derecho se crea el array,
            el número dentro de los corchetes indica la cantidad de elementos que va a tener el array*/
        int numeros[] = new int[3]; // Asi se declara un arreglo o array que tendrá elementos que serán números enteros
        
        // Asignaciones:
        numeros[0] = 1;
        numeros[1] = 37;
        numeros[2] = 16;
        
        // Tambien puede inicializaarse directo con valores
        int numeros2[] = new int[] {1, 37, 16} ;
        
        System.out.println("Página 6: Ejemplo de array de números con for");
        System.out.println(numeros.length); // Imprime por pantalla la cantidad de elementos que tiene el array
        
        /* La sintaxis de punto (".") indica que estamos accediendo a una propiedad de la variable. Lo que vimos como 
            "tipos primitivos" no lo permiten, pero los ARRAYS tienen una fundamental: "LENGTH", que nos dice el tamaño del
            ARRAY. */
        int otroNum = 0;
        for (int indice = 0; indice < indice; indice++) {
            System.out.println(otroNum); // Imprime por pantalla cada elemento
        }
        
        System.out.println("Página 7: Sintaxis Básica de Vectores y Arrays Básicos");
        int numeros7[] = new int[10];
        char letras[] = {'a', 'b', 'c'};
        
        numeros7[0] = 10;
        numeros7[5] = 14;
        
        System.out.println(numeros7[5] / 7); // SALIDA: 2
        
        for (char letra : letras) {
            System.out.println(letra);
        } // SALIDA DE CADA FOR: a---b---c
        
        // STRINGS
        System.out.println("Página 10: Strings");
        String txt1 = "Hola!"; // Los STRINGS se declaran con comillas dobles
        String txt2 = "Chau!";
        
        txt1.charAt(2); // Sirve para acceder a caracter en particular, SALIDA: "l"
        
        System.out.println("Página 11: Operaciones con Strings");
        // Para concatenar se usa "+"
        String txt3 = txt1 + txt2; // Quedaría: "Hola!Chau!"
        String txt4 = txt1 + " " + txt2; // Quedaría: "Hola! Chau!"
        
        // Comparación, NO debe usarse el operador == para comparar Strings
        txt1.equals(txt2); // SALIDA: false
        txt1.equals(txt1); // SALIDA: true
        
        // Largo de un String
        txt1.length();
        
        System.out.println("Página 12: Operaciones con Strings (Continuación)");
        String unTexto = "laLA";
        
        // Pasar a mayúscula o minúscula
        String nuevoTexto = unTexto.toLowerCase() + unTexto.toUpperCase(); //lalaLALA
        /*Es importante notar que "toLowerCase" y "replace" NO cambian el valor 
          de la variable "unTexto", sino que retornan un nuevo STRING, que se 
          puede guardar en otra variable o imprimir en pantalla. Por ejemplo 
          se pueden encadener:*/
        "hola que tal?".replace ("hola", "chau").toUpperCase(); 
        // Salida: CHAU QUE TAL?
        
        // Indicar si contiene otro STRING
        unTexto.contains("la"); // SALIDA: true
        unTexto.contains("aL"); // SALIDA: true
        unTexto.contains("La"); // SALIDA: false
        
        // Ver si inicia o termina con otra cadena
        unTexto.startsWith("la");  // SALIDA: true
        unTexto.endsWith("LE"); // SALIDA: false
        
        // Reemplazar
        unTexto.replace("la", "le"); // SALIDA: leLA
        
        System.out.println("Página 13: Operaciones con Strings usando Split");
        /* El SPLIT convierte un String en un array de strings (String[]) a 
           partir de un separador*/
        String saludo = "hola que tal?";
        String[] saludoPartido1 = saludo.split(" ");
        // SALIDA: "hola", "que", "tal?"
        String[] saludoPartido2 = saludo.split("a");
        // SALIDA: "hol", " que t", "l?" (notar que los espacios se conservan)
        
        System.out.println("Página 14: Uso de Escape y caracteres especiales en un String");
        /*Los caracteres especiales sirven para escribir con palabras reservadas 
          o sintaxis que no soporta. En Java es la contrabarra ("\")*/
        
        // Ejemplo para Enter o cambio de línea
        System.out.println("hola que tal?\n");
        // "\n" es la forma de hacer un cambio de línea, Java no permite Strings multilínea
        
        // Ejemplo de tabulación (no es lo mismo que varios espacios)
        System.out.println("Pedro\t18\tprogramador\n");
        // "\t" escribe una tabulación
        
        // Para escribir una comilla doble (ya que se usan para declarar Strings)
        System.out.println("hola, \"que tal\""); 
        // con "\" se indica que se escapa el caracter
        
        // Para escribir una contrabarra "\"
        System.out.println("Esto es una contra barra \\");
        /* Con "\" escapamos de la misma "\", la salida de esto será:
           Esto es una contra barra \*/
    }
}
