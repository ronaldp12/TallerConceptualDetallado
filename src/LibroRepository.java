import java.util.List;
public interface LibroRepository {
    void agregar(Libro libro);
    void eliminar(int id);
    Libro buscarPorId(int id);
    List<Libro> buscarTodos();
}
