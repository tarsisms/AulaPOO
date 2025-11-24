package br.edu.ifal.lista13.questao01;

public class Livro {

    private String isbn;
    private String titulo;
    private int anoEdicao;
    private Autor autor;
    private Editora editora;

    public Livro(String isbn, String titulo, int anoEdicao, Autor autor, Editora editora) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anoEdicao = anoEdicao;
        this.autor = autor;
        this.editora = editora;
    }

    public Autor getAutor() {
        return this.autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoEdicao() {
        return anoEdicao;
    }

    public void setAnoEdicao(int anoEdicao) {
        this.anoEdicao = anoEdicao;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "isbn='" + isbn + '\'' +
                ", titulo='" + titulo + '\'' +
                ", anoEdicao=" + anoEdicao +
                ", autor=" + autor +
                ", editora=" + editora +
                '}';
    }
}
