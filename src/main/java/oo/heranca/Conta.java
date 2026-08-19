package oo.heranca;

public class Conta {

    private String numero;
    private String nomeCliente;
    private double saldo;


    public Conta(String numero, String nomeCliente) {
        this.numero = numero;
        this.nomeCliente = nomeCliente;
        this.saldo = 0;
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

    public double getSaldo() {
        return saldo;
    }

    public void debitar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
        }
    }

    public void creditar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }


}
