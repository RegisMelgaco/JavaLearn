public abstract class Conta {
    protected double saldo;

    public double getSaldo() {
        return this.saldo;
    }

    public void saca(double valor) {
        if(getSaldo() >= valor) {
            this.saldo -= valor;
        }
        else {
            System.out.println("Você não tem saldo suficiente para efetuar o saque.");
        }
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public abstract void atualiza(double taxa);
}
