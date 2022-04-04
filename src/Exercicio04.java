import java.util.Scanner;

public class Exercicio04 {
    /**
     * Faça um algoritmo que contenha uma função para ler as dimensões de
     * um retângulo (base e altura), calcular e imprimir para o usuário a área do
     * retângulo;
     */

    public static void main(String[] args) {

        calculoRetangulo(0);

    }

    public static void calculoRetangulo(double area) {
        try (Scanner dimensão = new Scanner(System.in)) {
            System.out.println("Digite a base do retangulo: ");
            double base = dimensão.nextDouble();

            System.out.println("Digite a altura do retangulo: ");
            double altura = dimensão.nextDouble();

            area = (base * altura);
        }

        System.out.println("A área do retangulo é = " + area);

    }

}
