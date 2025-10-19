import java.util.Scanner;
public class TesteWhile {
    public static void main(String[] args) {
        Scanner tcd = new Scanner(System.in);
        int numero, resultado, contador;

        System.out.println("Digit um numero");
        numero = tcd.nextInt();
        
        contador = 1;
        while (contador <= 10) { 
            resultado = numero * contador;
            System.out.println(numero + "x" + contador + "=" + resultado);
            contador = contador + 1;
        }
        

    }
}
