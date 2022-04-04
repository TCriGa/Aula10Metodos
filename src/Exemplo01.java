public class Exemplo01 {
    // Método sem retorno e sem paramêtro.
    public static void metodoSemRetornoSemParametro() {
        System.out.println("Exemplo de método");
    }

    // Método sem retorno e com parametro
    public static void exibeNomeUsuario(String nomeUsuario) {
        System.out.println("Olá " + nomeUsuario);
    }

    // Metodo com retorno e sem paramêtro
    public static int somatoria() {
        int resultadoSoma = 2 + 4;

        return resultadoSoma;
    }

    // Metodo com retorno e com parametro
    public static int multiplicacao(int numeroA, int numeroB) {
        int resultado = numeroA * numeroB;
        System.out.println("O resultado é: " + resultado);

        return resultado;
    }

    public static void main(String[] args) {
        metodoSemRetornoSemParametro();
        exibeNomeUsuario("Thay");
        exibeNomeUsuario("Cristian");
        System.out.println(somatoria());
        multiplicacao(5, 5);
    }
}
