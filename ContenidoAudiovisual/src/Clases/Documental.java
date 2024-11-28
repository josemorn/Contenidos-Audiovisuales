package Clases;

public class Documental extends ContenidoAudiovisual {
    private String tema;

    public Documental(String titulo, int anio, String tema) {
        super(titulo, anio);
        this.tema = tema;
    }

    public String getTema() {
        return tema;
    }

    @Override
    public String toString() {
        return "Documentales: Captura título: " + getTitulo() + ", año: " + getAnio() + ", tema: " + tema;
    }
}
