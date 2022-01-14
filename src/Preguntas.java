import java.util.ArrayList;

public class Preguntas {

    private String mensaje;
    private ArrayList<Respuestas> listaRespuestas;

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public ArrayList<Respuestas> getListaRespuestas() {
        return listaRespuestas;
    }

    public void setListaRespuestas(ArrayList<Respuestas> listaRespuestas) {
        this.listaRespuestas = listaRespuestas;
    }
}
