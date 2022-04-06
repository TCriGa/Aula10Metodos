import java.util.Scanner;

public class Exercicio01 {
    /**
     * Escreva um programa que receba dois números e ao final mostre a
     * soma, subtração, multiplicação e a divisão dos números lidos
     */

    public static void main(String[] args) {
        try (Scanner operacao = new Scanner(System.in)) {
            System.out.println("Digite o valor de X: ");
            double x = operacao.nextDouble();

            System.out.println("Digite o valor de Y: ");
            double y = operacao.nextDouble();

            double soma = (x + y);
            double subtração = (x - y);
            double multiplicação = (x * y);
            double divisao = (x / y);
            System.out.printf("\nO valor da soma é = \n" + soma);
            System.out.printf("\nO valor da subtração é = \n" + subtração);
            System.out.printf("\nO valor da multiplicação é = \n" + multiplicação);
            System.out.printf("\nO valor da divisão é = \n" + divisao);
        }

    }

    public static void operaçãoAritmetica(double soma, double subtração, double multiplicação, double divisao) {
        operaçãoAritmetica(soma, subtração, multiplicação, divisao);

    }
}
