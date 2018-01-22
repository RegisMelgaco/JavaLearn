package br.com.empresa.banco.Conta;

import br.com.empresa.banco.Tributos.Tributavel;

public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente (double saldo, String nome) {
        super(saldo,nome);
    }

	public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 2;
    }

	@Override
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}
}
