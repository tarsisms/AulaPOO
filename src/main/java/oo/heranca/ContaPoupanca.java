package oo.heranca;

public class ContaPoupanca extends Conta {

    private double taxa;
    // 10%

    public ContaPoupanca(String numero, String nomeCliente, double taxa) {
        super(numero, nomeCliente);
        this.taxa = taxa;
    }

    public void atualizar() {
        double valor = super.getSaldo() * (this.taxa / 100);
        super.creditar(valor);
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
}
