package oo.abstrata;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Seguro> seguros = new ArrayList<>();

        Seguro seguro = new SeguroResidencial("123", "Nome", 1000, 1000);
        gerarRelatoriosSeguros(seguro);
    }


    public static void gerarRelatoriosSeguros(Seguro seguro) {
        double valorFinal = seguro.calcularPremio() * 100;
        System.out.println("O valor final é: " + valorFinal);
    }

}
