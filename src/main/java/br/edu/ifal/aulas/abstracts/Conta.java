package br.edu.ifal.aulas.abstracts;

public class Conta {
    private String nomeCliente;
    private String numero;
    private double saldo;
    private double taxa;

    public Conta(String nomeCliente, String numero, double saldo, double taxa) {
        this.nomeCliente = nomeCliente;
        this.numero = numero;
        this.saldo = saldo;
        this.taxa = taxa;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public void saque(double valor) {
        if (valor <= saldo && valor > 0) {
            this.saldo = this.saldo - valor;
        }
    }

    public void deposito(double valor) {
        if (valor > 0) {
            this.saldo = this.saldo + valor;
        }
    }

    public abstract void atualizar();
}
