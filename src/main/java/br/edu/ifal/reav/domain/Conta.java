package br.edu.ifal.reav.domain;

import br.edu.ifal.reav.exception.SaldoInsuficienteException;
import br.edu.ifal.reav.exception.ValorInvalidoException;

public abstract class Conta {
    private String numero;
    private double taxa;
    private double saldo;

    public Conta(String numero, double taxa) {
        this.numero = numero;
        this.taxa = taxa;
        this.saldo = 0.0;
    }

    public Conta(String numero, double taxa, double saldo) {
        this.numero = numero;
        this.taxa = taxa;
        this.saldo = saldo;
    }

    public void creditar(double valor) throws ValorInvalidoException {
        if (valor <= 0) {
            throw new ValorInvalidoException();
        }

        saldo += valor;
    }

    public void debitar(double valor) throws ValorInvalidoException, SaldoInsuficienteException {
        if (valor <= 0) {
            throw new ValorInvalidoException();
        }

        if (valor > saldo) {
            throw new SaldoInsuficienteException();
        }

        saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public abstract void atualizar() throws ValorInvalidoException, SaldoInsuficienteException;
}
