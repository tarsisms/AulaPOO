package br.edu.ifal.lista13.questao01;

public class Editora {

    private String codigo;
    private String nome;
    private String paisOrigem;
    private String anoFundacao;

    public Editora(String codigo, String nome, String paisOrigem, String anoFundacao) {
        this.codigo = codigo;
        this.nome = nome;
        this.paisOrigem = paisOrigem;
        this.anoFundacao = anoFundacao;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public String getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(String anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    @Override
    public String toString() {
        return "Editora{" +
                "codigo='" + codigo + '\'' +
                ", nome='" + nome + '\'' +
                ", paisOrigem='" + paisOrigem + '\'' +
                ", anoFundacao='" + anoFundacao + '\'' +
                '}';
    }
}
