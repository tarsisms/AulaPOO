package br.edu.ifal.exemploInterface;

import br.edu.ifal.exemploInterface.models.Conta;
import br.edu.ifal.exemploInterface.models.ContaCorrente;
import br.edu.ifal.exemploInterface.models.ContaPoupanca;
import br.edu.ifal.exemploInterface.respository.DatabaseList;
import br.edu.ifal.exemploInterface.respository.DatabasePostgres;
import br.edu.ifal.exemploInterface.respository.Repository;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opc = 0;
        Scanner sc = new Scanner(System.in);

        Repository repository = new DatabaseList();

        do {
            opc = sc.nextInt();
            if (opc == 1 || opc == 2) {
                String numero = sc.nextLine();
                String nomeCliente = sc.nextLine();
                double saldo = sc.nextDouble();

                if (opc == 1) {
                    Conta cc = new ContaCorrente(nomeCliente, saldo, numero);
                    // Database.contas.add(cc);
                    // new DatabasePostgres().save(cc);
                    repository.save(cc);

                } else {
                    Conta cp = new ContaPoupanca(nomeCliente, saldo, numero);
                    // Database.contas.add(cp);
                    repository.save(cp);
                }
            }

            if (opc == 3) {
                String numero = sc.nextLine();
                Conta conta = repository.findByNumero(numero);
                System.out.println("O saldo é: " + conta.getSaldo());

                // new DatabasePostgres().findByNumero(numero);

                // for (Conta c : Database.contas) {
                //     if(numero.equals(c.getNumero())){
                //         System.out.println("O saldo é: " + c.getSaldo());
                //     }
                // }
            }

        } while (opc != 0);


    }
}
