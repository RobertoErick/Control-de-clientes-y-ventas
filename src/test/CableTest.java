package src.test;

import org.junit.Test;
import static org.junit.Assert.*;

import src.main.Cable;

public class CableTest {

    @Test
    public void testGetIdCableA() {
        Cable cable = new Cable(1, 60.0f, "Premium", "Canales Internacionales");
        assertEquals(1, cable.getIdCable());
    }

    @Test
    public void testGetIdCableB() {
        Cable cable = new Cable(1, 60.0f, "Premium", "Canales Internacionales");
        assertEquals(2, cable.getIdCable());
    }

    @Test
    public void testGetSaldoCableA() {
        Cable cable = new Cable(1, 60.0f, "Premium", "Canales Internacionales");
        assertEquals(60.0f, cable.getSaldoCable(), 0.01); // Usamos delta para comparar valores flotantes
    }

    @Test
    public void testGetSaldoCableB() {
        Cable cable = new Cable(1, 60.0f, "Premium", "Canales Internacionales");
        assertEquals(70.0f, cable.getSaldoCable(), 0.01); // Usamos delta para comparar valores flotantes
    }

    @Test
    public void testGetPaqueteA() {
        Cable cable = new Cable(1, 60.0f, "Premium", "Canales Internacionales");
        assertEquals("Premium", cable.getPaquete());
    }

    @Test
    public void testGetPaqueteB() {
        Cable cable = new Cable(1, 60.0f, "Premium", "Canales Internacionales");
        assertEquals("Estándar", cable.getPaquete());
    }

    @Test
    public void testGetExtraA() {
        Cable cable = new Cable(1, 60.0f, "Premium", "Canales Internacionales");
        assertEquals("Canales Internacionales", cable.getExtra());
    }

    @Test
    public void testGetExtraB() {
        Cable cable = new Cable(1, 60.0f, "Premium", "Canales Internacionales");
        assertEquals("Canales normales", cable.getExtra());
    }
}
