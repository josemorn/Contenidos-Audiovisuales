package CSV;

import java.util.Scanner;

public class View {
    private Scanner scanner = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("1. Listar Contenidos");
        System.out.println("2. Agregar Película");
        System.out.println("3. Agregar Serie de TV");
        System.out.println("4. Agregar Documental");
        System.out.println("5. Guardar y Salir");
        System.out.print("Seleccione una opción: ");
        return scanner.nextInt();
    }

    public String pedirTitulo() {
        System.out.print("Ingrese título: ");
        return scanner.next();
    }

    public int pedirAnio() {
        System.out.print("Ingrese año: ");
        return scanner.nextInt();
    }

    public String pedirDirector() {
        System.out.print("Ingrese director: ");
        return scanner.next();
    }

    public int pedirTemporadas() {
        System.out.print("Ingrese número de temporadas: ");
        return scanner.nextInt();
    }

    public String pedirTema() {
        System.out.print("Ingrese tema: ");
        return scanner.next();
    }
}
