import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int number = scanner.nextInt();

        int anterior = number - 1;
        int posterior = number + 1;
        System.out.println("O número que vem antes de "+number+ " é: "+anterior);
        System.out.println("O número que vem depois de "+number+" é: "+posterior);
    }
}
