package br.com.empresa.banco.Conta;

public class ContaPoupanca extends Conta {

    public ContaPoupanca (double saldo, String nome) {
        super(saldo, nome);
    }

	public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 3;
    }

    public void deposita(double valor) {
        this.saldo += valor - 0.10;
    }
}
