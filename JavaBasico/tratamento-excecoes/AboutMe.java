import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {
            System.out.print("Digite seu nome: ");
            String nome = scanner.next();
    
            System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("A idade deve ser númerica");
        }

        scanner.close();
    }
}
