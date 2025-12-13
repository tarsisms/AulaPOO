package br.edu.ifal.reav;

import br.edu.ifal.reav.domain.Cliente;
import br.edu.ifal.reav.domain.ContaPoupanca;
import br.edu.ifal.reav.domain.ContaCorrente;
import br.edu.ifal.reav.exception.ClienteJaCadastradoException;
import br.edu.ifal.reav.exception.SaldoInsuficienteException;
import br.edu.ifal.reav.exception.ValorInvalidoException;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();

        int opcao;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Cadastrar br.edu.ifal.reav.domain.Cliente");
            System.out.println("2 - Realizar Saque");
            System.out.println("3 - Verificar Saldos");
            System.out.println("4 - Transferir Valores");
            System.out.println("5 - Atualizar Contas");
            System.out.println("0 - Sair");
            System.out.print("opc: ");
            opcao = sc.nextInt();

            try {
                if (opcao == 1) {
                    System.out.print("CPF: ");
                    String cpf = sc.next();

                    for (Cliente c : clientes) {
                        if (c.getCpf().equals(cpf)) {
                            throw new ClienteJaCadastradoException();
                        }
                    }

                    System.out.print("Nome: ");
                    String nome = sc.next();
                    System.out.print("Email: ");
                    String email = sc.next();

                    System.out.print("Numero da conta: ");
                    String numConta = sc.next();
                    System.out.print("Taxa: ");
                    double taxa = sc.nextDouble();
                    System.out.print("Taxa: ");
                    double saldo = sc.nextDouble();

                    ContaCorrente contaCorrente = new ContaCorrente(numConta, taxa, saldo);
                    ContaPoupanca contaPoupanca = new ContaPoupanca(numConta, taxa, saldo);
                    Cliente cliente = new Cliente(cpf, nome, email, contaCorrente, contaPoupanca);

                    clientes.add(cliente);
                    System.out.println("Cliente cadastrado com sucesso.");
                }

                if (opcao == 2) {
                    System.out.print("CPF do cliente: ");
                    String cpf = sc.next();

                    for (Cliente c : clientes) {
                        if (c.getCpf().equals(cpf)) {
                            System.out.print("Selecione a conta: 1-Corrente | 2-Poupança: ");
                            int tipo = sc.nextInt();

                            System.out.print("Valor do saque: ");
                            double valor = sc.nextDouble();

                            if (tipo == 1) {
                                c.getContaCorrente().debitar(valor);
                            } else if (tipo == 2) {
                                c.getPoupanca().debitar(valor);
                            }
                            System.out.println("Saque realizado com sucesso.");
                        }
                    }
                }

                if (opcao == 3) {
                    System.out.print("CPF do cliente: ");
                    String cpf = sc.next();

                    for (Cliente c : clientes) {
                        if (c.getCpf().equals(cpf)) {
                            System.out.println("Cliente: " + c.getNome());
                            System.out.println("Saldo Conta Corrente: " + c.getContaCorrente().getSaldo());
                            System.out.println("Saldo Poupança: " + c.getPoupanca().getSaldo());
                        }
                    }
                }

                if (opcao == 4) {
                    System.out.print("CPF do cliente de origem: ");
                    String cpfOrigem = sc.next();

                    System.out.print("CPF do cliente de destino: ");
                    String cpfDestino = sc.next();

                    // Buscar cliente Origem
                    for (Cliente clienteOrigem : clientes) {
                        if (cpfOrigem.equals(clienteOrigem.getCpf())) {
                            // Buscar Cliente Destino
                            for (Cliente clienteDestino : clientes) {
                                if (cpfDestino.equals(clienteDestino.getCpf())) {

                                    // Obtendo o valor para transferencia
                                    System.out.print("Valor: ");
                                    double valor = sc.nextDouble();

                                    // Realizando a Transferencia
                                    clienteOrigem.getContaCorrente().debitar(valor);
                                    clienteDestino.getContaCorrente().creditar(valor);
                                }
                            }
                        }

                    }
                }

                if (opcao == 5) {
                    for (Cliente c : clientes) {
                        c.getContaCorrente().atualizar();
                        c.getPoupanca().atualizar();
                    }
                    System.out.println("Contas atualizadas");
                }

            } catch (ValorInvalidoException e) {
                System.out.println("ValorInvalidoException: " + e.getMessage());
            } catch (SaldoInsuficienteException e) {
                System.out.println("SaldoInsuficienteException: " + e.getMessage());
            } catch (ClienteJaCadastradoException e) {
                System.out.println("ClienteJaCadastradoException: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }

        } while (opcao != 0);

    }
}