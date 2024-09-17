import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        int tentativa;
        boolean acertou = false;

        System.out.println("Adivinhe o número entre 1 e 100!");

        while (!acertou) {
            System.out.print("Digite seu palpite: ");
            tentativa = scanner.nextInt();

            if (tentativa < numeroSecreto) {
                System.out.println("Muito baixo! Tente novamente.");
            } else if (tentativa > numeroSecreto) {
                System.out.println("Muito alto! Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou o número!");
                acertou = true;
            }
        }

        scanner.close();
    }
}
