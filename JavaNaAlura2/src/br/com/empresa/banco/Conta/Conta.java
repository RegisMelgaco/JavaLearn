package br.com.empresa.banco.Conta;

import br.com.empresa.banco.Erros.ValorInvalidoException;

public abstract class Conta implements Comparable<Conta> {

	protected double saldo;
	protected String nome;
	protected int numero;

	public Conta (double saldo, String nome, int numero) {
	    this.saldo = saldo;
	    this.nome = nome;
	    this.numero = numero;
    }

	public double getSaldo() {
		return saldo;
	}

    public String getNome() { return nome; }

    public int getNumero() { return numero; }

    public void deposita(double valor) {
		if(valor <= 0) {
			throw new ValorInvalidoException(valor);
		}
		this.saldo += valor;
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}

	public abstract void atualiza(double taxa);

	@Override
	public String toString() {
	    return "o saldo é " + this.saldo;
    }

    @Override
    public boolean equals(Object obj) {
	    Conta outraConta = (Conta)obj;

        return this.getSaldo() == outraConta.getSaldo() && this.getNome() == outraConta.getNome();
    }

    @Override
    public int compareTo(Conta o) {
        return this.numero - o.numero;
    }
}
