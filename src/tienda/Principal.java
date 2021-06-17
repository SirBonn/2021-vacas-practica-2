package src.tienda;

import src.Peliculas.VectorPeliculas;
import src.clientes.VectorClientes;
import src.TextosEnAscii.Texto;

public class Principal {

    public static void main(String[] args) {
        Principal p = new Principal();
    }

    private int menu = 0;
    private VectorPeliculas estantePeliculas = new VectorPeliculas();
    private VectorClientes tablaClientes = new VectorClientes();

    public Principal() {
        while (menu >= 0) {
            Texto.nombreEmpresa();
            Texto.menuPrincipal();
            System.out.println("1) Clientes");
            System.out.println("2) Peliculas");
            System.out.println("3) Prestar");
            System.out.println("4) Devolver");
            System.out.println("5) reportes");
            System.out.println("-1) Salir");
            System.out.println("\n");
            menu = IngresoDatos.getEntero("Ingrese la opción ", true);

            if (menu == 1) {
                menuClientes();
            }
            if (menu == 2) {

                menuPeliculas();
            }
            if (menu == 3) {

            }
            if (menu == 4) {

            }
            if (menu == 5) {

            }
            if (menu == 6) {

            }
        }
    }

    public void menuClientes() {
        while (menu >= 0) {
            Texto.limpiarPantalla();
            Texto.clientes();
            System.out.println("1) Agregar Cliente");
            System.out.println("2) Mostrar clientes");
            System.out.println("3) Ordenar Clientes Ascente");
            System.out.println("4) Ordenar Clientes Descendente");
            System.out.println("-1) Salir");
            System.out.println("\n");
            menu = IngresoDatos.getEntero("Ingrese la opción ", true);

            if (menu == 1) {
                // ingreso de datos
                tablaClientes.agregarCliente();
            }
            if (menu == 2) {
                // mostrar clientes
                tablaClientes.mostrarClientes();
            }
            if (menu == 3) {
                // mostrar clientes
                System.out.println("Desordenado:");
                tablaClientes.mostrarClientes();
                System.out.println("\n\nOrdenado:");
                tablaClientes.ordenarPorNombre(true);
                tablaClientes.mostrarClientes();
            }
            if (menu == 4) {
                // mostrar clientes
                System.out.println("Desordenado:");
                tablaClientes.mostrarClientes();
                System.out.println("\n\nOrdenado:");
                tablaClientes.ordenarPorNombre(false);
                tablaClientes.mostrarClientes();
            }
        }
        menu = 0;
        Texto.limpiarPantalla();
    }

    public void menuPeliculas() {
        while (menu >= 0) {
            Texto.limpiarPantalla();
            Texto.peliculas();
            System.out.println("1) Ingresar peliculas");
            System.out.println("2) Mostrar peliculsa");
            System.out.println("3) Ordenar peliculas A-Z");
            System.out.println("4) Ordenar peliculas Z-A");
            System.out.println("5) Ordenar por categorias");
            System.out.println("6) Ordenar por año 1-9");
            System.out.println("7) Ordenar por año 9-1");
            System.out.println("-1) Salir");
            System.out.println("\n");
            menu = IngresoDatos.getEntero("Ingrese la opción ", true);

            if (menu == 1) {
                // ingreso de datos
                System.out.println("\n\n");
                estantePeliculas.agregarPelicula();
                System.out.println("\n\n\tNUEVA PELICULA\n\n");
                estantePeliculas.mostrarPeliculas();
                Texto.esperar();
            }
            if (menu == 2) {
                estantePeliculas.mostrarPeliculas();
            }
            if (menu == 3) {
                System.out.println("\n\nOrdenado:");
                estantePeliculas.ordenar(0);
                estantePeliculas.mostrarPeliculas();
                Texto.esperar();
            }
            if (menu == 4) {
                System.out.println("\n\nOrdenado:");
                estantePeliculas.ordenar(1);
                estantePeliculas.mostrarPeliculas();
                Texto.esperar();
            }
            if (menu == 5) {
                System.out.println("\n\nOrdenado:");
                estantePeliculas.ordenar(2);
                estantePeliculas.mostrarPeliculas();
                Texto.esperar();
            }
            if (menu == 6) {
                System.out.println("\n\nOrdenado:");
                estantePeliculas.ordenar(3);
                estantePeliculas.mostrarPeliculas();
                Texto.esperar();
            } 
            if (menu == 7) {
                System.out.println("\n\nOrdenado:");
                estantePeliculas.ordenar(4);
                estantePeliculas.mostrarPeliculas();
                Texto.esperar();
            }

        }
        menu = 0;
        Texto.limpiarPantalla();
    }

}
