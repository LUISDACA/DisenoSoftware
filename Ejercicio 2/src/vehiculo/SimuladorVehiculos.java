package vehiculo;

public class SimuladorVehiculos {
    public static void main(String[] args) {
        
        Coche coche = new Coche("ABC123", 4);
        coche.acelerar(50);
        System.out.println(coche.toString());

        
        Camion camion = new Camion("XYZ789");
        Remolque remolque = new Remolque(2000);
        camion.ponRemolque(remolque);
        camion.acelerar(80);
        System.out.println(camion.toString());

        
        camion.acelerar(30); 
    }
}