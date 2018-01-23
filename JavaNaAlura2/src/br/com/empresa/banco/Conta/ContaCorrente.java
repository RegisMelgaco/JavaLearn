package br.com.empresa.banco.Conta;

import br.com.empresa.banco.Tributos.Tributavel;

public class ContaCorrente extends Conta implements Tributavel, Comparable<Conta> {

    public ContaCorrente (double saldo, String nome, int numero) {
        super(saldo, nome, numero);
    }

	public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 2;
    }

	@Override
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}

    @Override
    public int compareTo(Conta o) {
        return this.nome.compareTo(o.nome);
    }
}
