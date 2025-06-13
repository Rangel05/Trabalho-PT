
package model;

public class ContaCorrente extends Conta {
    private double limiteCredito;

    public ContaCorrente(String numero, Cliente cliente, double limiteCredito) {
        super(numero, cliente);
        this.limiteCredito = limiteCredito;
    }

    @Override
    public void depositar(double valor) {
        if (saldo < 0) {
            double taxa = Math.abs(saldo) * 0.03;
            super.depositar(valor - taxa);
        } else {
            super.depositar(valor);
        }
    }

    @Override
    public boolean sacar(double valor) {
        if (saldo + limiteCredito >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }
}
