import java.io.*;

public class EJ5_Math_multiply {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bufferedReader.readLine().trim());

        for (int i = 1; i <= 10; i++) {

            int result = 0;
            result = number * i;

            System.out.println("noob " + number + " x " + i + " = " + result); // Manera trucha de imprimir las cosas
            // Los dos hacen lo mismo pero es mejor imprimir con formato
            System.out.printf("%d x %d = %d%n", number, i, result); // Manera de usar formato para imprimir

        }
        bufferedReader.close();
    }
}

/*
   
   Sample Input --> 2
   
   
   OUTPUT
   2 x 1 = 2
   2 x 2 = 4
   2 x 3 = 6
   2 x 4 = 8
   2 x 5 = 10
   2 x 6 = 12
   2 x 7 = 14
   2 x 8 = 16
   2 x 9 = 18
   2 x 10 = 20
   
 */
