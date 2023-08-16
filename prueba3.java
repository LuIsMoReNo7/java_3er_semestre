import java.util.ArrayList;
import java.util.List;

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

public class prueba3 {
    public static void main(String[] args) {
        Autor autor1 = new Autor("123456789", "Juan Pérez");
        Productor productor1 = new Productor("567890123", "Pedro Gómez");
        Productor productor2 = new Productor("444444444", "Laura Sánchez");

        Autor autor2 = new Autor("987654321", "María Rodríguez");
        Autor autor3 = new Autor("555555555", "Carlos Martínez");
        Productor productor3 = new Productor("666666666", "Ricardo Mendoza");

        Autor autor4 = new Autor("111111111", "Ana López");
        Autor autor5 = new Autor("222222222", "Luis Ramírez");
        Autor autor6 = new Autor("333333333", "Elena Vargas");
        Productor productor4 = new Productor("777777777", "Isabel Torres");
        Productor productor5 = new Productor("888888888", "Manuel Jiménez");

        DerechoAutor derechoAutor1 = new DerechoAutor("2023-08-16", "ABC123");
        derechoAutor1.agregarAutor(autor1);
        derechoAutor1.agregarProductor(productor1);
        derechoAutor1.agregarProductor(productor2);

        DerechoAutor derechoAutor2 = new DerechoAutor("2023-08-17", "XYZ456");
        derechoAutor2.agregarAutor(autor2);
        derechoAutor2.agregarAutor(autor3);
        derechoAutor2.agregarProductor(productor3);

        DerechoAutor derechoAutor3 = new DerechoAutor("2023-08-18", "DEF789");
        derechoAutor3.agregarAutor(autor4);
        derechoAutor3.agregarAutor(autor5);
        derechoAutor3.agregarAutor(autor6);
        derechoAutor3.agregarProductor(productor4);
        derechoAutor3.agregarProductor(productor5);

        imprimirRegistro(derechoAutor1, 1);
        imprimirRegistro(derechoAutor2, 2);
        imprimirRegistro(derechoAutor3, 3);
    }

    public static void imprimirRegistro(DerechoAutor derechoAutor, int num) {
        System.out.println("Registro de Derecho de Autor " + num);
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

        System.out.println();
    }
}
