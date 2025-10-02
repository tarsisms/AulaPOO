package br.edu.ifal.lista09.questao02;

public class ContaCorrente extends Conta {

    public ContaCorrente(String numConta, String cpfCliente, String banco, double taxa, double saldo) {
        super(numConta, cpfCliente, banco, taxa, saldo);
    }

    public ContaCorrente(String numConta, String cpfCliente, String banco) {
        super(numConta, cpfCliente, banco);
    }

    public void saque(double valor) {
        super.saque(valor + 0.30);
    }

}
