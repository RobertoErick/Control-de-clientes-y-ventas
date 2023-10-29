package src.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import src.main.Internet;

public class InternetTest {

    @Test
    public void testGetIdInternet() {
        Internet internet = new Internet(201, 70.0f);
        int idInternet = internet.getIdInternet();
        assertEquals(201, idInternet);
    }

    @Test
    public void testGetSaldoInternet() {
        Internet internet = new Internet(201, 70.0f);
        float saldoInternet = internet.getSaldoInternet();
        assertEquals(70.0f, saldoInternet, 0.01); // Ajusta la tolerancia según tu caso
    }
}