package br.edu.ifal.lista09.questao02;

/*

Questão 02: Crie a superclasse Conta. Faça duas subclasses, Conta corrente e Poupança,
que herdem de Conta. A classe Conta possui número da conta, CPF do cliente, taxa, saldo
e banco e um método atualizar, o qual subtrai a taxa definida do saldo.

     Além disso, a
classe Conta deve possuir os métodos saque e depósito. Na classe Conta Corrente, o
método saque deve cobrar uma taxa adicional de R$ 0,30 para todos os saques
realizados. Na classe poupança, o método atualizar adiciona a taxa definida ao saldo. Ou
seja, você deve sobrescrever o método saque em Conta corrente e o método atualizar em
Poupança. Crie uma classe Teste que forneça as seguintes opções:

1. Cadastrar Conta corrente
2. Cadastrar Poupança
3. Verificar saldo de uma Conta
4. Efetuar saque em uma Conta
5. Executar a rotina de atualização em todas as contas
0. Sair

*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int opc = 0;
        List<Conta> listaContas = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        do {
            opc = scanner.nextInt();

            if (opc == 1 || opc == 2) {
                String numConta = scanner.next();
                String cpfCliente = scanner.next();
                String banco = scanner.next();
                double taxa = scanner.nextDouble();
                double saldo = scanner.nextDouble();

                if (opc == 1) {
                    ContaCorrente contaCorrente = new ContaCorrente(numConta, cpfCliente, banco, taxa, saldo);
                    listaContas.add(contaCorrente);
                } else {
                    ContaPoupanca contaPoupanca = new ContaPoupanca(numConta, cpfCliente, banco, taxa, saldo);
                    listaContas.add(contaPoupanca);
                }
            }

            if (opc == 3) {
                String numConta = scanner.next();
                for (Conta c : listaContas) {
                    if (c.getNumConta().equals(numConta)) {
                        System.out.println("O saldo é: " + c.getSaldo());
                        break;
                    }
                }
            }

            if (opc == 4) {
                String numConta = scanner.next();
                double valor = scanner.nextDouble();
                for (Conta c : listaContas) {
                    if (c.getNumConta().equals(numConta)) {
                        c.saque(valor);
                        System.out.println("Saque realizado com sucesso!");
                        break;
                    }
                }
            }

            if (opc == 5) {
                for (Conta c : listaContas) {
                    c.atualizar();
                }

                System.out.println("Todas as contas foram atualizadas com sucesso!");
            }

        } while (opc != 0);
    }
}
