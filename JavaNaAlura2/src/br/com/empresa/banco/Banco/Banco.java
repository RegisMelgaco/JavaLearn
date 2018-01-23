package br.com.empresa.banco.Banco;

import br.com.empresa.banco.Conta.Conta;

import java.util.*;

public class Banco {
    private List<Conta> contas = new ArrayList<>();
    private Map<String, Conta> indexadoPorNome = new HashMap<>();


    public void adiciona(Conta conta) {
        contas.add(conta);
        indexadoPorNome.put(conta.getNome(), conta);
    }

    public Conta pega(int i) {
        return (Conta) contas.get(i);
    }

    public int pegaQuantidadeDeContas () {
        return contas.size();
    }

    public Conta buscaPorNome(String nome) {
        return indexadoPorNome.get(nome);
    }

}
