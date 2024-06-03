import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("----------------------------");
        System.out.println("Sejá Bem-vindo ao Banco");
        System.out.println("----------------------------");

        System.out.print("Digite seu nome: ");
        String nome = scan.nextLine();

        System.out.print("Digite o número da sua conta: ");
        int numero = scan.nextInt();

        scan.nextLine();

        System.out.print("Digite o número da Agência: ");
        String agencia = scan.nextLine();

        System.out.print("Digite seu saldo: ");
        double saldo = scan.nextDouble();

        ContaTerminal conta = new ContaTerminal(nome, numero, agencia, saldo);

        System.out.println(conta);

        scan.close();
    }
}
