
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

//Peça um número n e mostre a soma de todos os números de 1 até n.
/* 
int soma = 0;
int i = 1;

while(i <= num){
soma += i;
i++;
 System.out.println("A soma de 1 até " + num + " é: " + soma);


}
 */
/*
Peça ao usuário para digitar um número inteiro positivo n
e mostre o fatorial de n (ou seja, n! = n × (n−1) × (n−2) × ... × 1).

O programa deve exibir o resultado final do cálculo.

🔹 Exemplo:
Entrada: 5
Saída: O fatorial de 5 é 120

(pois 5 × 4 × 3 × 2 × 1 = 120)
 * 
 */

/*  int fatorial = 1;
 for(int i = 1; i<=num; i++){
    fatorial *= i;

 }
   System.out.println("O fatorial de " + num + " é " + fatorial);
*/
 int divisores = 0;

        for (int i = 1; i <= num; i++) {
            
            if (num % i == 0) {
                divisores++;
            }
        }
            if (divisores == 2){
                System.out.println("numero primo");
            }
            else{
                System.out.println("nao primo");
            }
    }
}
