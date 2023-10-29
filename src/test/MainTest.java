package src.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import src.main.Main;

public class MainTest {

    @Test
    public void testIngresarNumero() {
        // Simula entrada de número
        System.setIn(new ByteArrayInputStream("5\n".getBytes()));
        int numero = Main.ingresarNumero("Ingrese un número: ");
        assertEquals(5, numero);
    }

    @Test
    public void testIngresarTexto() {
        // Simula entrada de texto
        System.setIn(new ByteArrayInputStream("Texto de prueba\n".getBytes()));
        String texto = Main.ingresarTexto("Ingrese un texto: ");
        assertEquals("Texto de prueba", texto);
    }
}
