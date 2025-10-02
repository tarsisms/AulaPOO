package br.edu.ifal.lista09.questao02;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(String numConta, String cpfCliente, String banco, double taxa, double saldo) {
        super(numConta, cpfCliente, banco, taxa, saldo);
    }

    public ContaPoupanca(String numConta, String cpfCliente, String banco) {
        super(numConta, cpfCliente, banco);
    }

    public void atualizar() {
        super.deposito(super.getTaxa());
    }

}
