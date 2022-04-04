import java.util.Scanner;

public class Exemplo03 {
    // Colocando os paramêtros dentro do método criado.
    public static void main(String[] args) {
        nomeESobrenome();

    }

    public static void nomeESobrenome() {
        try (Scanner nomeSobrenomeScanner = new Scanner(System.in)) {
            System.out.println("Digite o seu nome: ");
            String nomeN = nomeSobrenomeScanner.nextLine();

            System.out.println("Escreva o seu sobrenome: ");
            String sobrenome = nomeSobrenomeScanner.nextLine();

            System.out.println("Olá " + nomeN + " " + sobrenome);
        }

    }

}
