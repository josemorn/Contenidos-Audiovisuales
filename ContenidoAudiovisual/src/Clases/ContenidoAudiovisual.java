package Clases;

public abstract class ContenidoAudiovisual {
    private String titulo;
    private int anio;

    public ContenidoAudiovisual(String titulo, int anio) {
        this.titulo = titulo;
        this.anio = anio;
    }

    // Getters y Setters
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public int getAnio() { return anio; }
    public void setAnio(int anio) { this.anio = anio; }

    @Override
    public String toString() {
        return titulo + " (" + anio + ")";
    }
}
