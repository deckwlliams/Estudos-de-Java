import java.util.Scanner; // Importa a classe Scanner para ler dados do teclado

public class Desafio4 {
    public static void main(String[] args) {

        Scanner tcd = new Scanner(System.in); // Cria um Scanner para ler entradas

        System.out.println("Entre com um número:");
        int num = tcd.nextInt(); // Lê o número digitado pelo usuário

        boolean primo = true; // Inicialmente assumimos que o número é primo

        // Se o número for menor ou igual a 1, não é primo
        if (num <= 1) {
            primo = false;
            // Exemplo de fluxo: num = 1 → primo = false
        } else {
            // Verifica divisores de 2 até a raiz quadrada de num
            for (int i = 2; i <= Math.sqrt(num); i++) {
                // Exemplo de fluxo:
                // num = 11, Math.sqrt(11) ≈ 3.316 → i vai de 2 a 3
                if (num % i == 0) { // Se num for divisível por i
                    primo = false;   // Não é primo
                    break;           // Sai do loop, já sabemos que não é primo
                    // Exemplo: num = 12
                    // i = 2 → 12 % 2 == 0 → primo = false → break
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
