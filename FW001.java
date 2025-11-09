import java.util.Scanner;

public class FW001 {
    public static void main(String[] args) {
        Scanner tcd = new Scanner(System.in);
         int num;
         System.out.println("Entre com um numero");
         num = tcd.nextInt();

         for(int i = 0; i <= num; i++){
System.out.println(i);
         }
         tcd.close();
    }
}
