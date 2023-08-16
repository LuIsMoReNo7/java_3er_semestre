import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Autor {
    private String dni;
    private String nombre;

    public Autor(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }
}

class Productor {
    private String dni;
    private String nombre;

    public Productor(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }
}

class DerechoAutor {
    private String fechaRegistro;
    private String numeroPartida;
    private List<Autor> listaAutores;
    private List<Productor> listaProductores;

    public DerechoAutor(String fechaRegistro, String numeroPartida) {
        this.fechaRegistro = fechaRegistro;
        this.numeroPartida = numeroPartida;
        this.listaAutores = new ArrayList<>();
        this.listaProductores = new ArrayList<>();
    }

    public void agregarAutor(Autor autor) {
        listaAutores.add(autor);
    }

    public void agregarProductor(Productor productor) {
        listaProductores.add(productor);
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public String getNumeroPartida() {
        return numeroPartida;
    }

    public List<Autor> getListaAutores() {
        return listaAutores;
    }

    public List<Productor> getListaProductores() {
        return listaProductores;
    }
}

public class prueba2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Registro de Derecho de Autor");
        System.out.print("Fecha de Registro: ");
        String fechaRegistro = scanner.nextLine();

        System.out.print("Número de Partida: ");
        String numeroPartida = scanner.nextLine();

        DerechoAutor derechoAutor = new DerechoAutor(fechaRegistro, numeroPartida);

        for (int i = 1; i <= 4; i++) {
            System.out.println("Autor " + i);
            System.out.print("DNI: ");
            String dniAutor = scanner.nextLine();
            System.out.print("Nombre: ");
            String nombreAutor = scanner.nextLine();
            derechoAutor.agregarAutor(new Autor(dniAutor, nombreAutor));
        }

        for (int i = 1; i <= 3; i++) {
            System.out.println("Productor " + i);
            System.out.print("DNI: ");
            String dniProductor = scanner.nextLine();
            System.out.print("Nombre: ");
            String nombreProductor = scanner.nextLine();
            derechoAutor.agregarProductor(new Productor(dniProductor, nombreProductor));
        }

        scanner.close();

        System.out.println("\nInformación del Registro de Derecho de Autor");
        System.out.println("Fecha de Registro: " + derechoAutor.getFechaRegistro());
        System.out.println("Número de Partida: " + derechoAutor.getNumeroPartida());
        System.out.println("Autores:");

        for (Autor autor : derechoAutor.getListaAutores()) {
            System.out.println("- " + autor.getNombre() + " (DNI: " + autor.getDni() + ")");
        }

        System.out.println("Productores:");

        for (Productor productor : derechoAutor.getListaProductores()) {
            System.out.println("- " + productor.getNombre() + " (DNI: " + productor.getDni() + ")");
        }
    }
}
