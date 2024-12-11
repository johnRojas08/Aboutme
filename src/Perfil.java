import java.util.List;

public class Perfil {
    private String nombre;
    private String historia;

    public Perfil(String nombre, String historia) {
        this.nombre = nombre;
        this.historia = historia;
}
    public String getNombre() {
        return nombre;
    }

    public String getHistoria() {
        return historia;
    }
}

