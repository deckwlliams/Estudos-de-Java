import java.util.Scanner;
public class BEE1037 {
    public static void main(String[] args) {
        
    Scanner tcd = new Scanner(System.in);

    double valor;
    valor = tcd.nextDouble();

    if(valor >= 0 && valor <=25){
System.out.println("Imtervalo [0,25]");
    }
    else if (valor > 25 && valor <= 50){
System.out.println("Imtervalo[25.50]");
    }
    else if (valor > 75 && valor <= 100){
        System.out.println("Intervalo[75,100]");
    }
    else {
        System.out.println("Fora do inetervalo");
    }
    }

}
