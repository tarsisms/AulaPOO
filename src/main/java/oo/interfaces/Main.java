package oo.interfaces;

public class Main {

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(10, 8);
        Circulo circulo = new Circulo(10);

        calcArea(retangulo);
        calcArea(circulo);
    }

    public static void calcArea(ObjGeometrico objeto) {
        System.out.println(objeto.calcArea());
    }
}
