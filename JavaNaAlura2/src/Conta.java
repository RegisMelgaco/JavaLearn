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

    public void deposita(double valor) throws IllegalArgumentException {
        if(valor > 0) {
            this.saldo += valor;
        } else {
            throw new ValorInvalidoException(valor);
        }
    }

    public abstract void atualiza(double taxa);
}
