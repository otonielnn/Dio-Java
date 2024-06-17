public class Main {
    public static void main(String[] args) {
        Cliente otoniel = new Cliente();
        otoniel.setNome("otoniel");

        Conta cc = new ContaCorrente(otoniel);

        cc.depositar(100);

        Conta poupanca = new ContaPoupanca(otoniel);

        cc.transferir(100, poupanca);

        cc.exibirExtrato();
        poupanca.exibirExtrato();
    }
}
