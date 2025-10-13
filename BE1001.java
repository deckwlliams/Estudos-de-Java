
import java.util.Scanner;

public class BE1001 {
    public static void main(String[] args) {
        Scanner tcd = new Scanner(System.in);
        int A, B, x ;
        
        A = tcd.nextInt();
        B = tcd.nextInt();

        x = A + B;
        System.out.println("X = " + x );
        tcd.close();
    }
}
