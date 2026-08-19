package oo.heranca;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Numero da oo.heranca.Conta: ");
        String numero = scanner.next();
        System.out.print("Nome do Cliente: ");
        String nomeCliente = scanner.next();

        // oo.heranca.Conta conta = new oo.heranca.Conta(numero, nomeCliente);
        // oo.heranca.ContaCorrente contaCorrente = new oo.heranca.ContaCorrente(numero, nomeCliente);
        ContaPoupanca contaPoupanca = new ContaPoupanca(numero, nomeCliente, 10);

        contaPoupanca.creditar(100);
        System.out.println("saldo: " + contaPoupanca.getSaldo());
        System.out.println("----------");


        contaPoupanca.atualizar();
        System.out.println("saldo: " + contaPoupanca.getSaldo());

        // System.out.println("Num oo.heranca.Conta: " + contaPoupanca.getNumero());
        // System.out.println("Nome: " + contaPoupanca.getNomeCliente());

    }

}
