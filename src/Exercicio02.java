import java.util.Scanner;

public class Exercicio02 {
    /**
     * Faça um programa que receba sete números e imprimir o menor número (suponha
     * números diferentes)
     * entre eles. Obs: use vetores para a resolução do exercício
     */
    public static void main(String[] args) {
        menorNumero();

    }

    public static double menorNumero() {
        try (Scanner vetor = new Scanner(System.in)) {
            double n = 7;
            double numeros[] = new double[(int) n];

            for (int i = 0; i < n; i++) {
                System.out.println("Escreva o " + (i + 1) + "º número");
                numeros[i] = vetor.nextDouble();
            }

            double menor = numeros[0];

            for (int i = 0; i < n; i++) {
                if (numeros[i] < menor) {
                    menor = numeros[i];

                }

            }
            System.out.printf("Menor Valor é = %.1f\n", menor);
            return menor;
        }
    }
}
