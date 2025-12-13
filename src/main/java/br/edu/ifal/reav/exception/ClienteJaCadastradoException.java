package br.edu.ifal.reav.exception;

public class ClienteJaCadastradoException extends Exception {
    public ClienteJaCadastradoException() {
        super("Cliente já cadastrado");
    }
}
