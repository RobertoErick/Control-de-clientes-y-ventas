package src.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import src.main.Telefono;

public class TelefonoTest {

    @Test
    public void testGetNumTelefono() {
        Telefono telefono = new Telefono(12345, 50.0f);
        assertEquals(12345, telefono.getNumTelefono());
    }

    @Test
    public void testGetSaldoTelefono() {
        Telefono telefono = new Telefono(12345, 50.0f);
        assertEquals(50.0f, telefono.getSaldoTelefono(), 0.01); // Use 0.01 tolerance for floating-point comparisons
    }

    @Test
    public void testGetSaldoTelefonoWithNegativeValue() {
        Telefono telefono = new Telefono(67890, -10.0f);
        assertEquals(-10.0f, telefono.getSaldoTelefono(), 0.01);
    }
}

