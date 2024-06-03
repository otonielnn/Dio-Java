import java.util.Scanner;

public class ContaTerminal {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;
    
    public ContaTerminal(String nomeCliente ,int numero, String agencia, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Olá " + this.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " + this.getAgencia() + ", conta " + this.getNumero() + " e seu saldo " + this.getSaldo() + " já está disponível para saque.";
    }
    
    public static void main(String[] args) {
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
