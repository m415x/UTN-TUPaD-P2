package TP05.ejercicio10;

public class ClaveSeguridad {
    private String codigo;
    private String ultimaModificacion;

    public ClaveSeguridad(String codigo, String ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getUltimaModificacion() {
        return ultimaModificacion;
    }

    public void imprimirInformacionClave() {
        System.out.println("Código de seguridad: " 
                + codigo.substring(0, 2) + "******");
        System.out.println("Última modificación: " + ultimaModificacion);
    }

    @Override
    public String toString() {
        return "ClaveSeguridad{" + "codigo=" + codigo 
                + ", ultimaModificacion=" + ultimaModificacion + '}';
    }
}