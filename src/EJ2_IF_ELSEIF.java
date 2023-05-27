import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EJ2_IF_ELSEIF {
    public static void main(String[] args) throws IOException {

        // Leer el número desde la entrada estándar
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());

        // Evaluar el número y mostrar el mensaje correspondiente
        if (N % 2 != 0) {
            System.out.println("Weird");

        } else if (N >= 2 && N <= 5) {
            System.out.println("Not Weird");

        } else if (N >= 6 && N <= 20) {
            System.out.println("Weird");

        } else if (N > 20) {
            System.out.println("Not Weird");
        }

        // Cerrar el lector
        bufferedReader.close();
    }
}
