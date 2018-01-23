package br.com.empresa.banco.NadaHaver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestePerfomance {

    public static void main(String[] args) {
        System.out.println("Iniciando...");
        Collection<Integer> teste = new ArrayList<Integer>();
        long inicio = System.currentTimeMillis();

        int total = 100000;

        for (int i = 0; i < total; i++) {
            teste.add(i);
        }

        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        System.out.println("Tempo gasto: " + tempo);

        for (int i = 0; i < total; i++) {
            teste.contains(i);
        }

        fim = System.currentTimeMillis();
        tempo = fim - inicio;
        System.out.println("Tempo gasto: " + tempo);
    }
}