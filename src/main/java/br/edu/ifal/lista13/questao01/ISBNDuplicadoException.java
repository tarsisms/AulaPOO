package br.edu.ifal.lista13.questao01;

public class ISBNDuplicadoException extends IllegalArgumentException {

    public ISBNDuplicadoException(){
        super();
    }

    public ISBNDuplicadoException(String mensage){
       super(mensage);
    }
}
