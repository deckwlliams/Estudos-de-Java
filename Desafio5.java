import java.util.Scanner; // Importa Scanner para ler dados do teclado

public class Desafio5 {
    public static void main(String[] args) {

        Scanner tcd = new Scanner(System.in); 

        System.out.println("Digite um número:");
        int num = tcd.nextInt(); 

        int invertido = 0; 
        while (num > 0) {
            int digito = num % 10; // Pega o último dígito
            invertido = invertido * 10 + digito; // Adiciona o dígito ao número invertido
            num = num / 10; // Remove o último dígito do número original
        }

        System.out.println("Número invertido: " + invertido); 

        tcd.close(); 
    }
}
