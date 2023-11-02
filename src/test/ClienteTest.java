package src.test;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

import src.main.Cliente;
import src.main.Telefono;
import src.main.Venta;
import src.main.Internet;
import src.main.Cable;

public class ClienteTest {

    @Test
    public void testGetIdClienteA() {
        Cliente cliente = new Cliente(1, "Cliente1", "Dirección1", "Razón Social1");
        assertEquals(1, cliente.getIdCliente());
    }

    @Test
    public void testGetIdClienteB() {
        Cliente cliente = new Cliente(1, "Cliente1", "Dirección1", "Razón Social1");
        assertEquals(2, cliente.getIdCliente());
    }

    @Test
    public void testGetNombreA() {
        Cliente cliente = new Cliente(1, "Cliente1", "Dirección1", "Razón Social1");
        assertEquals("Cliente1", cliente.getNombre());
    }

    @Test
    public void testGetNombreB() {
        Cliente cliente = new Cliente(1, "Cliente1", "Dirección1", "Razón Social1");
        assertEquals("Cliente2", cliente.getNombre());
    }

    @Test
    public void testGetDireccionA() {
        Cliente cliente = new Cliente(1, "Cliente1", "Dirección1", "Razón Social1");
        assertEquals("Dirección1", cliente.getDireccion());
    }

    @Test
    public void testGetDireccionB() {
        Cliente cliente = new Cliente(1, "Cliente1", "Dirección1", "Razón Social1");
        assertEquals("Dirección2", cliente.getDireccion());
    }

    @Test
    public void testGetRazonSocialA() {
        Cliente cliente = new Cliente(1, "Cliente1", "Dirección1", "Razón Social1");
        assertEquals("Razón Social1", cliente.razonSocial());
    }

    @Test
    public void testGetRazonSocialB() {
        Cliente cliente = new Cliente(1, "Cliente1", "Dirección1", "Razón Social1");
        assertEquals("Razón Social2", cliente.razonSocial());
    }

    @Test
    public void testVenderTelefono1() {
        Cliente cliente = new Cliente(1, "Cliente1", "Dirección1", "Razón Social1");
        Telefono telefono = new Telefono(123, 50.0f, "Premium", "Llamadas Internacionales");
        cliente.venderTelefono(telefono);
        assertEquals(1, cliente.telefonos.size());
    }

    @Test
    public void testVenderTelefono2() {
        Cliente cliente = new Cliente(1, "Cliente1", "Dirección1", "Razón Social1");
        Telefono telefono = new Telefono(123, 50.0f, "Premium", "Llamadas Internacionales");
        cliente.venderTelefono(telefono);
        assertEquals(2, cliente.telefonos.size());
    }


    @Test
    public void testVenderCableA() {
        Cliente cliente = new Cliente(1, "Cliente1", "Dirección1", "Razón Social1");
        Cable cable = new Cable(456, 75.0f, "Estándar", "Canales Internacionales");
        cliente.venderCable(cable);
        assertEquals(1, cliente.cables.size());
    }

    @Test
    public void testVenderCableB() {
        Cliente cliente = new Cliente(1, "Cliente1", "Dirección1", "Razón Social1");
        Cable cable = new Cable(456, 75.0f, "Estándar", "Canales Internacionales");
        cliente.venderCable(cable);
        assertEquals(2, cliente.cables.size());
    }

    @Test
    public void testVenderInternetA() {
        Cliente cliente = new Cliente(1, "Cliente1", "Dirección1", "Razón Social1");
        Internet internet = new Internet(789, 40.0f, "Premium", "Servicio de Streaming");
        cliente.venderInternet(internet);
        assertEquals(1, cliente.internets.size());
    }

    @Test
    public void testVenderInternetB() {
        Cliente cliente = new Cliente(1, "Cliente1", "Dirección1", "Razón Social1");
        Internet internet = new Internet(789, 40.0f, "Premium", "Servicio de Streaming");
        cliente.venderInternet(internet);
        assertEquals(2, cliente.internets.size());
    }

    @Test
    public void testGetSaldoTotalA() {
        Cliente cliente = new Cliente(1, "Cliente1", "Dirección1", "Razón Social1");
        List<Venta> ventas = new ArrayList<>();
        ventas.add(new Venta(1, 1, 123, 50.0f, "Premium", "Llamadas Internacionales"));
        ventas.add(new Venta(1, 2, 456, 75.0f, "Estándar", "Canales Internacionales"));
        ventas.add(new Venta(2, 1, 789, 40.0f, "Premium", "Servicio de Streaming"));
        float saldoTotal = cliente.getSaldoTotal(ventas);
        assertEquals(125.0f, saldoTotal, 0.01);
    }

    @Test
    public void testGetSaldoTotalB() {
        Cliente cliente = new Cliente(1, "Cliente1", "Dirección1", "Razón Social1");
        List<Venta> ventas = new ArrayList<>();
        ventas.add(new Venta(1, 1, 123, 50.0f, "Premium", "Llamadas Internacionales"));
        ventas.add(new Venta(1, 2, 456, 75.0f, "Estándar", "Canales Internacionales"));
        ventas.add(new Venta(2, 1, 789, 40.0f, "Premium", "Servicio de Streaming"));
        float saldoTotal = cliente.getSaldoTotal(ventas);
        assertEquals(130.0f, saldoTotal, 0.01);
    }
}