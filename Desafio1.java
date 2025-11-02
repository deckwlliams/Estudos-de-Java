import java.util.Scanner;
public class Desafio1{
    public static void main(String[] args) {
      
        Scanner tcd = new Scanner(System.in);
        int x;
        System.out.println("entre com um numero");
         x = tcd.nextInt();
         if(x % 2 == 0){
        System.out.println( x +" é par ");
         } else{
            System.out.println(x + " é impar");
         }
         tcd.close();


    }
}