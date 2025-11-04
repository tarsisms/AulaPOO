package br.edu.ifal.aulas.abstracts;

public class ContaCorrente extends Conta {

    public ContaCorrente(String nomeCliente, String numero, double saldo, double taxa) {
        super(nomeCliente, numero, saldo, taxa);
    }

    public void atualizar(){
        super.saque(super.getTaxa());
    }
}
