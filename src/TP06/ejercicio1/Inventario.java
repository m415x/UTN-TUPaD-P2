package TP06.ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inventario {

    private List<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto p) {
        if (p != null && !productos.contains(p)) {
            productos.add(p);
        }
    }

    public void listarProductos() {
        for (Producto p : productos) {
            System.out.println("id=" + p.getId()
                    + ", nombre=" + p.getNombre()
                    + ", precio=" + p.getPrecio()
                    + ", cantidad=" + p.getCantidad()
                    + ", categoria=" + p.getCategoria());
        }
    }

    public Producto buscarProductoPorId(String id) {
        int i = 0;
        Producto encontrado = null;
        while (i < productos.size()
                && !this.productos.get(i).getId().equals(id)) {
            i++;
        }
        if (i < productos.size()) {
            encontrado = this.productos.get(i);
        }
        if (encontrado == null) {
            System.out.println("id " + id + " no encontrado");
        }
        return encontrado;
    }

    public Producto eliminarProducto(String id) {
        Producto eliminar = buscarProductoPorId(id);
        this.productos.remove(eliminar);
        return eliminar;
    }

    public boolean actualizarStock(String id, int nuevaCantidad) {
        Producto stock = buscarProductoPorId(id);
        if(stock == null) return false;
        stock.setCantidad(nuevaCantidad);
        return true;
    }

    public List<Producto> filtrarPorCategoria(CategoriaProducto c) {
        List<Producto> encontrados = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getCategoria() == c) {
                encontrados.add(p);
            }
        }
        return  Collections.unmodifiableList(encontrados);
    }

    public int obtenerTotalStock() {
        int totalStock = 0;
        for (Producto p : productos) {
            totalStock += p.getCantidad();
        }
        return totalStock;
    }

    public Producto obtenerProductoConMayorStock() {
        Producto prodMayorStock = null;
        int mayorStock = 0;
        for (Producto p : productos) {
            if(p.getCantidad() > mayorStock){
                mayorStock = p.getCantidad();
                prodMayorStock = p;
            }
        }
        return prodMayorStock;
    }

    public List<Producto> filtrarProductosPorPrecio(double min, double max) {
        List<Producto> prodFiltrados = new ArrayList<>();
        for (Producto p : productos) {
            if(p.getPrecio() >= min && p.getPrecio() <= max){
                prodFiltrados.add(p);
            }
        }
        return Collections.unmodifiableList(prodFiltrados);
    }

    public void mostrarCategoriasDisponibles() {
        for (CategoriaProducto c : CategoriaProducto.values()) {
            System.out.println(c.name() + ": " + c.getDescripcion());
        }
    }

}
