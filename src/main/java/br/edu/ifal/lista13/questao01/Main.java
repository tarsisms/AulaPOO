package br.edu.ifal.lista13.questao01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opc = 0;
        List<Livro> listaLivros = new ArrayList<>();


        do {
            try {
                System.out.print("Digite a opc desejada:");
                opc = sc.nextInt();

                if (opc == 1) {
                    String isbn = sc.next();

                    for (Livro livro : listaLivros) {
                        // if(livro.getIsbn().equals(isbn)){
                        if (isbn.equals(livro.getIsbn())) {
                            throw new ISBNDuplicadoException();
                        }
                    }

                    String titulo = sc.next();
                    int anoEdicao = sc.nextInt();

                    String nomeAutor = sc.next();
                    String nacionalidadeAutor = sc.next();
                    String dataNascimentoAutor = sc.next();
                    Autor autor = new Autor(nomeAutor, nacionalidadeAutor, dataNascimentoAutor);

                    String codigoEditora = sc.next();
                    String nomeEditora = sc.next();
                    String paisOrigemEditora = sc.next();
                    String anoEditora = sc.next();
                    Editora editora = new Editora(codigoEditora, nomeEditora, paisOrigemEditora, anoEditora);

                    Livro livro = new Livro(isbn, titulo, anoEdicao, autor, editora);
                    listaLivros.add(livro);
                }

                if (opc == 2) {
                    String nomeEditora = sc.next();

                    for (Livro livro : listaLivros) {
                        if (nomeEditora.equals(livro.getEditora().getNome())) {
                            // System.out.println(livro);

                            System.out.println("Nome do Livro: " + livro.getTitulo());
                            System.out.println("Editora do Livro: " + livro.getEditora().getNome());
                        }

                    }


                }

            } catch (ISBNDuplicadoException e) {
                System.out.println("ISBN Duplicado!");
            } catch (Exception e) {
                System.out.println("Aconteceu um erro inesperado!");
            }

        } while (opc != 0);


    }
}
