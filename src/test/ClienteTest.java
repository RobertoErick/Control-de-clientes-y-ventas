package src.test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import src.main.Cliente;
import src.main.Venta;

public class ClienteTest {
    private Cliente cliente;
    private List<Venta> ventas;

    @BeforeEach
    public void setUp() {
        // Configuración inicial para cada prueba
        cliente = new Cliente(1, "Ejemplo", "Dirección", "Razón Social");
        ventas = new ArrayList<>();
    }

    @Test
    public void testConstructor() {
        // Prueba el constructor de la clase Cliente
        assertEquals(1, cliente.getIdCliente());
        assertEquals("Ejemplo", cliente.getNombre());
        assertEquals("Dirección", cliente.getDireccion());
        assertEquals("Razón Social", cliente.razonSocial());
    }

    @Test
    public void testCrearCliente() {
        Cliente cliente = new Cliente(1, "Juan", "Calle A", "Empresa XYZ");
        assertEquals(1, cliente.getIdCliente());
        assertEquals("Juan", cliente.getNombre());
        assertEquals("Calle A", cliente.getDireccion());
        assertEquals("Empresa XYZ", cliente.razonSocial());
    }

    @Test
    public void testGetSaldoTotal() {
        Cliente cliente = new Cliente(1, "Juan", "Calle A", "Empresa XYZ");
        List<Venta> ventas = new ArrayList<>();
        ventas.add(new Venta(1, 1, 123, 50.0f));
        ventas.add(new Venta(1, 2, 101, 30.0f));
        ventas.add(new Venta(1, 3, 201, 70.0f));
        float saldoTotal = cliente.getSaldoTotal(ventas);
        assertEquals(150.0f, saldoTotal, 0.01);
    }
}

