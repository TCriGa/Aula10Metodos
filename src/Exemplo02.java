import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        try (Scanner nomeSobrenomeScanner = new Scanner(System.in)) {
            System.out.println("Digite o seu nome: ");
            String nomeN = nomeSobrenomeScanner.nextLine();

            System.out.println("Escreva o seu sobrenome: ");
            String sobrenome = nomeSobrenomeScanner.nextLine();

            nomeESobrenome(nomeN, sobrenome);
        }

    }

    public static void nomeESobrenome(String nome, String Sobrenome) {
        System.out.println("Olá " + nome + " " + Sobrenome);

    }

}
