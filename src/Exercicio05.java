import java.util.Scanner;

public class Exercicio05 {
    /**
     * Ler uma temperatura em graus Celsius e apresentá-la convertida em
     * graus Fahrenheit. A fórmula de conversão é: F=(9*C+160) / 5, sendo F
     * a temperatura em Fahrenheit e C a temperatura em Celsius.
     */

    public static void main(String[] args) {
        temperaturaCeF();

    }

    public static double temperaturaCeF() {
        try (Scanner temperatura = new Scanner(System.in)) {
            double Fahrenheit;
            System.out.println("Informe a temperatura em Celsius");
            double c = temperatura.nextDouble();

            Fahrenheit = (((9 * c) + 160) / 5);

            System.out.println("A temperatura em Fahrenheit é = " + Fahrenheit);

            return Fahrenheit;
        }

    }
}
