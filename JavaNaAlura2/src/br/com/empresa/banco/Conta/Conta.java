package br.com.empresa.banco.Conta;

import br.com.empresa.banco.Erros.ValorInvalidoException;

public abstract class Conta {

	protected double saldo;
	protected String nome;

	public Conta (double saldo, String nome) {
	    this.saldo = saldo;
	    this.nome = nome;
    }
	
	public double getSaldo() {
		return saldo;
	}

    public String getNome() { return nome; }

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
}
