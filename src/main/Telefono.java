package src.main;

// Clases para representar productos específicos
public class Telefono {
    private int numTelefono;
    private float saldoTelefono;

    public Telefono(int numTelefono, float saldoTelefono) {
        this.numTelefono = numTelefono;
        this.saldoTelefono = saldoTelefono;
    }

    public int getNumTelefono() {
        return numTelefono;
    }

    public float getSaldoTelefono() {
        return saldoTelefono;
    }
}
