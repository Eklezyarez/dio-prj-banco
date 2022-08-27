import org.w3c.dom.ls.LSOutput;

public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente joaquim) {
        super();
    }

    @Override
    public void imprimirExtrato(){
        System.out.println("Extrato da Conta Corrente");
        super.imprimirInfosComuns();
    }



}
