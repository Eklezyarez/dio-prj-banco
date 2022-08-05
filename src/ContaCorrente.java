import org.w3c.dom.ls.LSOutput;

public class ContaCorrente extends Conta{

    @Override
    public void imprimirExtrato(){
        System.out.println("Extrato Conta Corrente");
        super.imprimirInfosComuns();
    }



}
