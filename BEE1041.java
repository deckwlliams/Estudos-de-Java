import java.util.Scanner;
public class BEE1041 {
    public static void main(String[] args) {
       Scanner tcd = new Scanner(System.in);
       
       double x, y;
       x = tcd.nextDouble();
       y = tcd.nextDouble();

       if( x > 0 && y > 0 ){
        System.out.println("Q1");
       }
       else if (x < 0 && y > 0){
        System.out.println("Q2");
       }
       else if (x < 0 && y < 0 ){
        System.out.println("Q3");
       }
       else if (x > 0 && y < 0 ){
        System.out.println("Q4");
       }
       else if (x == 0 & y == 0){
        System.out.println("Origem");
       }
       else if (x == 0 && y != 0){
        System.out.println("Eixo Y");
       }
       else if (x != 0 && y == 0){
        System.out.println("Eixo X");
       }
    }
}
