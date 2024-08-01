import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu número: ");
        int number = scanner.nextInt();

        if(number % 2 == 0){
            System.out.println("O número "+number+" é par");
        }else {
            System.out.println("O número "+number+" é impar");
        }

        if (number >0) {
            System.out.println("Número positivo");
        }else {
            System.out.println("Número negativo");
        }
            scanner.close();
    }
}
