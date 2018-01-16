package br.com.empresa.banco.Main;

import br.com.empresa.banco.Conta.Conta;
import br.com.empresa.banco.Conta.ContaCorrente;

public class Main {
    public static void main(String[] args) {
        Conta cp = new ContaCorrente();
        try {
            cp.deposita(-100);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}