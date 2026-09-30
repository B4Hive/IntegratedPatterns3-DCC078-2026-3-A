package b4hive;

import b4hive.factories.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {

    int valor = 100;

    @Test 
    public void testClientePFDocumento() {
        AbstractFactory factory = SingletonFactoryMethod.getInstance().createFactory("PF");
        Cliente c = new Cliente(factory, "CPF", "ContratoPF");
        assertEquals("CPF", c.getDocumento().getInfo());
    }

    @Test 
    public void testClientePFContrato() {
        AbstractFactory factory = SingletonFactoryMethod.getInstance().createFactory("PF");
        Cliente c = new Cliente(factory, "CPF", "ContratoPF");
        assertEquals("ContratoPF", c.getContrato().getInfo());
    }

    @Test 
    public void testClientePJDocumento() {
        AbstractFactory factory = SingletonFactoryMethod.getInstance().createFactory("PJ");
        Cliente c = new Cliente(factory, "CNPJ", "ContratoPJ");
        assertEquals("CNPJ", c.getDocumento().getInfo());
    }

    @Test 
    public void testClientePJContrato() {
        AbstractFactory factory = SingletonFactoryMethod.getInstance().createFactory("PJ");
        Cliente c = new Cliente(factory, "CNPJ", "ContratoPJ");
        assertEquals("ContratoPJ", c.getContrato().getInfo());
    }

}
