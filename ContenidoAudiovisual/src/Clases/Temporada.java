package Clases;

import java.util.ArrayList;
import java.util.List;

public class Temporada {
    private int numero;
    private List<String> episodios;

    public Temporada(int numero) {
        this.numero = numero;
        this.episodios = new ArrayList<>();
    }

    public void agregarEpisodio(String titulo) {
        episodios.add(titulo);
    }

    @Override
    public String toString() {
        return "Temporada " + numero + ": " + episodios;
    }
}
