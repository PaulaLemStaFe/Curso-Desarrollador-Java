package com.mycompany.clase04lemosejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Clase04LemosEjerciciosGuíaEjercicio3 {
    
    public static void main(String[] args) {
        
        String pathArchivoEntrada = "Recursos/ArchivoDeEntrada.txt";
        // El path del archivo de entrada que contiene el texto a codificar o decodificar.
        String pathArchivoSalida = "Recursos/ArchivoDeSalida.txt";
        // El path del archivo donde se almacenará el resultado.
        int desplazamiento = 3;
        // El número de desplazamiento para la codificación o decodificación.
        String operacion = "decodificar";
        // Debe ser "codificar" o "decodificar" para especificar la operación deseada.
        
        /* Este código lee el archivo de entrada línea por línea, realiza la operación
           de codificación o decodificación según el parámetro proporcionado y escribe 
           el resultado en el archivo de salida. Finalmente, muestra un mensaje indicando 
           si el proceso se completó correctamente o si hubo un error. */

        try {
            BufferedReader reader = new BufferedReader(new FileReader(pathArchivoEntrada));
            BufferedWriter writer = new BufferedWriter(new FileWriter(pathArchivoSalida));
            /* "BufferedReader" es una clase en Java que se utiliza para leer texto de manera 
               eficiente desde una fuente de entrada, como un archivo o una secuencia de 
               caracteres. La principal ventaja de usar un "BufferedReader" es que almacena
               internamente un búfer de datos, lo que significa que no tiene que acceder 
               físicamente al archivo cada vez que lee un carácter o una línea. Esto mejora 
               significativamente el rendimiento en comparación con la lectura directa de 
               caracteres. En este código se usa "BufferREader" para leer líneas de un archivo
               de entrada.
            
               "BufferedWriter" es una clase en Java que se utiliza para escribir texto de manera
               eficiente en una fuente de salida, como un archivo. Al igual que "BufferedReader",
               "BufferedWriter" utiliza un búfer interno para almacenar los datos antes de 
               escribirlos físicamente en el archivo. Esto mejora el rendimiento al reducir el 
               número de operaciones de escritura en disco. En este código se usa "BufferWriter"
               para escribir líneas en un archivo de salida.*/

            String linea;
            while ((linea = reader.readLine()) != null) {
                String resultado = "";

                if (operacion.equals("codificar")) {
                    resultado = codificar(linea, desplazamiento);
                } else if (operacion.equals("decodificar")) {
                    resultado = decodificar(linea, desplazamiento);
                } else {
                    System.out.println("Operación no válida. Use 'codificar' o 'decodificar'.");
                    return;
                }

                writer.write(resultado);
                writer.newLine();
            }

            reader.close();
            writer.close();

            System.out.println("Proceso completado correctamente.");

        } catch (IOException e) {
            System.out.println("Error al procesar archivos: " + e.getMessage());
        }
    }

    // Función que realiza la codificación de una línea.
    private static String codificar(String linea, int desplazamiento) {
        return procesarLinea(linea, desplazamiento, 1);
    }

    // Función que realiza la decodificación de una línea.
    private static String decodificar(String linea, int desplazamiento) {
        return procesarLinea(linea, desplazamiento, -1);
    }

    // Es una función de utilidad que procesa una línea de texto con el 
    // desplazamiento y el ajuste apropiados.
    private static String procesarLinea(String linea, int desplazamiento, int ajuste) {
        StringBuilder resultado = new StringBuilder();
        /* "StringBuilder" es una clase en Java que se utiliza para crear y manipular cadenas
           de caracteres de manera eficiente. A diferencia de la clase String, que es inmutable
           (no se puede cambiar después de su creación), "StringBuilder" proporciona métodos 
           para agregar, eliminar o modificar caracteres en una cadena de manera más eficiente.
           Esto es útil cuando necesitas construir cadenas de caracteres dinámicamente, como en
           el caso de la construcción de resultados codificados o decodificados en este código. */

        for (char caracter : linea.toCharArray()) {
            if (Character.isLetter(caracter)) {
                char base = Character.isLowerCase(caracter) ? 'a' : 'A';
                char resultadoChar = (char) (((caracter - base + desplazamiento * 
                        ajuste + 26) % 26) + base);
                
/* Esta línea de código se utiliza para codificar o decodificar un carácter individual en función
   del desplazamiento y el ajuste proporcionados:
        --> "caracter": Es el carácter que se va a codificar o decodificar.
        --> "base": Es un carácter base que se usa para determinar si el carácter es mayúscula
                    o minúscula ('a' o 'A'). Esto es necesario porque el código está diseñado para
                    manejar letras tanto en mayúsculas como en minúsculas.
        --> "desplazamiento": Es el número de posiciones que se desplazará el carácter en el
                              alfabeto. Si es positivo, se está codificando; si es negativo, se
                              está decodificando.
        --> "ajuste": Es un valor que toma el valor 1 si se está codificando y -1 si se está
                      decodificando. Se utiliza para ajustar la dirección del desplazamiento en
                      función de si se está codificando o decodificando.
   Ahora, la expresión en sí misma:
        --> "(caracter - base + desplazamiento * ajuste + 26)": Esto calcula el índice relativo 
                del carácter en el alfabeto (donde 'a' o 'A' serían 0, 'b' o 'B' serían 1, y así
                sucesivamente), teniendo en cuenta el desplazamiento y el ajuste.
        --> "((caracter - base + desplazamiento * ajuste + 26) % 26)": Esto asegura que el índice
                calculado esté dentro del rango de 0 a 25, incluso si el desplazamiento hace que
                el cálculo sea negativo o mayor que 25. El operador % realiza una operación de
                módulo, que asegura que el resultado esté dentro de este rango.
        --> "((caracter - base + desplazamiento * ajuste + 26) % 26) + base": Después de calcular
                el índice relativo dentro del rango 0-25, se agrega nuevamente base para obtener
                el carácter resultante en el alfabeto.
        --> "(char)": Finalmente, el resultado se convierte en tipo char para representar el
                carácter codificado o decodificado.
   En resumen, esta línea de código realiza cálculos para desplazar un carácter en el alfabeto,
   aplicando un desplazamiento y un ajuste, y asegura que el resultado esté dentro del rango de
   letras válidas. */

                resultado.append(resultadoChar);
            } else {
                resultado.append(caracter);
            }
        }

        return resultado.toString();
    }
}
