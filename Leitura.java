
import java.util.Scanner;
public class Leitura {
    public static void main(String[] args) {
// Linha de comando para usar o teclado
        Scanner tcd = new Scanner(System.in);
/*int a;
float b;
double c;
System.out.println("Por favor, entre com numero inteiro");
// utilizar o teclado
a = tcd.nextInt();
System.out.println("voce digitou " + a);
System.out.println("Por favor, entre com numero float");
b = tcd.nextFloat();
System.out.println("voce digitou " + b);
System.out.println("Por favor, entre com numero double");
c = tcd.nextDouble();
System.out.println("voce digitou " + c) ;
*/

String nome;
int codigo;   
double salario;  

System.out.println("escreva seu nome");
nome = tcd.nextLine();
System.out.println("seu nome é " + nome);

System.out.println("digite seu codigo");
// linhas de conversão de int para string - 2 linahs seguintes
//txtCod = tcd.nextLine();
//codigo = Integer.parseInt(txtCod);

//forma curta de conersão
codigo = Integer.parseInt(tcd.nextLine());
System.out.println("digite seu salario");
salario = Double.parseDouble(tcd.nextLine()); 
System.out.println("seu nome é " + nome + " e seu codigo é " + codigo + " seu salario é R$" + salario) ;
tcd.close();

    }
}
