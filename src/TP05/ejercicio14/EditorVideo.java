package TP05.ejercicio14;

public class EditorVideo {
    
    public void exportar(String formato, Proyecto proyecto) {
        if (formato != null && proyecto != null) {
            // Creación del Render (dependencia de creación)
            Render render = new Render(formato);
            render.setProyecto(proyecto);
            
            System.out.println("Iniciando exportación...");
            System.out.println("Formato: " + formato);
            System.out.println("Proyecto: " + proyecto.getNombre());
            System.out.println("Duración: " + proyecto.getDuracionMin() 
                    + " minutos");
                       
            System.out.println("Exportación completada exitosamente!");
            System.out.println("Archivo generado: " 
                    + proyecto.getNombre().toLowerCase().replace(" ", "-") 
                    + "." + formato.toLowerCase());
        } else {
            System.out.println(
                    "Error: No se puede exportar con parámetros nulos");
        }
    }
}