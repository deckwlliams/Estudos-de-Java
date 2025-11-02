import java.util.Scanner; // Importa a classe Scanner para ler dados do teclado

public class Desafio3 {
    public static void main(String[] args) {

        Scanner tcd = new Scanner(System.in); // Cria um Scanner para ler dados do teclado

        int contador = 0; // Contador de alunos acima da média
        double media, soma = 0; // Inicializa soma = 0, media será calculada depois
        double nota[] = new double[5]; // Cria um vetor para armazenar as notas de 5 alunos

        // Laço para ler notas
        for (int i = 0; i < 5; i++) {
            System.out.println("Entre com sua nota");
            nota[i] = tcd.nextDouble(); // Lê a nota e armazena no vetor

            // Comentário de fluxo:
            // Exemplo: se o usuário digita 7 na primeira iteração
            // i = 0
            // nota[0] = 7
            // soma = 0 + 7 = 7
            // próxima iteração: i = 1, usuário digita 8
            // nota[1] = 8
            // soma = 7 + 8 = 15
            // e assim por diante até i = 4
            soma += nota[i]; // Soma acumulada das notas
        }

        media = soma / 5; // Calcula a média
        // Comentário de fluxo:
        // Exemplo: soma = 35, média = 35 / 5 = 7
        System.out.println("Média da turma: " + media); // Exibe a média

        // Laço para contar alunos acima da média
        for (int i = 0; i < 5; i++) {
            if (nota[i] > media) { // Verifica se a nota está acima da média
                contador++; // Incrementa contador
                // Comentário de fluxo:
                // Exemplo: media = 7
                // nota[0] = 7 → não incrementa
                // nota[1] = 8 → contador = 1
                // nota[2] = 6 → não incrementa
                // nota[3] = 9 → contador = 2
                // nota[4] = 5 → não incrementa
            }
        }

        System.out.println(contador + " alunos ficaram acima da média"); // Exibe o total de alunos acima da média

        tcd.close(); // Fecha o Scanner
    }
}
