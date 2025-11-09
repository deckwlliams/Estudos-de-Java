import java.util.Scanner;

public class FW009 {
    public static void main(String[] args) {
        Scanner tcd = new Scanner(System.in);
   int num = tcd.nextInt();
   int soma = 0;
   int contador = 0;

        for(int i = 1; i <= num; i++){
           soma+=i;
           contador++;
        }
        double media = (double)soma/contador;
        System.out.println("soma total : " + soma);
        System.out.println("media é " + media);

    }
}
