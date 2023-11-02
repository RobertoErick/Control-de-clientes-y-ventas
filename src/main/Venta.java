package src.main;

// Clase para representar las ventas
public class Venta {
    private int idCliente;
    private int tipoProducto;  // 1: Teléfono, 2: Cable, 3: Internet
    private int idProducto;
    private float montoVenta;
    private String paquete;
    private String extra;

    public Venta(int idCliente, int tipoProducto, int idProducto, float montoVenta, String paquete, String extra) {
        this.idCliente = idCliente;
        this.tipoProducto = tipoProducto;
        this.idProducto = idProducto;
        this.montoVenta = montoVenta;
        this.paquete = paquete;
        this.extra = extra;  
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

    public String getPaquete() {
        return paquete;
    }

    public String getExtra() {
        return extra;
    }

    @Override
    public String toString() {
        return idCliente + "," + tipoProducto + "," + idProducto + "," + montoVenta + "," + paquete + "," + extra;
    }

    public static Venta fromString(String s) {
        String[] partes = s.split(",");
        int idCliente = Integer.parseInt(partes[0]);
        int tipoProducto = Integer.parseInt(partes[1]);
        int idProducto = Integer.parseInt(partes[2]);
        float montoVenta = Float.parseFloat(partes[3]);
        String paquete = partes[4];  // Agregar el paquete
        String extra = partes[5]; 
        return new Venta(idCliente, tipoProducto, idProducto, montoVenta, paquete, extra);
    }
}
