import java.util.List;

public interface UsuarioRepository {
    void agregar(Usuario usuario);
    void eliminar(int id);
    Usuario buscarPorId(int id);
    List<Usuario> buscarTodos();
}
