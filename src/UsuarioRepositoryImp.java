import java.util.ArrayList;
import java.util.List;

public class UsuarioRepositoryImp implements UsuarioRepository {
    private List<Usuario> usuarios = new ArrayList<>();

    @Override
    public void agregar(Usuario usuario) {
        usuarios.add(usuario);
    }

    @Override
    public void eliminar(int id) {
        usuarios.removeIf(usuario -> usuario.getId() == id);
    }

    @Override
    public Usuario buscarPorId(int id) {
        return usuarios.stream()
                .filter(usuario -> usuario.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Usuario> buscarTodos() {
        return new ArrayList<>(usuarios);
    }
    public static void main(String[] args) {
        UsuarioRepository usuarioRepository = new UsuarioRepositoryImp();


        usuarioRepository.agregar(new Usuario(1, "Camila"));
        usuarioRepository.agregar(new Usuario(2, "Julian"));


        Usuario usuario = usuarioRepository.buscarPorId(1);
        System.out.println("Usuario encontrado: " + (usuario != null ? usuario.getNombre() : "No encontrado"));


        usuarioRepository.eliminar(1);
        System.out.println("Usuario eliminado");


        List<Usuario> usuarios = usuarioRepository.buscarTodos();
        System.out.println("Usuarios restantes: " + usuarios.size());

    }
}
