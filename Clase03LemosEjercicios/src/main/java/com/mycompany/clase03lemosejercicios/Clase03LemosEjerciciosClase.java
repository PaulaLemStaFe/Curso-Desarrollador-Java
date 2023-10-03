package com.mycompany.clase03lemosejercicios;

public class Clase03LemosEjerciciosClase {
    
    public static void main(String[] args) {
        /* Lado Izquierdo: declaramos el array
           Lado Derecho: se crea el array o asignamos valores*/
        int numeros[] = new int[3];
        
        // numeros[POSICION EN EL ARRAY]
        numeros[0] = 1;
        numeros[1] = 10;
        numeros[2] = 32;
        
        // Prueba del valor almacenado
        // System.out.println(numeros[2]);
        
        // Otra forma de asignar valores a un array
        int numeros2[] = {1, 23, 32, 40};
        
        // numeros[1] = 10;
        
        // Otra forma de asignar y crear valores a un array
        int numeros3[] = new int[] {1, 23, 32, 40};
        
        //System.out.println("Cantidad de elementos que tiene el array: " + numeros2.length);
        
        System.out.println("Imprimo la dirección en memoria: " + numeros2);
        System.out.println("Los valores del array son: " + numeros2[0] + ", " + numeros2[1] + ", "
         + numeros2[2] + ", " + numeros2[3]);
        
        /* Para no estar escribiendo a mano cada uno de los índices para realizar 
           la impresión en pantalla, se puede utilizar el ciclo FOR */
        for (int i = 0; i < numeros3.length; i++ ) {
            System.out.println("El elemento en la posición " + (i + 1) + " es: " + 
                    numeros3[i]);
        }
        
        for (int num : numeros2) {
            System.out.println(num);
        }
        
        for (int i = 0; i < numeros3.length; i++ ) {
            numeros3[i] = numeros3[i] * 2;
            System.out.println("El elemento en la posición " + (i + 1) + " es: " + 
                    numeros3[i]);
        }
        
        // Array de letras
        char letras[] = {'a', 'e', 'i', 'o', 'u'};
        
        for (char letra : letras) {
            System.out.println(letra);
        }
        
        String txt1 = "Hola clase!";
        
        System.out.println(txt1);
        
        System.out.println(txt1.length());
        
        // Podemos interpretar a la clase String como un array de char, 
        // pero no estático
        char data[] = {'a', 'b', 'c'};
        String dataAString = new String(data);
        
        System.out.println(dataAString);
        
        dataAString = "abcdefghijk";
        
        System.out.println(dataAString.charAt(2));
        
        String entradaDelMetodoPrintlnParte1 = "hola";
        System.out.println(entradaDelMetodoPrintlnParte1);
        
        int numero = 2;
        String entradaDelMetodoPrintlnParte2 = "hola " + "qué tal: " + numero;
        System.out.println(entradaDelMetodoPrintlnParte2);
        
        String txt2 = "hola";
        String txt3 = "hola";
        /* Equals compara el string a un elemento específico. O sea, que estoy 
           comparando el string txt2 al elemento que está dentro de los 
           paréntesis del equals que es txt3 */
        if (txt2.equals(txt3)) {
            System.out.println("Si, es lo mismo.");
        }
        /* La diferencia con == es que compara las referencias, o sea los lugares
           adonde apunto. En este caso la referencia es la misma. 
           El Equals me compara los valores que están dentro del String y el == 
           compara la referencia a la que apunta la variable. */
        System.out.println(txt2.toUpperCase());
        System.out.println(txt2);
        
        String txt4 = "Hola";
        System.out.println(txt4.toLowerCase());
        
        // Función split
        String apellidoYNombre = "Lemos, María Paula";
        // Puedo usar el caracter coma (",") para dividir el String en 2
        String nombreYApellidoSeparados[] = apellidoYNombre.split(",");
        System.out.println(nombreYApellidoSeparados[0]);
        System.out.println(nombreYApellidoSeparados[1]);
        
        String datosPersonales = "María, Paula, Lemos, Mengeón";
        String datosSeparadoes[] = datosPersonales.split(",");
        System.out.println(datosSeparadoes[0]);
        System.out.println(datosSeparadoes[1]);
        System.out.println(datosSeparadoes[2]);
        System.out.println(datosSeparadoes[3]);
        
        String listaCompras = "lavandina café manteca sal té azúcar yerba fideos";
        for (String unaPalabra : listaCompras.split(" ")) {
            System.out.println(unaPalabra);
        }
        
        //Caracteres especiales para trabajar con String. 
        //En este caso "\n" indica un salto de línea.
        String dosLineas = "La casa.\nHola.";
        System.out.println(dosLineas);
        
        String txt5 = "holaa";
        if (txt5.contains("laa")) {//NO es lo mismo poner en minúscula que en mayúscula
            System.out.println("Si valida la condición.");
        } else {
            System.out.println("No valida la condición.");
        }
        
        /* Para validar o comparar si lo que guarda el elemento txt5 es lo 
           mismo, pero que ignore la diferencias entre las mayúsculas y 
           minúsculas. En cambio si se usa el EQUALS la condición será falsa.*/
        if (txt5.equalsIgnoreCase("HOLAA")) {//
            System.out.println("Si valida la condición.");
        } else {
            System.out.println("No valida la condición.");
        }
        /* Otra opción es usar txt5.toUpperCase().equals("HOLAA") si es que voy
           a comparar con un String que está todo en mayúscula.
        
           Otra función o método es "startWith" y sirve para comparar si 
           empieza con cierto string.
        
           Otro método es el "substring". En el caso de que, por ejemplo, un 
           string comience con un espacio; usamos este método para indicar de 
           qué posición del array arrancar y en qué posición finalizar. O sea, 
           se puede "cortar" el array.*/
        
        String abecede = "abcdefg";
        /* Podría transformar el String al código número de la tabla ASCII.
           O sea, pasar de las letras a los números.*/
        byte[] decodeBytes = abecede.getBytes();
        for (int letra : decodeBytes) {
            System.out.println(letra);
        }
        
        //EJEMPLO puedo tomar un array de bytes y transformar la frase de vuelta
        //byte[] array = {130};
        //String frase = new String([130]);
        
    }
}
