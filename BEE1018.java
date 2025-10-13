import  java.util.Scanner;
public class BEE1018 {
    public static void main(String[] args) {
        Scanner tcd = new Scanner(System.in);
 int valor, q100, q50, q20, q10, q5, q2, q1;
 int resto;

 // entrada 
 valor = tcd.nextInt();
 
 q100 = valor / 100;
 resto = valor % 100;

 q50 = valor / 50;
 resto = valor % 50;

 q20 = valor / 20;
 resto = valor / 20;

 q10 = valor / 10;
 resto = valor % 10;

 q5 = valor / 5;
 resto = valor % 5;

 q2 = valor / 2;
 valor = valor %  2;

 q1 = valor / 2 ;
 resto = resto % 2;

// saida 
System.out.println(valor);
System.out.println(q100 + " nota(s) de R$ 100,00");
System.out.println(q50 + " nota(s) de R$ 50,00");
System.out.println(q20 + " nota(s) de R$ 20,00");
System.out.println(q10 + " nota(s) de R$ 10,00");
System.out.println(q5 + " nota(s) de R$ 5,00");
System.out.println(q2 + " nota(s) de R$ 2,00");
System.out.println(q1 + " nota(s) de R$ 1,00");

        


        tcd.close();
}
}