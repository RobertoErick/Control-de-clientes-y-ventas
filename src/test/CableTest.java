package src.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import src.main.Cable;

public class CableTest {

    @Test
    public void testGetIdCable() {
        Cable cable = new Cable(101, 30.0f);
        int idCable = cable.getIdCable();
        assertEquals(101, idCable);
    }

    @Test
    public void testGetSaldoCable() {
        Cable cable = new Cable(101, 30.0f);
        float saldoCable = cable.getSaldoCable();
        assertEquals(30.0f, saldoCable, 0.01); // Ajusta la tolerancia según tu caso
    }
}
