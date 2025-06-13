
package model;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(String numero, Cliente cliente) {
        super(numero, cliente);
    }

    public void aplicarRendimento() {
        this.saldo *= 1.05;
    }
}
