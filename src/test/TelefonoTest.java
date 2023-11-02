package src.test;

import org.junit.Test;
import static org.junit.Assert.*;

import src.main.Telefono;

public class TelefonoTest {

    @Test
    public void testGetNumTelefonoA() {
        Telefono telefono = new Telefono(12345, 50.0f, "Premium", "Llamadas Internacionales");
        assertEquals(12345, telefono.getNumTelefono());
    }

    @Test
    public void testGetNumTelefonoB() {
        Telefono telefono = new Telefono(12345, 50.0f, "Premium", "Llamadas Internacionales");
        assertEquals(54321, telefono.getNumTelefono());
    }

    @Test
    public void testGetSaldoTelefonoA() {
        Telefono telefono = new Telefono(12345, 50.0f, "Premium", "Llamadas Internacionales");
        assertEquals(50.0f, telefono.getSaldoTelefono(), 0.01); // Usamos delta para comparar valores flotantes
    }

    @Test
    public void testGetSaldoTelefonoB() {
        Telefono telefono = new Telefono(12345, 50.0f, "Premium", "Llamadas Internacionales");
        assertEquals(60.0f, telefono.getSaldoTelefono(), 0.01); // Usamos delta para comparar valores flotantes
    }

    @Test
    public void testGetPaqueteA() {
        Telefono telefono = new Telefono(12345, 50.0f, "Premium", "Llamadas Internacionales");
        assertEquals("Premium", telefono.getPaquete());
    }

    @Test
    public void testGetPaqueteB() {
        Telefono telefono = new Telefono(12345, 50.0f, "Premium", "Llamadas Internacionales");
        assertEquals("Estandar", telefono.getPaquete());
    }

    @Test
    public void testGetExtraA() {
        Telefono telefono = new Telefono(12345, 50.0f, "Premium", "Llamadas Internacionales");
        assertEquals("Llamadas Internacionales", telefono.getExtra());
    }

    @Test
    public void testGetExtraB() {
        Telefono telefono = new Telefono(12345, 50.0f, "Premium", "Llamadas Internacionales");
        assertEquals("Llamadas nomrales", telefono.getExtra());
    }
}

