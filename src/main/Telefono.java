package src.main;

// Clases para representar productos específicos
public class Telefono {
    private int numTelefono;
    private float saldoTelefono;
    private String paquete;
    private String extra;

    public Telefono(int numTelefono, float saldoTelefono, String paquete, String extra) {
        this.numTelefono = numTelefono;
        this.saldoTelefono = saldoTelefono;
        this.paquete = paquete;
        this.extra = extra;
    }
    

    public int getNumTelefono() {
        return numTelefono;
    }

    public float getSaldoTelefono() {
        return saldoTelefono;
    }

    public String getPaquete() {
        return paquete;
    }

    public String getExtra() {
        return extra;
    }
}
