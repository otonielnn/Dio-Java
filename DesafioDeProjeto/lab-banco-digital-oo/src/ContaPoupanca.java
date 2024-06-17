public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    protected void exibirExtrato() {
        System.out.println("=== Conta Poupança ====");
        super.exibirExtrato();
    }
    
}
