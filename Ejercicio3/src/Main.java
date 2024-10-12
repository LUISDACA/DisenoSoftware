public class Main {
    public static void main(String[] args) {
        Secretario empleado1 = new Secretario("Juan", "Pérez", "12345678", "Calle Falsa 123", "612345678", 30000, "Despacho 1", "123456789");
        Vendedor empleado2 = new Vendedor("Ana", "García", "87654321", "Avenida Siempre Viva 742", "612345679", 40000, "ABC123", "Toyota", "Corolla", "Norte");
        JefeZona jefe = new JefeZona("Carlos", "Martínez", "23456789", "Calle Verano 456", "612345670", 50000, "XYZ789", "Ford", "Focus", "Sur", "Despacho 2");

        empleado1.cambiarSupervisor(jefe);
        empleado2.cambiarSupervisor(jefe);

        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(jefe);

        empleado1.incrementarSalario();
        empleado2.incrementarSalario();
        jefe.incrementarSalario();

        System.out.println("\nSalarios después de incremento:");
        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(jefe);
    }
}