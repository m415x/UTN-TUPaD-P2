package TP05.ejercicio07;

public class Ejercicio07 {
    
    public static void main(String[] args) {
        Motor motor = new Motor("V8 TwinTurbo", "MTR-2024-001");
        Conductor conductor = new Conductor("Roberto Sánchez", "B123456789");
        Vehiculo vehiculo = new Vehiculo("ABC123", "Ford Mustang GT", 
                motor);
        vehiculo.setConductor(conductor);
        
        System.out.println("--- Información del conductor ---");
        conductor.imprimirDatosConductor();
        System.out.println("\n--- Información del vehículo ---");
        vehiculo.imprimirInformacionVehiculo();
        System.out.println("\n--- Especificaciones del motor ---");
        motor.imprimirEspecificacionesMotor();
    }
}