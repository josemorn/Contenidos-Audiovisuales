package Clases;

public class Pelicula extends ContenidoAudiovisual {
    private String director;

    public Pelicula(String titulo, int anio, String director) {
        super(titulo, anio);
        this.director = director;
    }

    public String getDirector() { return director; }
    public void setDirector(String director) { this.director = director; }

    @Override
    public String toString() {
        return super.toString() + " - Dirigida por " + director;
    }
}
