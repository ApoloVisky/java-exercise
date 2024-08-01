public class Test5 {
    public static void main(String[] args) {
        // Declaração das variáveis com valores para o salário mínimo e o salário do usuário
        float salarioMinimo = 1293.0F; // Atualizado para refletir valores reais
        float salarioUsuario = 5000.0F;

        // Calcula a quantidade de salários mínimos que o usuário recebe
        double quantosSalariosMinimos = salarioUsuario / salarioMinimo;

        // Exibe o resultado formatado
        System.out.printf("O usuário recebe %.2f salários mínimos.%n", quantosSalariosMinimos);
    }
}
