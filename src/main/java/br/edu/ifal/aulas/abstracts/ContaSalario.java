package br.edu.ifal.aulas.abstracts;

public class ContaSalario extends Conta {
    public ContaSalario(String nomeCliente, String numero, double saldo, double taxa) {
        super(nomeCliente, numero, saldo, taxa);
    }

    @Override
    public void atualizar() {
        super.deposito(super.getTaxa() + 10);
    }
}
