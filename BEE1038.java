import java.security.Principal;
import java.util.Scanner;
public class BEE1038 {
     public static void main(String[] args) {
         Scanner tcd = new Scanner(System.in);
         int cod, qtd;
         double total = 0;

cod = tcd.nextInt();
qtd = tcd.nextInt();

if (cod == 1){
    total = qtd * 4.0;
}
else if (cod == 2) {
    total = qtd * 4.50;
}
else if (cod == 3){
         total = qtd * 5.0;
    }
    else if(cod == 4){
             total = qtd * 2.0;
        }
     else if (cod == 5){
 total = qtd * 1.50;
        }
        
System.out.println("Total: R$"+ total);
    }
    
}


     


