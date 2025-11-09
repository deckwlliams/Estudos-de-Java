import java.util.Scanner;

public class FW008 {
    public static void main(String[] args) {
        Scanner tcd = new Scanner(System.in);
    int num = 0;
    int soma = 0; 
    num = tcd.nextInt();
    for(int i = 1; i <= num; i++){
        soma += i;
    }
    System.out.println(soma);
    }
}
