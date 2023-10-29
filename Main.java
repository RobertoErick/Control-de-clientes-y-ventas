import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Cliente {
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

// Clase para representar las ventas
class Venta {
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

// Clases para representar productos específicos
class Telefono {
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

class Cable {
    private int idCable;
    private float saldoCable;

    public Cable(int idCable, float saldoCable) {
        this.idCable = idCable;
        this.saldoCable = saldoCable;
    }

    public int getIdCable() {
        return idCable;
    }

    public float getSaldoCable() {
        return saldoCable;
    }
}

class Internet {
    private int idInternet;
    private float saldoInternet;

    public Internet(int idInternet, float saldoInternet) {
        this.idInternet = idInternet;
        this.saldoInternet = saldoInternet;
    }

    public int getIdInternet() {
        return idInternet;
    }

    public float getSaldoInternet() {
        return saldoInternet;
    }
}

public class Main {
    public static void main(String[] args) {
        // Declaración e inicialización de listas para clientes y ventas
        List<Cliente> clientes = new ArrayList<>();
        List<Venta> ventas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        File archivoClientes = new File("clientes.txt");
        File archivoVentas = new File("ventas.txt");

        // Cargar clientes desde el archivo al inicio del programa
        try (BufferedReader br = new BufferedReader(new FileReader(archivoClientes))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                Cliente cliente = Cliente.fromString(linea);
                clientes.add(cliente);
            }
        } catch (IOException e) {
            // Manejar excepciones si ocurre un error al leer el archivo
            e.printStackTrace();
        }

        // Cargar ventas desde el archivo al inicio del programa
        try (BufferedReader br = new BufferedReader(new FileReader(archivoVentas))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                Venta venta = Venta.fromString(linea);
                ventas.add(venta);
            }
        } catch (IOException e) {
            // Manejar excepciones si ocurre un error al leer el archivo
            e.printStackTrace();
        }

        while (true) {
            // Menú principal
            System.out.println("Menú:");
            System.out.println("1. Registrar un cliente");
            System.out.println("2. Eliminar un cliente");
            System.out.println("3. Mostrar clientes registrados");
            System.out.println("4. Vender producto a cliente");
            System.out.println("5. Mostrar ventas");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            
            int opcion = ingresarNumero("");
            
            switch (opcion) {
                case 1:
                    // Registrar un nuevo cliente
                    System.out.println("Ingrese los datos del cliente:");
                    int idCliente = ingresarNumero("ID del Cliente: ");
                    String nombre = ingresarTexto("Nombre: ");
                    System.out.print("Dirección: ");
                    String direccion = scanner.nextLine();
                    String razonSocial = ingresarTexto("Razon social: ");
                    Cliente nuevoCliente = new Cliente(idCliente, nombre, direccion, razonSocial);
                    clientes.add(nuevoCliente);
                    System.out.println("Cliente registrado con éxito.");
                    break;
                case 2:
                    // Eliminar un cliente
                    int idEliminar = ingresarNumero("Ingrese el ID del cliente a eliminar: ");
                    boolean eliminado = false;
                    for (Cliente cliente : clientes) {
                        if (cliente.getIdCliente() == idEliminar) {
                            clientes.remove(cliente);
                            eliminado = true;
                            System.out.println("Cliente eliminado con éxito.");
                            break;
                        }
                    }
                    if (!eliminado) {
                        System.out.println("Cliente no encontrado.");
                    }
                    break;
                case 3:
                    // Mostrar clientes registrados
                    System.out.println("Clientes registrados:");
                    for (Cliente cliente : clientes) {
                        float saldoTotal = cliente.getSaldoTotal(ventas);
                        System.out.println("ID: " + cliente.getIdCliente() + ", Nombre: " + cliente.getNombre() + ", Dirección: " + cliente.getDireccion() + ", Saldo Total: " + saldoTotal);
                    }
                break;
                case 4:
                    // Vender producto a cliente
                    venderProducto(clientes, ventas);
                    break;
                case 5:
                    // Mostrar ventas realizadas
                    System.out.println("Ventas realizadas:");
                    for (Venta venta : ventas) {
                        String tipoProducto = "";
                    switch (venta.getTipoProducto()) {
                        case 1:
                            tipoProducto = "Teléfono";
                            break;
                        case 2:
                            tipoProducto = "Cable";
                            break;
                        case 3:
                            tipoProducto = "Internet";
                            break;
                        default:
                            tipoProducto = "Desconocido";
                            break;
                    }
                    System.out.println("ID cliente: " + venta.getIdCliente() + ", Tipo: " + tipoProducto + ", ID producto: " + venta.getIdProducto() + ", Monto: " + venta.getMontoVenta());
                    }
                    break;
                case 6:
                    // Salir del programa
                    System.out.println("Saliendo del programa.");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
            // Guardar los cambios en el archivo de clientes
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivoClientes))) {
                for (Cliente cliente : clientes) {
                    bw.write(cliente.toString());
                    bw.newLine();
                }
            } catch (IOException e) {
                // Manejar excepciones si ocurre un error al escribir en el archivo
                e.printStackTrace();
            }
        }
    }

    public static void venderProducto(List<Cliente> clientes, List<Venta> ventas) {
        Scanner scanner = new Scanner(System.in);
        
        int idClienteVender = ingresarNumero("Ingrese el ID del cliente al que desea vender un producto: ");
    
        Cliente clienteEncontrado = null;
        int tipoProducto = 0;  // Variable para el tipo de producto
        int idProducto = 0;    // Variable para el ID del producto
        float montoVenta = 0;  // Variable para el monto de la venta
    
        for (Cliente cliente : clientes) {
            if (cliente.getIdCliente() == idClienteVender) {
                clienteEncontrado = cliente;
                System.out.println("Elija el tipo de producto a vender:");
                System.out.println("1. Teléfono");
                System.out.println("2. Cable");
                System.out.println("3. Internet");
                tipoProducto = scanner.nextInt();
                scanner.nextLine();
    
                switch (tipoProducto) {
                    case 1:
                        // Registrar venta de Teléfono
                        int numTelefono = ingresarNumero("Ingrese el número de teléfono: "); // El numero de telefono tambien es su ID
                        float saldoTelefono = ingresarNumeroFloat("Ingrese el saldo del teléfono: ");
                        cliente.venderTelefono(new Telefono(numTelefono, saldoTelefono));
                        idProducto = numTelefono;    // El id del producto es el numero de telefono
                        montoVenta = saldoTelefono;  // El monto de la venta es el saldo del teléfono
                        System.out.println("Producto de teléfono vendido con éxito.");
                    break;
                    case 2:
                        // Registrar venta de Cable
                        int idCable = ingresarNumero("Ingrese el ID del cable: ");
                        float saldoCable = ingresarNumeroFloat("Ingrese el saldo del cable: ");
                        cliente.venderCable(new Cable(idCable, saldoCable));
                        idProducto = idCable;
                        montoVenta = saldoCable;  // El monto de la venta es el saldo del cable
                        System.out.println("Producto de cable vendido con éxito.");
                    break;
                    case 3:
                        // Registrar venta de Internet
                        int idInternet = ingresarNumero("Ingrese el ID de Internet: ");
                        float saldoInternet = ingresarNumeroFloat("Ingrese el saldo de Internet: ");
                        cliente.venderInternet(new Internet(idInternet, saldoInternet));
                        idProducto = idInternet;
                        montoVenta = saldoInternet;  // El monto de la venta es el saldo de Internet
                        System.out.println("Producto de Internet vendido con éxito.");
                    break;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                        break;
                }
            }
        }
    
        if (clienteEncontrado == null) {
            System.out.println("Cliente no encontrado.");
        } else {
            // Luego de registrar la venta, agrega la venta a la lista de ventas
            ventas.add(new Venta(idClienteVender, tipoProducto, idProducto, montoVenta));
    
            // Escribe las ventas en un archivo de registro de ventas
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("ventas.txt", true))) {
                bw.write(ventas.get(ventas.size() - 1).toString());  // Agregar la última venta
                bw.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static int ingresarNumero(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        boolean entradaValida = false;
    
        while (!entradaValida) {
            System.out.print(mensaje);
            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
                entradaValida = true;
            } else {
                System.out.println("Por favor, ingrese un número válido.");
                scanner.nextLine(); // Limpiar la entrada incorrecta
            }
            scanner.nextLine(); // Limpiar la nueva línea después de la entrada numérica
        }
        return numero;
    }

    public static float ingresarNumeroFloat(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        float numero = 0;
        boolean entradaValida = false;
    
        while (!entradaValida) {
            System.out.print(mensaje);
            if (scanner.hasNextFloat()) {
                numero = scanner.nextFloat();
                entradaValida = true;
            } else {
                System.out.println("Por favor, ingrese un número válido.");
                scanner.nextLine(); // Limpiar la entrada incorrecta
            }
            scanner.nextLine(); // Limpiar la nueva línea después de la entrada numérica
        }
        return numero;
    }        
    
    public static String ingresarTexto(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        String texto = "";
    
        System.out.print(mensaje);
        texto = scanner.nextLine();
    
        // Puedes agregar validaciones adicionales para asegurarte de que solo haya letras
        if (texto.matches("^[a-zA-Z ]+$")) {
            return texto;
        } else {
            System.out.println("Por favor, ingrese un texto válido (solo letras y espacios).");
            return ingresarTexto(mensaje);
        }
    }
}