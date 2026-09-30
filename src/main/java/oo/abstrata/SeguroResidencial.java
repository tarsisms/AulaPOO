package oo.abstrata;

public class SeguroResidencial extends Seguro{
    public SeguroResidencial(String codigo, String nomeSegurado, double valorSegurado, double valorBase) {
        super(codigo, nomeSegurado, valorSegurado, valorBase);
    }

    public double calcularPremio() {
        return super.getValorBase() + (super.getValorSegurado() * 0.01);
    }
}
