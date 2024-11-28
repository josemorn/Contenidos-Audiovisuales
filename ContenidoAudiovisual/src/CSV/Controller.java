package CSV;

import java.util.ArrayList;
import java.util.List;

import Clases.ContenidoAudiovisual;
import Clases.Documental;
import Clases.Pelicula;
import Clases.SerieDeTV;

public class Controller {
    private List<ContenidoAudiovisual> contenidos;

    public Controller() {
        this.contenidos = new ArrayList<>();
    }

    public void agregarPelicula(String titulo, int anio, String director) {
        contenidos.add(new Pelicula(titulo, anio, director));
    }

    public void agregarSerieDeTV(String titulo, int anio, int temporadas) {
        contenidos.add(new SerieDeTV(titulo, anio, temporadas));
    }

    public void agregarDocumental(String titulo, int anio, String tema) {
        contenidos.add(new Documental(titulo, anio, tema));
    }

    public List<ContenidoAudiovisual> listarContenidos() {
        return contenidos;
    }

    public void guardarContenido(String rutaArchivo) {
        // Método ya implementado previamente para guardar en archivo CSV
    }

    public void leerContenido(String rutaArchivo) {
        // Método implementado arriba para leer desde archivo CSV
    }
}
