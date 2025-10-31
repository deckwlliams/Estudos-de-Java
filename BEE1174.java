import java.util.Scanner;

public class BEE1174 {
    public static void main(String[] args) {
        Scanner tcd = new Scanner(System.in);
double a[] = new double[100];

// primeira leitura
for(int i = 0; i<a.length; i++ ){
    a[i] = tcd.nextDouble();
}
for (int i = 0; i<a.length; i++) {
    System.out.printf("A[%d] = %.1f\n", i, a[i]);
}
    }
}
