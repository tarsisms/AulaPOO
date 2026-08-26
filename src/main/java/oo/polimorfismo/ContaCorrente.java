package oo.polimorfismo;

public class ContaCorrente extends Conta {

    public ContaCorrente(String numero, String nomeCliente) {
        super(numero, nomeCliente);
    }

    public ContaCorrente(String numero, String nomeCliente, double saldo) {
        super(numero, nomeCliente, saldo);
    }


    public void debitar(double valor) {
        double novoValor = valor + 10;
        super.debitar(novoValor);
    }

}
