package br.edu.ifal.aulas.abstracts;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(String nomeCliente, String numero, double saldo, double taxa) {
        super(nomeCliente, numero, saldo, taxa);
    }

    @Override
    public void atualizar() {
        super.deposito(super.getTaxa());
    }
}
