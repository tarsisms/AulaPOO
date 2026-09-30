package oo.abstrata;

abstract public class Seguro {
    private String codigo;
    private String nomeSegurado;
    private double valorSegurado;
    private double valorBase;

    public Seguro(String codigo, String nomeSegurado, double valorSegurado, double valorBase) {
        this.codigo = codigo;
        this.nomeSegurado = nomeSegurado;
        this.valorSegurado = valorSegurado;
        this.valorBase = valorBase;
    }

    abstract public double calcularPremio();

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNomeSegurado() {
        return nomeSegurado;
    }

    public void setNomeSegurado(String nomeSegurado) {
        this.nomeSegurado = nomeSegurado;
    }

    public double getValorSegurado() {
        return valorSegurado;
    }

    public void setValorSegurado(double valorSegurado) {
        this.valorSegurado = valorSegurado;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }
}
