import  java.util.Scanner;
public class TesteStatus{
    public static void main(String[] args) {
        Scanner tcd = new Scanner(System.in);
        String status = tcd.nextLine();
        switch (status){
            case  "N":
            case  "n":
            case "Novo":
System.out.println("Status do pedido 1234: Novo");
break;
case "S":
case "s":
case "Separar":
System.out.println("Status do pedido 12345: Em sepração");
break;
case "F":
case "f":
case "Finalizar":
System.out.println("Status do pedido 12345: Finalizado");
break;
        }
    }
}