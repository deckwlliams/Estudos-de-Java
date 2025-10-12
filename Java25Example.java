// Exemplo moderno em Java 25
import java.util.List;

public class Java25Example {
    public static void main(String[] args) {
        // Usando Text Block (multilinha)
        String mensagem = """
                Olá, este é um exemplo em Java 25!
                Podemos usar text blocks para strings longas
                sem precisar de concatenação.
                """;

        System.out.println(mensagem);

        // Usando Record (classe imutável)
        record Pessoa(String nome, int idade) {}
        Pessoa pessoa = new Pessoa("Derick", 22);
        System.out.println("Nome: " + pessoa.nome() + ", Idade: " + pessoa.idade());

        // Usando Pattern Matching para instanceof
        Object obj = "Olá mundo!";
        if (obj instanceof String s) {
            System.out.println("O comprimento da string é: " + s.length());
        }

        // Usando uma lista moderna
        List<Integer> numeros = List.of(1, 2, 3, 4, 5);
        numeros.forEach(n -> System.out.println("Número: " + n));
    }
}
