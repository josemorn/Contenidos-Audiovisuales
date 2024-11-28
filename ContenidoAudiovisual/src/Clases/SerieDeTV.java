package Clases;

public class SerieDeTV extends ContenidoAudiovisual {
    private int temporadas;

    public SerieDeTV(String titulo, int anio, int temporadas) {
        super(titulo, anio);
        this.temporadas = temporadas;
    }

    public int getTemporadas() { return temporadas; }
    public void setTemporadas(int temporadas) { this.temporadas = temporadas; }

    @Override
    public String toString() {
        return super.toString() + " - " + temporadas + " temporadas";
    }
}
