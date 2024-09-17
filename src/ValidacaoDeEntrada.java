import java.util.Scanner;

public class ValidacaoDeEntrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;

        do {
            System.out.print("Digite a sua idade (maior que 0): ");
            idade = scanner.nextInt();
        } while (idade <= 0);

        System.out.println("Idade válida: " + idade);

        scanner.close();
    }
}
