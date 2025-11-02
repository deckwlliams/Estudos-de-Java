import java.util.Scanner; // Importa Scanner para ler dados do teclado

public class Desafio5 {
    public static void main(String[] args) {

        Scanner tcd = new Scanner(System.in); // Cria Scanner

        System.out.println("Digite um número:");
        int num = tcd.nextInt(); // Lê o número digitado pelo usuário

        int invertido = 0; // Variável que vai armazenar o número invertido
        // Laço que continua enquanto o número tiver dígitos
        while (num > 0) {
            int digito = num % 10; // Pega o último dígito
            invertido = invertido * 10 + digito; // Adiciona o dígito ao número invertido
            num = num / 10; // Remove o último dígito do número original
        }

        System.out.println("Número invertido: " + invertido); // Mostra o resultado

        tcd.close(); // Fecha o Scanner
    }
}
