package br.edu.ifal.interfaces;

public class Circulo implements ObjetoGeometrico {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * (this.raio * this.raio);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * this.raio;
    }
}
