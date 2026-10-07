package oo.interfaces;

public class Retangulo implements ObjGeometrico {

    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcArea() {
        return this.base * this.altura;
    }

    @Override
    public double calcPerimetro() {
        return (2 * this.base) + (2 * this.altura);
    }
}
