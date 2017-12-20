public class ContaPoupanca extends Conta {

    @Override
    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 3;
    }

    @Override
    public void deposita(double valor) {
        super.deposita(valor);
        this.saldo -= 0.1;
    }
}
