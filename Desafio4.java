import java.util.Scanner; // Importa a classe Scanner para ler dados do teclado

public class Desafio4 {
    public static void main(String[] args) {

        Scanner tcd = new Scanner(System.in); 

        System.out.println("Entre com um número:");
        int num = tcd.nextInt(); 
        boolean primo = true; 
        if (num <= 1) {
            primo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) { 
                    primo = false;  
                    break;         
                }
            }
        }

        // Mostra o resultado final
        if (primo) {
            System.out.println(num + " é um número primo");
        } else {
            System.out.println(num + " é um número comum");
        }

        tcd.close(); // Fecha o Scanner
    }
}
