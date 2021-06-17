package src.Peliculas;

public class Pelicula {
    /**
     * Atributos de pelicula
     */
    private String nombre;
    private String categoria;
    private int anio;
    private boolean disponible;
    private int ID;

    /**
     * Constructores
     */

     public Pelicula(){

     }

     public Pelicula(String nombre, String categoria, int anio, int ID){
         this.nombre = nombre;
         this.categoria = categoria;
         this.anio = anio;
         this.ID = ID;
         this.disponible = true;
     }

     /**
      * getters y setters
      */

      public String getNombre(){
          return nombre;
      }

      public String getCategoria(){
          return categoria;
      }

      public int getAnio(){
        return anio;
      }

      public boolean isDisponible(){
          return disponible;
      }
    
      public int getID(){
          return ID;
      }

      public void setNombre(String nombre){
          this.nombre=nombre;
      }

      public void setCategoria(String categoria){
          this.categoria = categoria;
      }

      public void setAnio(int anio){
          this.anio = anio;
      }

      public void setDisponible(boolean disponible){
          this.disponible = disponible;
      }

      public void setID(int ID){
          this.ID = ID;
      }

      public String getDatos(String formato){
        String isDisponible;
        if(disponible){
            isDisponible = "Disponible";
        } else{
            isDisponible = "Prestada";
        }
        String datos = "Nombre: " +nombre +formato +"Categoria: " +categoria +formato +"Año: " +anio +formato+"ID: " + ID +formato +"Estado: " +isDisponible+"\n\n";
        return datos;
      }
}