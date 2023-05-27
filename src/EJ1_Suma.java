import java.util.*;

public class EJ1_Suma {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner entrada= new Scanner(System.in);
        
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c=a+b;
        
        System.out.println(c);

        entrada.close();
    }
}