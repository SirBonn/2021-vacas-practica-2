package src.tienda;

import src.Peliculas.VectorPeliculas;
import src.clientes.VectorClientes;

public class Principal {

    public static void main(String[] args){
        Principal p = new Principal();
    }

    private VectorPeliculas estantePeliculas = new VectorPeliculas();
    private VectorClientes tablaClientes = new VectorClientes();

    public Principal(){

        int menu = 0;

        while(menu >= 0){
            System.out.println("Bienvenido a memorabilia \n\n");
            System.out.println("1) Ingreso de clientes");
            System.out.println("2) Mostrar clientes");
            System.out.println("3) Ordenar Clientes Ascente");
            System.out.println("4) Ordenar Clientes Descendente");
            System.out.println("-1) Salir");
            System.out.println("\n");
            menu = IngresoDatos.getEntero("Ingrese la opción ", true);

            if (menu == 1 ){
                //ingreso de datos
                tablaClientes.agregarCliente();
            }
            if (menu == 2){
                //mostrar clientes
                tablaClientes.mostrarClientes();
            }
            if (menu == 3){
                //mostrar clientes
                System.out.println("Desordenado:");
                tablaClientes.mostrarClientes();
                System.out.println("\n\nOrdenado:");
                tablaClientes.ordenarPorNombre(true);
                tablaClientes.mostrarClientes();
            }
            if (menu == 4){
                //mostrar clientes
                System.out.println("Desordenado:");
                tablaClientes.mostrarClientes();
                System.out.println("\n\nOrdenado:");
                tablaClientes.ordenarPorNombre(false);
                tablaClientes.mostrarClientes();
            }
            if (menu == 5){
                System.out.println("\n\n");
                estantePeliculas.agregarPelicula();
                System.out.println("\n\n\tNUEVA PELICULA\n\n");
                estantePeliculas.mostrarPeliculas();

            }
            if (menu == 6){
                //mostrar clientes
                System.out.println("Desordenado:");
                estantePeliculas.mostrarPeliculas();
                System.out.println("\n\nOrdenado:");
                estantePeliculas.ordenarPorNombre(true);
                estantePeliculas.mostrarPeliculas();
            }
        }

    }

    
}
