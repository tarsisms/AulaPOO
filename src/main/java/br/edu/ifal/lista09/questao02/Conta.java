package br.edu.ifal.lista09.questao02;

public class Conta {

    private String numConta;
    private String cpfCliente;
    private String banco;
    private double taxa;
    private double saldo;

    public Conta() {
        this.numConta = "";
        this.cpfCliente = "";
        this.banco = "";
        this.taxa = 10;
        this.saldo = 0;
    }

    public Conta(String numConta, String cpfCliente, String banco) {
        this.numConta = numConta;
        this.cpfCliente = cpfCliente;
        this.banco = banco;
        this.taxa = 10;
        this.saldo = 0;
    }

    public Conta(String numConta, String cpfCliente, String banco, double taxa, double saldo) {
        this.numConta = numConta;
        this.cpfCliente = cpfCliente;
        this.banco = banco;
        this.taxa = taxa;
        this.saldo = saldo;
    }


    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public double getSaldo() {
        return saldo;
    }

    public void atualizar() {
        this.saque(this.taxa);
    }

    public void deposito(double valor) {
        if (valor > 0) {
            this.saldo = this.saldo + valor;
        }
    }

    public void saque(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo = this.saldo - valor;
        }
    }

}
