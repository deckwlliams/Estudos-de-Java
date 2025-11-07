
import java.util.Scanner;

public class DesafioFor_While1 {
    public static void main(String[] args) {
        Scanner tcd = new Scanner(System.in);

        int num ;
        System.out.println("Entre com um numero");
        num = tcd.nextInt();

        /*
        //Mostre na tela os números de 1 a 10.
      
        for(int i = num; i < num + 10; i ++){
            System.out.println(i);
        }
            */

            //Mostre na tela os números de 10 até 1 (de trás pra frente).
       /*for (int i = num; i >= 1; i--){
    System.out.println(i);
}   */

//Peça um número n e mostre a soma de todos os números de 1 até n.
/* 
for(int i = 0; i < 10 ; i++){
System.out.println(num + " + " + i + " = " + (num + i));
}*/
int soma = 0;
int i = 1;

while(i <= num){
soma += i;
i++;
 System.out.println("A soma de 1 até " + num + " é: " + soma);


}
    }
}
