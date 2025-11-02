import java.util.Scanner; 
public class Desafio3 {
    public static void main(String[] args) {

        Scanner tcd = new Scanner(System.in);
        int contador = 0; 
        double media, soma = 0; 
        double nota[] = new double[5]; 
        for (int i = 0; i < 5; i++) {
            System.out.println("Entre com sua nota");
            nota[i] = tcd.nextDouble();
            soma += nota[i];
        }

        media = soma / 5; 
        System.out.println("Média da turma: " + media);
        for (int i = 0; i < 5; i++) {
            if (nota[i] > media) { 
                contador++; 
            }
        }

        System.out.println(contador + " alunos ficaram acima da média");
        tcd.close(); 
    }
}
