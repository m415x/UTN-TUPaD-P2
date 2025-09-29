package TP06.ejercicio1;

public class Main {

    public static void main(String[] args) {
        // Instanciamos el inventario
        Inventario inv = new Inventario();

        // Instanciamos productos
        Producto p1 = new Producto("01", "Remera", 50000.5, 6, CategoriaProducto.ROPA);
        Producto p2 = new Producto("03", "Hamburguesas", 1325, 15, CategoriaProducto.ALIMENTOS);
        Producto p3 = new Producto("09", "Gaseosa", 2000, 30, CategoriaProducto.ALIMENTOS);
        Producto p4 = new Producto("13", "Pantalón", 130716.45, 3, CategoriaProducto.ROPA);
        Producto p5 = new Producto("23", "Placard", 300000, 2, CategoriaProducto.HOGAR);
        Producto p6 = new Producto("19", "Placa Madre", 550000, 5, CategoriaProducto.ELECTRONICA);
        Producto p7 = new Producto("35", "TV", 650000, 15, CategoriaProducto.ELECTRONICA);
        Producto p8 = new Producto("27", "Smartphone", 2000000, 6, CategoriaProducto.ELECTRONICA);
        Producto p9 = new Producto("31", "Parlante", 80000, 8, CategoriaProducto.ELECTRONICA);

        // Añadimos los productos al inventario
        inv.agregarProducto(p1);
        inv.agregarProducto(p2);
        inv.agregarProducto(p3);
        inv.agregarProducto(p4);
        inv.agregarProducto(p5);
        inv.agregarProducto(p6);
        inv.agregarProducto(p7);
        inv.agregarProducto(p8);
        inv.agregarProducto(p9);

        // Mostramos todos los productos
        System.out.println("Lista de productos:");
        inv.listarProductos();

        // Buscamos producto por id
        System.out.println("\nBuscar por id");
        System.out.println(inv.buscarProductoPorId("19"));
        System.out.println(inv.buscarProductoPorId("20"));

        // Filtramos por categoría
        System.out.println("\nFiltrar por categoría");
        System.out.println(inv.filtrarPorCategoria(CategoriaProducto.ROPA));
        System.out.println(inv.filtrarPorCategoria(CategoriaProducto.ELECTRONICA));
        
        // Eliminamos un producto y mostramos la lista actualizada
        System.out.println("\nSe eliminó: " + inv.eliminarProducto("35"));
        System.out.println("\nLista actualizada de productos:");
        inv.listarProductos();
        
        // Actualizamos el stock de un producto
        System.out.println("\nProducto antes de actualizar stock");
        System.out.println(inv.buscarProductoPorId("13"));
        inv.actualizarStock("13", 20);
        System.out.println("Producto después de actualizar stock");
        System.out.println(inv.buscarProductoPorId("13"));
        
        // Mostramos el total de stock
        System.out.println("\nEl total de stock es: " 
                + inv.obtenerTotalStock());
        
        // Mostramos producto con mayor stock
        System.out.println("\nEl producto con mayor stock es: " 
                + inv.obtenerProductoConMayorStock());
        
        // Filtramos productos con precios entre $1000 y $3000
        System.out.println("\nProductos con precios entre 1000 y 3000: " 
                + inv.filtrarProductosPorPrecio(1000, 3000));
        
        // Mostramos las categorías disponibles con sus descripciones
        System.out.println("\nCategorías disponibles:");
        inv.mostrarCategoriasDisponibles();
    }

}
