import java.util.Scanner;
 public class TesteFor {
    public static void main(String[] args) {
        Scanner tcd = new Scanner(System.in);
        int num, res;
        System.out.println("Digite um numero");
        num = tcd.nextInt();
        for(int cont = 1; cont <= 10; cont = cont + 1){
            if(cont == 5){
                break;
            }
        res = num * cont;
System.out.println(num + " x " + cont + " = " + res);
        }
        tcd.close();
    }
}
