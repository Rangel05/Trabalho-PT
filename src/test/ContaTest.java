
package test;

import model.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContaTest {

    @Test
    public void testDepositoContaCorrenteComSaldoNegativo() {
        Cliente c = new Cliente("João", "123", "senha");
        ContaCorrente conta = new ContaCorrente("001", c, 100);
        conta.sacar(250); 
        conta.depositar(300); 

        assertEquals(32.5, conta.getSaldo(), 0.01);
    }

    @Test
    public void testSaqueContaPoupanca() {
        Cliente c = new Cliente("Maria", "456", "senha");
        ContaPoupanca conta = new ContaPoupanca("002", c);
        conta.depositar(200);
        boolean resultado = conta.sacar(150);
        assertTrue(resultado);
        assertEquals(50.0, conta.getSaldo(), 0.01);
    }
}
