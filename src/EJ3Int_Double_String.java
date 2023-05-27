import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EJ3Int_Double_String {
    public static void main(String[] args) throws IOException {
        // Creamos un objeto BufferedReader para leer las entradas del usuario desde la consola
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in)); //Probe haciendolo con scanner pero al ingresar el input no lee bien las lineas


        // Leemos la primera línea que representa un entero, utilizando el método readLine() del objeto BufferedReader
        // Luego, utilizamos el método trim() para eliminar los espacios en blanco al inicio y al final de la cadena
        // Finalmente, convertimos la cadena a un entero utilizando el método parseInt() de la clase Integer
        int entero = Integer.parseInt(buffer.readLine().trim());

        // Leemos la segunda línea que representa un double, utilizando el método readLine() del objeto BufferedReader
        // Luego, utilizamos el método trim() para eliminar los espacios en blanco al inicio y al final de la cadena
        // Finalmente, convertimos la cadena a un double utilizando el método parseDouble() de la clase Double
        double decimal = Double.parseDouble(buffer.readLine().trim());

        // Leemos la tercera línea que representa una cadena, utilizando el método readLine() del objeto BufferedReader
        // Como no necesitamos eliminar espacios en blanco, simplemente llamamos al método readLine() sin utilizar trim()
        String texto = buffer.readLine();

        // Imprimimos las variables en el orden solicitado, utilizando la concatenación de cadenas y los operadores de suma (+)
        System.out.println("String: " + texto);
        System.out.println("Double: " + decimal);
        System.out.println("Int: " + entero);

        // Cerramos el objeto BufferedReader para liberar los recursos
        buffer.close();
    }
}

/*
    Sample Input

    42
    3.1415
    Welcome to HackerRank's Java tutorials! 

    OUTPUT
    String: Welcome to HackerRank's Java tutorials!
    Double: 3.1415
    Int: 42



*/
