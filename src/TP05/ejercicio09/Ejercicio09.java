package TP05.ejercicio09;

public class Ejercicio09 {
    public static void main(String[] args) {
        
        Paciente paciente = new Paciente("María López", "OSDE 310");
        Profesional profesional = new Profesional(
                "Dra. Carolina Rodríguez", "Cardiología");
        CitaMedica cita = new CitaMedica("2024-03-25", "10:30");
        cita.setPaciente(paciente);
        cita.setProfesional(profesional);
        
        cita.imprimirInformacionCita();
        System.out.println("\n--- Información del paciente ---");
        paciente.imprimirDatosPaciente();
        System.out.println("\n--- Información del profesional ---");
        profesional.imprimirDatosProfesional();
    }
}