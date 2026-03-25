import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número: ");
            int numero1 = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int numero2 = scanner.nextInt();

            if (numero1 > numero2) {
                throw new ParametrosInvalidosException();
            }

            int contagem = numero2 - numero1;

            for (int i = 1; i <= contagem; i++) {
                System.out.println("Imprimindo número " + i);
            }

        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

        scanner.close();
    }
}

class ParametrosInvalidosException extends Exception {
}
