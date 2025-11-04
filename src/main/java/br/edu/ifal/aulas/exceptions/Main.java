package br.edu.ifal.aulas.abstracts;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("João", "123", 100, 10);
        ContaPoupanca contaPoupanca = new ContaPoupanca("Maria", "321", 100, 10);

        transferencia(contaCorrente, contaPoupanca, 100);

        System.out.println("Saldo atual: " + contaCorrente.getSaldo());

        ContaSalario contaSalario = new ContaSalario("José", "456", 100, 10);
        transferencia(contaPoupanca, contaSalario, 100);
    }

    public static void transferencia(Conta conta1, Conta conta2, double valor){
        if(valor <= conta1.getSaldo()){
            conta1.saque(valor);
            conta2.deposito(valor);
        }
    }
}
