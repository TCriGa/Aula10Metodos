import java.util.Scanner;

public class Exercicio02 {
    /**
     * Faça um algoritmo que contenha uma função que receba o nome de um
     * usuário e retorne a mensagem Meu nome é <NomeDigitado>.
     */
    public static void main(String[] args) {
        nomeDigitado();
    }

    public static String nomeDigitado() {
        try (Scanner nome = new Scanner(System.in)) {
            System.out.println("Digite o seu nome: ");
            String nomeDigitado1 = nome.nextLine();
            System.out.println("Meu nome é " + nomeDigitado1);

            return nomeDigitado1;
        }

    }
}
