import java.util.Scanner;

public class EJ7_Data_types {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        
        // Bucle while, que se ejecutará tantas veces como casos se hayan leído anteriormente
        while(cases -- > 0){
            try{
                // Lectura del número a evaluar para el caso actual
                long number = scanner.nextLong();
                System.out.println(number + " can be fitted in:");
                
                // Utilizamos los métodos MIN_VALUE y MAX_VALUE para determinar si el número leído
                // puede ser almacenado en uno o más de estos tipos de datos primitivos
                if(number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE){
                    System.out.println("* byte");
                }
                if(number >= Short.MIN_VALUE && number <= Short.MAX_VALUE){
                    System.out.println("* short");
                }
                if(number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE){
                    System.out.println("* int");
                }
                if(number >= Long.MIN_VALUE && number <= Long.MAX_VALUE){
                    System.out.println("* long");
                }
            }
            // Captura posibles excepciones que puedan surgir al leer los datos de entrada
            catch(Exception e){
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }
        }
        scanner.close();
    }
}

/*
        ENUNCIADO 
    
    Java has 8 primitive data types; char, boolean, byte, short, int, long, float, and double. For this exercise, we'll work with the primitives used to hold integer values (byte, short, int, and long):

    A byte is an 8-bit signed integer.
    A short is a 16-bit signed integer.
    An int is a 32-bit signed integer.
    A long is a 64-bit signed integer.
    Given an input integer, you must determine which primitive data types are capable of properly storing that input.

    Input 

    5
    -150
    150000
    1500000000
    213333333333333333333333333333333333  -> este numero no puede entrar ni en un byte, short, int o long
    -100000000000000

    formato input
    x  ----> es el numero de casos 
    n1  -> n es el numero al que se va a evaluar en que data types se puede almacenar 
    n2  -> se siguen leyendo el numeros de casos segun lo que se haya ingresado en x

    OUTPUT
    // salen dos lineas por lo que se le pidieron dos querys
     -150 can be fitted in:
         short
         int
         long
    150000 can be fitted in:
         int
         long
    1500000000 can be fitted in:
         int
         long
    213333333333333333333333333333333333 can't be fitted anywhere.
    -100000000000000 can be fitted in:
         long                        

 */