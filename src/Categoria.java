import java.util.ArrayList;

public class Categoria {

    private int dificultad;
     private ArrayList<Preguntas> listaPreguntas;
     private String nombreCategoria;
     public int getDificultad() {
          return dificultad;
     }

     public void setDificultad(int dificultad) {
          this.dificultad = dificultad;
     }

     public ArrayList<Preguntas> getListaPreguntas() {
          return listaPreguntas;
     }

     public void setListaPreguntas(ArrayList<Preguntas> listaPreguntas) {
          this.listaPreguntas = listaPreguntas;
     }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }
}
