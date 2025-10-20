package br.edu.ifal.exemploInterface.models;

public abstract class Conta {

    private String numero;
    private double saldo;
    private String nomeCliente;

    public Conta(String numero, double saldo, String nomeCliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.nomeCliente = nomeCliente;
    }

    public void debitar(double valor){
        this.saldo = this.saldo - valor;
    }

    public void creditar(double valor){
        this.saldo = this.saldo + valor;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
}
