package src.main;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    // Atributos de la clase Cliente
    private int idCliente;
    private String nombre;
    private String direccion;
    private String razonSocial;
    private List<Telefono> telefonos = new ArrayList<>();
    private List<Cable> cables = new ArrayList<>();
    private List<Internet> internets = new ArrayList<>();

    // Constructor de la clase Cliente
    public Cliente(int idCliente, String nombre, String direccion, String razonSocial) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.direccion = direccion;
        this.razonSocial = razonSocial;
    }

    // Métodos de acceso (getters)
    public int getIdCliente() {
        return idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String razonSocial() {
        return razonSocial;
    }

    // Métodos para vender productos
    public void venderTelefono(Telefono telefono) {
        telefonos.add(telefono);
        
    }

    public void venderCable(Cable cable) {
        cables.add(cable);
        
    }

    public void venderInternet(Internet internet) {
        internets.add(internet);
        
    }

    // Método para calcular el saldo total del cliente
    public float getSaldoTotal(List<Venta> ventas) {
        float saldoTotal = 0;
    
        for (Venta venta : ventas) {
            if (venta.getIdCliente() == idCliente) {
                saldoTotal += venta.getMontoVenta();
            }
        }
    
        return saldoTotal;
    }

    @Override
    public String toString() {
        return idCliente + "," + nombre + "," + direccion + "," + razonSocial;
    }

    public static Cliente fromString(String s) {
        String[] partes = s.split(",");
        int id = Integer.parseInt(partes[0]);
        String nombre = partes[1];
        String direccion = partes[2];
        String razonSocial = partes[3];
        return new Cliente(id, nombre, direccion, razonSocial);
    }
}
