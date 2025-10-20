package br.edu.ifal.exemploInterface.respository;

import br.edu.ifal.exemploInterface.models.Conta;

import java.util.ArrayList;
import java.util.List;

public class DatabaseList implements Repository {
    private static List<Conta> contas;

    public DatabaseList() {
        contas = new ArrayList<>();
    }

    @Override
    public void save(Conta conta) {
        contas.add(conta);
    }

    @Override
    public Conta findByNumero(String numero) {
        for (Conta c : contas) {
            if (c.getNumero().equals(numero)) {
                return c;
            }
        }

        return null;
    }

    @Override
    public List<Conta> findAll() {
        return contas;
    }

    // Conexao c/ Banco de Dados
}
