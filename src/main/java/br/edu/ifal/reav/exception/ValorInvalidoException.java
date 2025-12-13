package br.edu.ifal.reav.exception;

public class ValorInvalidoException extends Exception {
    public ValorInvalidoException() {
        super("Valor inválido. O valor deve ser maior que zero.");
    }
}
