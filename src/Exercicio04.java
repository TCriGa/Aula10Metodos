import java.util.Scanner;

public class Exercicio04 {
    /**
     * Escrever um programa que leia o nome de um aluno e as notas das
     * três provas que ele obteve no semestre. No final informar o nome do
     * aluno e a sua média (aritmética)
     * Obs: use vetores para a resolução do exercício
     */

    public static void main(String[] args) {
        mediaAlunos();

    }

    public static void mediaAlunos() {
        try (Scanner mediaVetor = new Scanner(System.in)) {

            System.out.println("Digite o nome do aluno: ");
            String nome = mediaVetor.nextLine();

            int n = 3;
            double nota[] = new double[n];

            for (int i = 0; i < n; i++) {
                System.out.println("Digite a " + (i + 1) + " ª nota:");
                nota[i] = mediaVetor.nextDouble();

            }

            double soma = 0;
            double mediaAritmetica = 0;

            for (int i = 0; i < n; i++) {
                soma = soma + nota[i];
            }

            mediaAritmetica = soma / n;

            System.out.println("Nome do aluno: " + nome);
            System.out.printf("\nA média aritmética é:  %.2f\n ", mediaAritmetica);

        }

    }

}
