
import java.util.Scanner;

public class FW014 {
    public static void main(String[] args) {
        Scanner tcd = new Scanner(System.in);
        int n;
        n = tcd.nextInt();
         if (n < 2) {
            System.out.println(n + " não é primo.");
            tcd.close();
            return;
        }
        if (n == 2) {
            System.out.println("2 é primo.");
            tcd.close();
            return;
        }
        if (n % 2 == 0) {               
            System.out.println(n + " não é primo (divisível por 2).");
            tcd.close();
            return;
        }
         int limite = (int) Math.sqrt(n);
        boolean primo = true;         

        for (int i = 3; i <= limite; i += 2) {
            if (n % i == 0) {          
                primo = false;
                break;               
            }
        }

        // 4) Resultado
        if (primo) {
            System.out.println(n + " é primo.");
        } else {
            System.out.println(n + " não é primo.");
        }

        // 5) Fechar scanner
        tcd.close();
   }
    }

