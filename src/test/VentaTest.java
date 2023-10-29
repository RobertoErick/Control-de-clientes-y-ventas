package src.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import src.main.Venta;

public class VentaTest {
    // Prueba para verificar si se crea una venta correctamente
    @Test
    public void testCrearVenta() {
        Venta venta = new Venta(1, 1, 123, 50.0f);
        assertEquals(1, venta.getIdCliente());
        assertEquals(1, venta.getTipoProducto());
        assertEquals(123, venta.getIdProducto());
        assertEquals(50.0f, venta.getMontoVenta(), 0.01);
    }

    // Prueba para verificar si se crea una venta a partir de una cadena
    @Test
    public void testFromString() {
        String ventaString = "1,1,123,50.0";
        Venta venta = Venta.fromString(ventaString);
        assertEquals(1, venta.getIdCliente());
        assertEquals(1, venta.getTipoProducto());
        assertEquals(123, venta.getIdProducto());
        assertEquals(50.0f, venta.getMontoVenta(), 0.01);
    }
}
