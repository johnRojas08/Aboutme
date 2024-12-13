import java.util.List;
import java.util.Random;

/**
 * Clase Perfil representa un perfil de usuario con varias categorías de información.
 */
public class Perfil {
    private String nombre;
    private String historia;
    private List<String> pasatiempos;
    private List<String> comidasFavoritas;
    private List<String> datosCuriosos;

    /**
     * Constructor que inicializa los atributos del perfil.
     *
     * @param nombre            Nombre del perfil.
     * @param historia          Historia personal del perfil.
     * @param pasatiempos       Lista de hobbies o pasatiempos del perfil.
     * @param comidasFavoritas  Lista de comidas favoritas.
     * @param datosCuriosos     Lista de datos curiosos.
     */
    public Perfil(String nombre, String historia, List<String> pasatiempos, List<String> comidasFavoritas, List<String> datosCuriosos) {
        this.nombre = nombre;
        this.historia = historia;
        this.pasatiempos = pasatiempos;
        this.comidasFavoritas = comidasFavoritas;
        this.datosCuriosos = datosCuriosos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getHistoria() {
        return historia;
    }

    public List<String> getPasatiempos() {
        return pasatiempos;
    }

    public List<String> getComidasFavoritas() {
        return comidasFavoritas;
    }

    /**
     * Devuelve un dato curioso aleatorio.
     *
     * @return Cadena con un dato curioso seleccionado al azar.
     */
    public String getDatoCuriosoAleatorio() {
        Random random = new Random();
        return datosCuriosos.get(random.nextInt(datosCuriosos.size()));
    }
}
