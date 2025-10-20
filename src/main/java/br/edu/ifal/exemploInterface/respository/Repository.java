package br.edu.ifal.exemploInterface.respository;

import br.edu.ifal.exemploInterface.models.Conta;

import java.util.List;

public interface Repository {

    void save(Conta conta);

    Conta findByNumero(String numero);

    List<Conta> findAll();

}
