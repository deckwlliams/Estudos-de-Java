import java.util.Scanner;
public class BEE1035 {
    public static void main(String[] args) {
        Scanner tcd = new Scanner(System.in);

int a, b, c, d;
a = tcd.nextInt();
b = tcd.nextInt();
c = tcd.nextInt();
d = tcd.nextInt();

if (b > c && b > a &&(c + d > a + b) && (c > 0 && d > 0) && a %2 == 0){
System.out.println("Bons valores");
}else{
    System.out.println("Tristes valoress");
}

        tcd.close();
    }
    
}
