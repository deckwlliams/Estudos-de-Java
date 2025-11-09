import java.util.Scanner;

public class FW007 {
    public static void main(String[] args) {
        Scanner tcd = new Scanner(System.in);
         int num;
         num = tcd.nextInt();
         for(int i = 0; i <= 10; i++){
            int res = num * i;
            System.out.println(num + " x "+ i + " = "+ res);
         }
    }
}
