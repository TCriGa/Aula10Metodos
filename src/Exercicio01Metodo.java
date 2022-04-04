import java.util.Scanner;

/**
 * Faça um algoritmo que contenha um método que receba um número do
 * usuário e realize a somatório de todos os números no intervalo de 1 até o
 * número digitado pelo usuário. Exiba o resultado final da somatória.
 */
public class Exercicio01Metodo {
    public static void main(String[] args) {
        somatoria();
    }

    public static int somatoria() {
        try (Scanner somaIntervalo = new Scanner(System.in)) {
            System.out.println("Digite um número: ");
            int n = somaIntervalo.nextInt();

            int soma = 0;
            for (int i = 0; i <= n; i++) {
                soma = soma + i;

            }
            System.out.printf("\nO valor da Soma é \n " + soma);
            return soma;
        }

    }

}
