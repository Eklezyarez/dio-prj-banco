public class ContaPoupanca extends Conta {

    public ContaCorrente(Cliente cliente){
        super(cliente);
    }

    public ContaPoupanca(Cliente joaquim) {
        super();
    }

    public void imprimirExtrato() {
        System.out.println("Extrato Conta Poupanca");
        imprimirInfosComuns();
    }


}


