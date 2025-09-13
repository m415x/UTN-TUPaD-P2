package TP05.ejercicio01;

public class Foto {

    private String imagen;
    private String formato;

    public Foto(String imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;
    }

    public void imprimirFoto() {
        System.out.println("Foto: " + imagen + "." + formato);
    }
    
    @Override
    public String toString() {
        return "Foto{" + "imagen=" + imagen 
                + ", formato=" + formato + '}';
    }

}
