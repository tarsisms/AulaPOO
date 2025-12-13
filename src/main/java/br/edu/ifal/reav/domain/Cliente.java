package br.edu.ifal.reav.domain;

public class Cliente {
    private String cpf;
    private String nome;
    private String email;
    private ContaCorrente contaCorrente;
    private ContaPoupanca contaPoupanca;

    public Cliente(String cpf, String nome, String email, ContaCorrente contaCorrente, ContaPoupanca contaPoupanca) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.contaCorrente = contaCorrente;
        this.contaPoupanca = contaPoupanca;
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ContaCorrente getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(ContaCorrente contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    public ContaPoupanca getPoupanca() {
        return contaPoupanca;
    }

    public void setPoupanca(ContaPoupanca contaPoupanca) {
        this.contaPoupanca = contaPoupanca;
    }
}
