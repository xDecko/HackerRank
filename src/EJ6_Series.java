import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EJ6_Series {
    public static void main(String[] args) throws IOException {

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int queries = Integer.parseInt(buffer.readLine());

        for (int i = 0; i < queries; i++) {

            // Lee los valores de a, b, y n como un String y los separa con split() usando un espacio como delimitador
            String[] inputs = buffer.readLine().split(" ");

            // Convierten el arreglo guardado por el buffer en las variables de la ecuación
            int a = Integer.parseInt(inputs[0]); 
            int b = Integer.parseInt(inputs[1]); 
            int n = Integer.parseInt(inputs[2]); 

            // Inicializa el valor de resultado en a para asignarla en la ecuacion que esta en el for
            int resultado = a;

            // Itera desde 0 hasta n-1
            for (int j = 0; j < n; j++) {
                resultado += (int) Math.pow(2, j) * b;   //esta linea es -> (a + (2^j) * b), en la primera iteracion  resultado = (a)
                // en la segunda iteracion resultado esta almacenado y solo se le suma la parte de la ecuacion que le falta (2^j)*b
                System.out.print(resultado + " "); 
            }

            System.out.println(); // Imprime una línea en blanco para separar los resultados de cada query
        }

        buffer.close();
    }
}

/*
    
        Ecuación 
    
    (a+(2^0)·b) , (a+(2^0)·b + (2^1)·b) , . . . ‚ (a+(2^0)·b + (2^1)·b + . . . + (2^(n-1))·b)
    
    
    Input 
    2  
    0 2 10
    5 3 5

    formato input
    x  ----> es el numero de querys 
    a b n -> n es el numero de series de cada query 
    a b n 

    OUTPUT
    // salen dos lineas por lo que se le pidieron dos querys
    2 6 14 30 62 126 254 510 1022 2046      //salen 10 series ya que n = 10  
    8 14 26 50 98                           

 */