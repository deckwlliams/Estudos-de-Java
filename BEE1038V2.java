import java.util.Scanner;
public class BEE1038V2 {
    public static void main(String[] args) {
        Scanner tcd = new Scanner(System.in);

        System.out.println("Escreva um valor");
        int valor = tcd.nextInt();

int qtd, cod;
double total = 0;
cod = tcd.nextInt();
qtd = tcd.nextInt();

switch (cod) {
    case 1 -> total = qtd * 4.0;
        case 2 -> total = qtd * 4.50;
        case 3 -> total = qtd * 5.00;
        case 4 -> total = qtd * 2.00;
        case 5 -> total =  qtd * 1.50;

}
System.out.println("Total: R$" + total);

               tcd.close();
    }
}
