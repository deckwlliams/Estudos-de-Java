import java.util.Scanner;
public class TesteIF {
    public static void main(String[] args) {
        Scanner tcd = new Scanner (System.in);
        double n1, n2, me;

        System.out.println("Digite a N1: ");
        n1 = tcd.nextDouble();


        System.out.println("Digite a N2: ");
        n2 = tcd.nextDouble();

        me = (n1 + n2)/2;
        System.out.println("Sua media vale " + me);

if (n1 >= 5.0 && me >= 6.0) {
    System.out.println("Parabens!!! Aprovado! ");

}
else{
    System.out.println("Reprovado");
}

        tcd.close();
    }
}