package src.test;

import org.junit.Test;
import static org.junit.Assert.*;

import src.main.Internet;

public class InternetTest {

    @Test
    public void testGetIdInternetA() {
        Internet internet = new Internet(1, 50.0f, "Premium", "Extra");
        assertEquals(1, internet.getIdInternet());
    }

    @Test
    public void testGetIdInternetB() {
        Internet internet = new Internet(1, 50.0f, "Premium", "Extra");
        assertEquals(2, internet.getIdInternet());
    }

    @Test
    public void testGetSaldoInternetA() {
        Internet internet = new Internet(1, 50.0f, "Premium", "Extra");
        assertEquals(50.0f, internet.getSaldoInternet(), 0.01); // Usamos delta para comparar valores flotantes
    }

    @Test
    public void testGetSaldoInternetB() {
        Internet internet = new Internet(1, 50.0f, "Premium", "Extra");
        assertEquals(60.0f, internet.getSaldoInternet(), 0.01); // Usamos delta para comparar valores flotantes
    }

    @Test
    public void testGetPaqueteA() {
        Internet internet = new Internet(1, 50.0f, "Premium", "Extra");
        assertEquals("Premium", internet.getPaquete());
    }

    @Test
    public void testGetPaqueteB() {
        Internet internet = new Internet(1, 50.0f, "Premium", "Extra");
        assertEquals("Estándar", internet.getPaquete());
    }

    @Test
    public void testGetExtraA() {
        Internet internet = new Internet(1, 50.0f, "Premium", "Extra");
        assertEquals("Extra", internet.getExtra());
    }

    @Test
    public void testGetExtraB() {
        Internet internet = new Internet(1, 50.0f, "Premium", "Extra");
        assertEquals("no Extra", internet.getExtra());
    }
}
