import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Passo 1: Ler os três valores inteiros
        System.out.print("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();

        System.out.print("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();

        System.out.print("Digite o terceiro valor: ");
        int valor3 = scanner.nextInt();

        // Fechar o scanner
        scanner.close();

        // Passo 2: Comparar e determinar a ordem decrescente
        int maior, medio, menor;

        // Encontrar o maior valor
        if (valor1 >= valor2 && valor1 >= valor3) {
            maior = valor1;
            if (valor2 >= valor3) {
                medio = valor2;
                menor = valor3;
            } else {
                medio = valor3;
                menor = valor2;
            }
        } else if (valor2 >= valor1 && valor2 >= valor3) {
            maior = valor2;
            if (valor1 >= valor3) {
                medio = valor1;
                menor = valor3;
            } else {
                medio = valor3;
                menor = valor1;
            }
        } else {
            maior = valor3;
            if (valor1 >= valor2) {
                medio = valor1;
                menor = valor2;
            } else {
                medio = valor2;
                menor = valor1;
            }
        }

        // Passo 3: Imprimir os valores em ordem decrescente
        System.out.println("Os valores em ordem decrescente são:");
        System.out.println(maior);
        System.out.println(medio);
        System.out.println(menor);
    }
}
