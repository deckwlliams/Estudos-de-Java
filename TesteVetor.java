import java.util.Scanner;
public class TesteVetor{
    public static void main(String[] args) {
        Scanner tcd = new Scanner(System.in);
        double notas[];
        notas = new double[5];

        for (int pos = 0; pos < 5; pos++){
        System.out.println("Digit a nota do aluno " + pos);
        notas [pos] = tcd.nextDouble();
        }
for(int pos = 0; pos < 5; pos ++){
        System.out.printf("nota do aluno %d = %.2f\n", pos, notas[pos]);

}
        tcd.close();
    }
}
