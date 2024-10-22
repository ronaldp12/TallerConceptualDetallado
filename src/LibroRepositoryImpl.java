import java.util.ArrayList;
import java.util.List;
public class LibroRepositoryImpl implements LibroRepository {
    private List<Libro> libros = new ArrayList<>();

    @Override
    public void agregar(Libro libro) {
        libros.add(libro);
    }

    @Override
    public void eliminar(int id) {
        libros.removeIf(libro -> libro.getId() == id);
    }

    @Override
    public Libro buscarPorId(int id) {
        return libros.stream()
                .filter(libro -> libro.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Libro> buscarTodos() {
        return new ArrayList<>(libros);
    }
}
