public class AtualizadorDeContas {
    private double saldoTotal = 0;
    private double selic;

    public AtualizadorDeContas(double selic) {
        this.selic = selic;
    }

    public void  roda(Conta c) {
        System.out.println("O saldo antigo é: " + c.getSaldo());

        c.atualiza(this.selic);

        System.out.println("O novo saldo é: " + c.getSaldo());
        this.saldoTotal += c.getSaldo();
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }

    public double getSelic() {
        return selic;
    }
}
