import java.util.Scanner;

public class FW013 {
    public static void main(String[] args) {
        Scanner tcd = new Scanner(System.in);
      
        int n = 0;
        n = tcd.nextInt();

        if(n <= 0){
            System.out.println("numero maior que zero");
            return;
        }

        if (n == 1) {
            System.out.println("Sequência: 0");
            return;
        }

        if (n == 2) {
            System.out.println("Sequência: 0, 1");
            return;
        }

        int array[] = new int[n];
        array[0] = 0;
        array[1] = 1;

        System.out.print(array[0] + " ");
        System.out.print(array[1] + " ");

        
        for(int i = 2; i < n; i++){
            array[i] = array[i - 1] + array[i - 2];
            System.out.print(array[i] + " ");
        }

        tcd.close();
    }
}
