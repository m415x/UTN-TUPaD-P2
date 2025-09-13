package TP05.ejercicio09;

public class CitaMedica {
   
    private String fecha;
    private String hora;
    private Paciente paciente;
    private Profesional profesional;

    public CitaMedica(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }
    
    public Paciente getPaciente() {
        return paciente;
    }

    public Profesional getProfesional() {
        return profesional;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public void imprimirInformacionCita() {
        System.out.println("=== CITA MÉDICA ===");
        System.out.println("Fecha: " + fecha);
        System.out.println("Hora: " + hora);
        if (paciente != null) {
            System.out.println("Paciente: " + paciente.getNombre());
        }
        if (profesional != null) {
            System.out.println("Profesional: " + profesional.getNombre() + 
                             " - " + profesional.getEspecialidad());
        }
    }

    @Override
    public String toString() {
        return "CitaMedica{" + "fecha=" + fecha + ", hora=" + hora + 
               ", paciente=" + paciente + ", profesional=" + profesional + '}';
    }
}