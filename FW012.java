
import java.util.Scanner;

public class FW012 {
    public static void main(String[] args) {
        Scanner tcd = new Scanner(System.in);
        int num[] = new int[10];
        int soma = 0;
        for(int i = 0; i < 10; i++){
             System.out.print("Digite o número " + (i + 1) + ": ");
           num[i] = tcd.nextInt();
           soma+=num[i];
        }
        for(int i = 0; i < 10; i++){
        if(num[i] > 0){
            System.out.println("Positivo");
        }
        else{
            System.out.println("Negativo");
        }
        }
    }
}
