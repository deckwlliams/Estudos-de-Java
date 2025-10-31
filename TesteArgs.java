public class TesteArgs {
    public static void main(String[] args) {
        System.err.println("numero de elementos na linha de comando");
        System.out.println(args.length);
        for(int pos = 0; pos < args.length; pos++){
            System.out.println("Elemento = " + args[pos]);
        }
    }
}
