package br.edu.ifal.exemploInterface.respository;

import br.edu.ifal.exemploInterface.models.Conta;
import br.edu.ifal.exemploInterface.models.ContaCorrente;

import java.util.ArrayList;
import java.util.List;

public class DatabasePostgres implements Repository {

    public void save(Conta conta) {

    }

    public List<Conta> findAll() {
        return new ArrayList();
    }

    public Conta findByNumero(String numero) {
        return new ContaCorrente("", 0, "");
    }

}
