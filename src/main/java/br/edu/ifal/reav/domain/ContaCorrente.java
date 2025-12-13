package br.edu.ifal.reav.domain;

import br.edu.ifal.reav.exception.SaldoInsuficienteException;
import br.edu.ifal.reav.exception.ValorInvalidoException;

public class ContaCorrente extends Conta {
    public ContaCorrente(String numero, double taxa) {
        super(numero, taxa);
    }

    public ContaCorrente(String numero, double taxa, double saldo) {
        super(numero, taxa, saldo);
    }

    @Override
    public void atualizar() throws SaldoInsuficienteException, ValorInvalidoException {
        double valor = super.getSaldo() * super.getTaxa();
        super.debitar(valor);
    }
}
