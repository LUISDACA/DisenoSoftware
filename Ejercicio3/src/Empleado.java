import java.util.ArrayList;
import java.util.List;

class Empleado {
    protected String nombre;
    protected String apellidos;
    protected String cc; 
    protected String direccion;
    protected String telefono;
    protected double salario;
    protected int antiguedad;
    protected Empleado supervisor;

    public Empleado(String nombre, String apellidos, String cc, String direccion, String telefono, double salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cc = cc; 
        this.direccion = direccion;
        this.telefono = telefono;
        this.salario = salario;
        this.antiguedad = 0;
        this.supervisor = null;
    }

    @Override
    public String toString() {
        return String.format("%s %s, CC: %s, Teléfono: %s, Salario: %.2f", nombre, apellidos, cc, telefono, salario);
    }

    public void cambiarSupervisor(Empleado nuevoSupervisor) {
        this.supervisor = nuevoSupervisor;
    }

    public void incrementarSalario() {
        
    }
}

class Secretario extends Empleado {
    private String despacho;
    private String fax;

    public Secretario(String nombre, String apellidos, String cc, String direccion, String telefono, double salario, String despacho, String fax) {
        super(nombre, apellidos, cc, direccion, telefono, salario); // Cambiado de dni a cc
        this.despacho = despacho;
        this.fax = fax;
    }

    @Override
    public String toString() {
        return String.format("Secretario: %s, Despacho: %s, Fax: %s", super.toString(), despacho, fax);
    }

    @Override
    public void incrementarSalario() {
        this.salario *= 1.05; 
    }
}

class Vendedor extends Empleado {
    private String cocheMatricula;
    private String cocheMarca;
    private String cocheModelo;
    private String areaVenta;
    private double comision;
    private List<String> clientes;

    public Vendedor(String nombre, String apellidos, String cc, String direccion, String telefono, double salario,
                    String cocheMatricula, String cocheMarca, String cocheModelo, String areaVenta) {
        super(nombre, apellidos, cc, direccion, telefono, salario);
        this.cocheMatricula = cocheMatricula;
        this.cocheMarca = cocheMarca;
        this.cocheModelo = cocheModelo;
        this.areaVenta = areaVenta;
        this.comision = 0.1; 
        this.clientes = new ArrayList<>();
    }

    @Override
    public String toString() {
        return String.format("Vendedor: %s, Coche: %s %s (%s), Área de Venta: %s", super.toString(),
                cocheMarca, cocheModelo, cocheMatricula, areaVenta);
    }

    public void darAltaCliente(String cliente) {
        clientes.add(cliente);
    }

    public void darBajaCliente(String cliente) {
        clientes.remove(cliente);
    }

    public void cambiarCoche(String matricula, String marca, String modelo) {
        this.cocheMatricula = matricula;
        this.cocheMarca = marca;
        this.cocheModelo = modelo;
    }

    @Override
    public void incrementarSalario() {
        this.salario *= 1.10; 
    }
}

class JefeZona extends Vendedor {
    private String despacho;
    private Empleado secretario;
    private List<Vendedor> vendedores;

    public JefeZona(String nombre, String apellidos, String cc, String direccion, String telefono, double salario,
                    String cocheMatricula, String cocheMarca, String cocheModelo, String areaVenta, String despacho) {
        super(nombre, apellidos, cc, direccion, telefono, salario, cocheMatricula, cocheMarca, cocheModelo, areaVenta);
        this.despacho = despacho;
        this.secretario = null;
        this.vendedores = new ArrayList<>();
    }

    @Override
    public String toString() {
        return String.format("Jefe de Zona: %s, Despacho: %s", super.toString(), despacho);
    }

    public void cambiarSecretario(Empleado nuevoSecretario) {
        this.secretario = nuevoSecretario;
    }

    public void darAltaVendedor(Vendedor vendedor) {
        vendedores.add(vendedor);
    }

    public void darBajaVendedor(Vendedor vendedor) {
        vendedores.remove(vendedor);
    }

    @Override
    public void incrementarSalario() {
        this.salario *= 1.20;
    }
}