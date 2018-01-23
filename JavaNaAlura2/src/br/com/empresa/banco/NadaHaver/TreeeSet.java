package br.com.empresa.banco.NadaHaver;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class TreeeSet {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<Integer>();

        for (int i = 1; i <= 10; i++) {
            lista.add(i);
        }

        lista.listIterator();

        for (int i = 1; i <= 10; i++) {
            System.out.println(lista.get( i ));
        }


    }

    public static int organizer(int i, int) {

    }
}
