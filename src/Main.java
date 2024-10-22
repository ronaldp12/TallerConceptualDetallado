import java.util.List;

public class Main {
    public static void main(String[] args) {
            LibroRepository libroRepository = new LibroRepositoryImpl();


            libroRepository.agregar(new Libro(1,"La Granja","George Orwell",1984));
            libroRepository.agregar(new Libro(2,"El sobrino del mago", "C.S Lewis",1955));


            Libro libro = libroRepository.buscarPorId(1);
            System.out.println("Libro encontrado: " + (libro != null ? libro.getNombre() : "No encontrado"));


            libroRepository.eliminar(1);
            System.out.println("Libro eliminado");


            List<Libro> libros = libroRepository.buscarTodos();
            System.out.println("Libros restantes: " + libros.size());


    }
}