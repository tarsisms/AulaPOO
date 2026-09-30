package oo.abstrata;

public class SeguroProprioIfal extends Seguro{

    public SeguroProprioIfal(String codigo, String nomeSegurado, double valorSegurado, double valorBase) {
        super(codigo, nomeSegurado, valorSegurado, valorBase);
    }

    @Override
    public double calcularPremio() {
        return super.getValorBase() + (super.getValorSegurado() * 0.1725);
    }
}
