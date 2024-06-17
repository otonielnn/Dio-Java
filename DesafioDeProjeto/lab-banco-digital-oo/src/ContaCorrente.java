public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    protected void exibirExtrato() {
        System.out.println("=== Conta Corrente ====");
        super.exibirExtrato();
    }
}
