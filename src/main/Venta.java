package src.main;

// Clase para representar las ventas
public class Venta {
    private int idCliente;
    private int tipoProducto;  // 1: Teléfono, 2: Cable, 3: Internet
    private int idProducto;
    private float montoVenta;

    public Venta(int idCliente, int tipoProducto, int idProducto, float montoVenta) {
        this.idCliente = idCliente;
        this.tipoProducto = tipoProducto;
        this.idProducto = idProducto;
        this.montoVenta = montoVenta;
    }

    // Métodos de acceso (getters)
    public int getIdCliente() {
        return idCliente;
    }

    public int getTipoProducto() {
        return tipoProducto;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public float getMontoVenta() {
        return montoVenta;
    }

    @Override
    public String toString() {
        return idCliente + "," + tipoProducto + "," + idProducto + "," + montoVenta;
    }

    public static Venta fromString(String s) {
        String[] partes = s.split(",");
        int idCliente = Integer.parseInt(partes[0]);
        int tipoProducto = Integer.parseInt(partes[1]);
        int idProducto = Integer.parseInt(partes[2]);
        float montoVenta = Float.parseFloat(partes[3]);
        return new Venta(idCliente, tipoProducto, idProducto, montoVenta);
    }
}
