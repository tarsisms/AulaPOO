package oo.polimorfismo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Numero da Conta: ");
        String numero = scanner.next();
        System.out.print("Nome do Cliente: ");
        String nomeCliente = scanner.next();

        System.out.print("Numero da Conta 2: ");
        String numero2 = scanner.next();
        System.out.print("Nome do Cliente 2: ");
        String nomeCliente2 = scanner.next();

        /// Conta
        // Conta conta1 = new Conta(numero, nomeCliente, 100);
        // Conta conta2 = new Conta(numero2, nomeCliente2, 100);
        // transferenciaContas(conta1, conta2, 10);


        /// Conta Poupanca
         // ContaPoupanca cp1 = new ContaPoupanca(numero, nomeCliente, 100, 10);
        // ContaPoupanca cp2 = new ContaPoupanca(numero2, nomeCliente2, 100, 10);
        // transferenciaContas(cp1, cp2, 10);

        /// Conta Corrente
         ContaCorrente cc1 = new ContaCorrente(numero, nomeCliente, 100);
         ContaCorrente cc2 = new ContaCorrente(numero2, nomeCliente2, 100);
         transferenciaConta(cc1, cc2, 10);


    }

//    public static void transferenciaContaCorrente(ContaCorrente cc1, ContaCorrente cc2, double valor) {
//        System.out.println("Saldo conta 1: " + cc1.getSaldo());
//        System.out.println("Saldo conta 2: " + cc2.getSaldo());
//        cc1.debitarContaCorrente(valor);
//        cc2.creditar(valor);
//        System.out.println("Saldo conta 1: " + cc1.getSaldo());
//        System.out.println("Saldo conta 2: " + cc2.getSaldo());
//    }

    public static void transferenciaConta(Conta conta1, Conta conta2, double valor) {
        System.out.println("Saldo conta 1: " + conta1.getSaldo());
        System.out.println("Saldo conta 2: " + conta2.getSaldo());

        conta1.debitar(valor);
        conta2.creditar(valor);

        System.out.println("Saldo conta 1: " + conta1.getSaldo());
        System.out.println("Saldo conta 2: " + conta2.getSaldo());
    }


}
