import java.util.Scanner;

public class Exercicio03 {
    /**
     * Faça um algoritmo que contenha uma função que calcule o IMC de um
     * usuário a partir da inserção do seu peso e de sua altura. Exiba a
     * classificação do usuário após a verificação do seu IMC.
     */

    public static void main(String[] args) {
        calculoImc(0);

    }

    public static double calculoImc(double imc) {
        try (Scanner calcularImc = new Scanner(System.in)) {
            System.out.println("Digite sua altura: ");
            double altura = calcularImc.nextDouble();

            System.out.println("Digite o seu peso: ");
            double peso = calcularImc.nextDouble();

            imc = (peso / Math.pow(altura, 2));

            if (imc <= 18.5) {
                System.out.println("Magreza");
            } else if (imc >= 18.5 && imc <= 24.9) {
                System.out.println("Normal");
            } else if (imc >= 25.0 && imc <= 29.9) {
                System.out.println("Sobrepeso Grau I");
            } else if (imc >= 30.0 && imc <= 39.9) {
                System.out.println("Obesidade - Grau II");
            } else if (imc >= 40) {
                System.out.println("Obesidade grave - Grau III");
            }

            return imc;
        }

    }

}
