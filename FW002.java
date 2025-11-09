
import java.util.Scanner;

public class FW002 {
    public static void main(String[] args) {
        Scanner tcd = new Scanner(System.in);
    
        int num;
        System.out.println("Entre com um numero");
        num = tcd.nextInt();
            for (int i = num; i >= 1; i--){
            System.out.println(i);
        }
    }
}
