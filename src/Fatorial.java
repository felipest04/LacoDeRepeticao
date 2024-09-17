import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();

        int fatorial = 1;
        int i = 1;

        do {
            fatorial *= i;
            i++;
        } while (i <= numero);

        System.out.println("O fatorial de " + numero + " é " + fatorial);

        scanner.close();
    }
}
