import java.util.Scanner;
public class Desafio2 {
    public static void main(String[] args) {
        
        Scanner tcd = new Scanner(System.in);
        int x, res;
       
        System.out.println("entre com um numero");
         x = tcd.nextInt(); 
        for (int a = 1; a <=10; a++){
res = x * a;
System.out.println(x + " x " + a + " = " + res);
        }
        tcd.close();
    }
    
}
