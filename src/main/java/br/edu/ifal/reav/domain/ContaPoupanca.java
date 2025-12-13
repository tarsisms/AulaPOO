package br.edu.ifal.reav.domain;

import br.edu.ifal.reav.exception.ValorInvalidoException;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(String numero, double taxa) {
        super(numero, taxa);
    }

    public ContaPoupanca(String numero, double taxa, double saldo) {
        super(numero, taxa, saldo);
    }

    @Override
    public void atualizar() throws ValorInvalidoException {
        double valor = super.getSaldo() * super.getTaxa();
        super.creditar(valor);
    }
}
