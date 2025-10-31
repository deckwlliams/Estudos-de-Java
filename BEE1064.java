import  java.util.Scanner;
public class BEE1064{
    public static void main(String[] args) {
        Scanner tcd = new Scanner(System.in);
        float valor, media = 0; 
        int valpos = 0;
for (int cont = 1; cont <= 6; cont++ ) {
valor = tcd.nextFloat();
if (valor > 0){
media = media + valor;
valpos++;

}
    
    }
System.out.println(valpos + " valores positivos");
tcd.close();
}
}