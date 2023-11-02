package src.test;

import org.junit.Test;
import static org.junit.Assert.*;

import src.main.Venta;

public class VentaTest {

    @Test
    public void testGetIdClienteA() {
        Venta venta = new Venta(1, 2, 123, 50.0f, "Premium", "Llamadas Internacionales");
        assertEquals(1, venta.getIdCliente());
    }

    @Test
    public void testGetIdClienteB() {
        Venta venta = new Venta(1, 2, 123, 50.0f, "Premium", "Llamadas Internacionales");
        assertEquals(2, venta.getIdCliente());
    }

    @Test
    public void testGetTipoProductoA() {
        Venta venta = new Venta(1, 2, 123, 50.0f, "Premium", "Llamadas Internacionales");
        assertEquals(2, venta.getTipoProducto());
    }

    @Test
    public void testGetTipoProductoB() {
        Venta venta = new Venta(1, 2, 123, 50.0f, "Premium", "Llamadas Internacionales");
        assertEquals(3, venta.getTipoProducto());
    }

    @Test
    public void testGetIdProductoA() {
        Venta venta = new Venta(1, 2, 123, 50.0f, "Premium", "Llamadas Internacionales");
        assertEquals(123, venta.getIdProducto());
    }

    @Test
    public void testGetIdProductoB() {
        Venta venta = new Venta(1, 2, 123, 50.0f, "Premium", "Llamadas Internacionales");
        assertEquals(321, venta.getIdProducto());
    }

    @Test
    public void testGetMontoVentaA() {
        Venta venta = new Venta(1, 2, 123, 50.0f, "Premium", "Llamadas Internacionales");
        assertEquals(50.0f, venta.getMontoVenta(), 0.01);
    }

    @Test
    public void testGetMontoVentaB() {
        Venta venta = new Venta(1, 2, 123, 50.0f, "Premium", "Llamadas Internacionales");
        assertEquals(51.0f, venta.getMontoVenta(), 0.01);
    }

    @Test
    public void testGetPaqueteA() {
        Venta venta = new Venta(1, 2, 123, 50.0f, "Premium", "Llamadas Internacionales");
        assertEquals("Premium", venta.getPaquete());
    }

    @Test
    public void testGetPaqueteB() {
        Venta venta = new Venta(1, 2, 123, 50.0f, "Premium", "Llamadas Internacionales");
        assertEquals("Estandar", venta.getPaquete());
    }

    @Test
    public void testGetExtraA() {
        Venta venta = new Venta(1, 2, 123, 50.0f, "Premium", "Llamadas Internacionales");
        assertEquals("Llamadas Internacionales", venta.getExtra());
    }

    @Test
    public void testGetExtraB() {
        Venta venta = new Venta(1, 2, 123, 50.0f, "Premium", "Llamadas Internacionales");
        assertEquals("Llamadas", venta.getExtra());
    }
}

