import java.util.Scanner;

public class FW010{
    public static void main(String[] args) {
        Scanner tcd = new Scanner(System.in);
        int num[] = new int[5];
        int soma = 0;
int maior, menor;
          for (int i = 0; i < 5; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            num[i] = tcd.nextInt();
            soma += num[i];
        }
        maior = num[0];
        menor = num[0];

        for(int i = 1; i < 5; i++){
            if(num[i] > maior){
                maior = num[i];
            }
            if(num[i] < menor){
                menor = num[i];
            }
        }
         System.out.println("\nMaior número: " + maior);
        System.out.println("Menor número: " + menor);
        
    }
}