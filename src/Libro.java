public class Libro {
    private int id;
    private String nombre;
    private String autor;
    private int añopubli;

    public Libro(int id, String nombre, String autor, int añopubli) {
        this.id = id;
        this.nombre = nombre;
        this.autor = autor;
        this.añopubli = añopubli;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAñopubli() {
        return añopubli;
    }

    public void setAñopubli(int añopubli) {
        this.añopubli = añopubli;
    }
}
