package TP05.ejercicio14;

public class Ejercicio14 {
    public static void main(String[] args) {
        
        Proyecto proyecto = new Proyecto("Documental Dinosaurios", 45);
        EditorVideo editor = new EditorVideo();
        
        System.out.println("=== EDITOR DE VIDEO PROFESIONAL ===");
        proyecto.imprimirInfoProyecto();
        System.out.println("\n--- Exportando proyecto ---");
        editor.exportar("MP4", proyecto);
    }
}