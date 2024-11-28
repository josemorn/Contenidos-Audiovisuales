package Sistema;
import CSV.Controller;
import CSV.View;
import Clases.ContenidoAudiovisual;

	public class Sistema {
	    public static void main(String[] args) {
	        Controller controller = new Controller();
	        View view = new View();

	        int opcion;
	        do {
	            opcion = view.mostrarMenu();
	            switch (opcion) {
	                case 1:
	                    for (ContenidoAudiovisual c : controller.listarContenidos()) {
	                        System.out.println(c);
	                    }
	                    break;
	                case 2:
	                    String tituloP = view.pedirTitulo();
	                    int anioP = view.pedirAnio();
	                    String director = view.pedirDirector();
	                    controller.agregarPelicula(tituloP, anioP, director);
	                    break;
	                case 3:
	                    String tituloS = view.pedirTitulo();
	                    int anioS = view.pedirAnio();
	                    int temporadas = view.pedirTemporadas();
	                    controller.agregarSerieDeTV(tituloS, anioS, temporadas);
	                    break;
	                case 4:
	                    String tituloD = view.pedirTitulo();
	                    int anioD = view.pedirAnio();
	                    String tema = view.pedirTema();
	                    controller.agregarDocumental(tituloD, anioD, tema);
	                    break;
	                case 5:
	                    controller.guardarContenido("contenido.csv");
	                    System.out.println("Datos guardados.");
	                    break;
	                default:
	                    System.out.println("Opción no válida.");
	                    break;
	            }
	        } while (opcion != 5);
	    }
	}


