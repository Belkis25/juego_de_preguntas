import java.util.ArrayList;

public class Juego {

    private ArrayList<Rondas> listaRondas;
    private int premio;

    public ArrayList<Rondas> getListaRondas() {
        return listaRondas;
    }

    public void setListaRondas(ArrayList<Rondas> listaRondas) {
        this.listaRondas = listaRondas;
    }

    public int getPremio() {
        return premio;
    }

    public void setPremio(int premio) {
        this.premio = premio;
    }
}
