import java.util.Scanner;
public class Media {
    public static void main(String[] args) {
        Scanner tcd = new Scanner(System.in);
        
        double a, b, c, media;

        a = tcd.nextDouble();
        b = tcd.nextDouble();
        c = tcd.nextDouble();

        media = (a * 2 + b * 3 + c * 5)/10.0;
        System.out.println("media = " + media);
    }
}
