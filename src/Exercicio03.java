import java.util.Scanner;

public class Exercicio03 {
    /**
     * Escrever um programa que leia o nome de um vendedor, o seu salário fixo e o
     * total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este
     * vendedor ganha 15%
     * de comissão sobre suas vendas efetuadas, informar o seu nome, o salário fixo
     * e salário no final do mês
     */

    public static void main(String[] args) {
        salarioMes();
    }

    public static void salarioMes() {
        try (Scanner vendedor = new Scanner(System.in)) {
            System.out.println("Digite o nome do vendedor: ");
            String nome = vendedor.nextLine();

            System.out.println("Digite o seu salário fixo: ");
            double salario = vendedor.nextDouble();

            System.out.println("Digite o total de vendas efetuadas");
            int vendas = vendedor.nextInt();

            double comissao = vendas * 0.15;
            double salarioTotal = salario + comissao;

            System.out.println("Nome do Vendedor: " + nome);
            System.out.println("Salário fixo = " + salario);
            System.out.println("Salário total = " + salarioTotal);
        }

    }
}
