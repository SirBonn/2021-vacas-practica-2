package src.Peliculas;

import src.tienda.*;

public class VectorPeliculas {
    private Pelicula peliculas[] = new Pelicula[50];
    private int ID = 3001;
    int slot = ID - 3000;


    public void agregarPelicula(String nombre, String categoria, int anio, int ID) {
        if (slot > 50) {
            System.out.println("Estamos trabajando en ampliar la estanteria de peliculas\nIntentalo luego");
        } else {
            peliculas[slot - 1] = new Pelicula(nombre, categoria, anio, ID);
        }
        ID++;
    }

    public void agregarPelicula(){
        String nombre = IngresoDatos.getTexto("Nombre de la pelicula: ");
        String categoria = IngresoDatos.getTexto("Categoria: ");
        int anio = IngresoDatos.getEntero("Año: ", false);
        agregarPelicula(nombre, categoria, anio, ID);
    }

    public void mostrarPeliculas(){
        for(int i=0;i<(slot); i++){
            System.out.print("\n\n"+peliculas[i].getDatos("\n\t"));
        }
    }
    

}
