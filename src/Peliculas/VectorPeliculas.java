package src.Peliculas;

import src.tienda.*;

public class VectorPeliculas {
    private Pelicula peliculas[] = new Pelicula[50];
    private int ID;
    
    public VectorPeliculas(){
        ID = 1;
    }

    public void agregarPelicula(String nombre, String categoria, int anio) {
        if (ID > 50) {
            System.out.println("Estamos trabajando en ampliar la estanteria de peliculas\nIntentalo luego");
        } else {
            peliculas[(ID - 1)] = new Pelicula(nombre, categoria, anio, (ID+3000));
        }
        ID++;
    }

    public void agregarPelicula(){
        String nombre = IngresoDatos.getTexto("Nombre de la pelicula: ");
        String categoria = IngresoDatos.getTexto("Categoria: ");
        int anio = IngresoDatos.getEntero("Año: ", false);
        agregarPelicula(nombre, categoria, anio);
    }

    public void mostrarPeliculas(){
        for(int i=0;i<(ID-1); i++){
            System.out.print("\n\n"+peliculas[i].getDatos("\n\t"));
        }
    }

    public void ordenarPorNombre(boolean ascendente){
        boolean cambio = true;

        for (int i = 1; i < (ID-1); i++) {
            for (int j = 0; j < (ID-1-i); j++) {
                //  String.compareTo(String)
                //   [-oo , + oo]
                if (ascendente)
                    cambio= (peliculas[j].getNombre().compareTo(peliculas[j+1].getNombre()) > 0 );
                else 
                    cambio= (peliculas[j].getNombre().compareTo(peliculas[j+1].getNombre()) < 0 );

                if(cambio ){
                    //clientes i va antes que clientes j <0 descendente
                    Pelicula aux = peliculas[j];
                    peliculas[j] = peliculas[j+1];
                    peliculas[j+1]= aux;
                }
            }
        }

    }
}
