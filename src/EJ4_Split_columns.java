import java.util.Scanner;

public class EJ4_Split_columns {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Definir una variable booleana para controlar si se ha impreso el separador
        boolean separador = false;

        // Definir una variable para almacenar cada línea de entrada
        String line = "";

        // Ciclo do-while que se repetirá hasta que se introduzca una línea vacía
        do {
            // Leer una línea de entrada usando el método nextLine() de Scanner
            line = scanner.nextLine();

            // Evaluar si la línea no está vacía
            if (!line.isEmpty()) {
                // Si la línea no está vacía, procesarla

                // Evaluar si se ha impreso el separador
                if (!separador) {
                    // Si no se ha impreso el separador, imprimirlo y cambiar el valor de la
                    // variable separador a true
                    System.out.println("");
                    System.out.println("=================");
                    System.out.println("");
                    separador = true;
                }

                // Separar la línea en dos partes usando el método split() de la clase String cuando detecta un espacio split(" ");
                String[] parts = line.split(" "); //El array queda [nombre][numero]

                // Se asigna la primera posicion [0] a la variable (nombre) 
                //convierte la segunda posocion [1] a un entero usando el método parseInt()           
                String nombre = parts[0];
                int numero = Integer.parseInt(parts[1]);

                // Imprimir la cadena (nombre) justificada a la izquierda con un ancho de 15 caracteres
                // y el entero (numero) con tres dígitos
                System.out.printf("%-14.14s%03d\n"," "+ nombre, numero);
            }
        } while (!line.isEmpty()); // Continuar mientras la línea no esté vacía

        // Imprimir el separador después de haber procesado todas las líneas de entrada
        System.out.println("===================");

        scanner.close();
    }

}

/*
    Sample Input

    java 100
    cpp 65
    python 50


    OUTPUT

    =============================
        java           100 
        cpp            065 
        python         050 
    =============================
    
 */