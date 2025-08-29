package TP03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Elejir una clase para instanciar (1-5) -> ");
        int clase = scan.nextInt();

        switch (clase) {
            case 1:
                System.out.println("\nRegistro de estudiantes\n".toUpperCase());
                // Instanciar la clase Estudiante
                Estudiante estudiante = new Estudiante();
                // Asignar valores a los atributos
                estudiante.nombre = "Cristian";
                estudiante.apellido = "Lahoz";
                estudiante.curso = "Primero";
                estudiante.calificacion = 7.5;
                // Mostrar estado
                estudiante.mostrarInfo();
                // Modificar estado a través de métodos y mostrarlos
                System.out.println("-> Subir la calificación en 2 unidades");
                estudiante.subirCalificacion(2);
                estudiante.mostrarInfo();
                System.out.println("-> Subir la calificación en 6 unidades");
                estudiante.subirCalificacion(6);
                estudiante.mostrarInfo();
                System.out.println("-> Bajar la calificación en 3 unidades");
                estudiante.bajarCalificacion(3);
                estudiante.mostrarInfo();
                System.out.println("-> Bajar la calificación en 15 unidades");
                estudiante.bajarCalificacion(15);
                estudiante.mostrarInfo();
                break;
            case 2:
                System.out.println("\nRegistro de mascotas\n".toUpperCase());
                // Instanciar la clase Mascota
                Mascota perro = new Mascota();
                // Asignar valores a los atributos
                perro.nombre = "Lola";
                perro.especie = "Labrador";
                perro.edad = 16;
                // Mostrar estado
                perro.mostrarInfo();
                // Modificar estado a través de métodos y mostrarlos
                System.out.println("-> Cumplir 1 año");
                perro.cumplirAnios();
                perro.mostrarInfo();
                break;
            case 3:
                System.out.println(
                        "\nEncapsulamiento con la Clase Libro\n".toUpperCase()
                );
                // Instanciar la clase Libro
                Libro libro = new Libro();
                // Modificar estado a través de método y mostrarlos
                System.out.println("-> Asignar -350");
                libro.setAnioPublicacion(-350);
                System.out.println("-> Asignar 3000");
                libro.setAnioPublicacion(3000);
                System.out.println("-> Asignar 2025");
                libro.setAnioPublicacion(2025);
                System.out.printf(
                        "Título del Libro: %s\n"
                        + "Autor: %s\n"
                        + "Año de publicación: %d\n\n",
                        libro.getTitulo(), 
                        libro.getAutor(),
                        libro.getAnioPublicacion()
                );
                break;
            case 4:
                System.out.println(
                        "\nGestión de Gallinas "
                                + "en Granja Digital \n".toUpperCase()
                );
                // Instanciar dos clases Gallina con edad y huevos puestos
                Gallina gallina1 = new Gallina(1, 500);
                Gallina gallina2 = new Gallina(3, 800);
                // Mostrar estados iniciales
                gallina1.mostrarEstado();
                gallina2.mostrarEstado();
                // Modificar estado a través de métodos y mostrarlos
                gallina1.envejecer();
                gallina2.ponerHuevo();
                gallina1.mostrarEstado();
                gallina2.mostrarEstado();
            case 5:
                System.out.println(
                        "\nSimulación de Nave Espacial\n".toUpperCase()
                );
                // Instanciar dos clase NaveEspacial 
                NaveEspacial nave = new NaveEspacial("Apollo", 50);
                // Mostrar estado inicial
                System.out.println("Estado Inicial de la Nave");
                nave.mostrarEstado();
                // Intentar avanzar sin recargar
                nave.avanzar(60000);
                // Recargar combustible
                nave.recargarCombustible(180);
                // Despegar y avanzar correctamente
                nave.despegar();
                nave.avanzar(60000);
                // Estado final
                System.out.println("\nEstado Final de la Nave");
                nave.mostrarEstado();
                break;
        }
    }
}
