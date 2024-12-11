import java.util.List;

public class Perfil {
    private String nombre;
    private String historia;
    private List<String> pasatiempos;
    private List<String> comidasFavoritas;
    private List<String> datosCuriosos;

    public Perfil(String nombre, String historia, List<String> pasatiempos, List<String> comidasFavoritas, List<String> datosCuriosos) {
        this.nombre = nombre;
        this.historia = historia;
        this.pasatiempos = pasatiempos;
        this.comidasFavoritas = comidasFavoritas;
        this.datosCuriosos = datosCuriosos;
    }

    public String getFavoritos() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pasatiempos:\n");
        pasatiempos.forEach(p -> sb.append("- ").append(p).append("\n"));

        sb.append("\nComidas Favoritas:\n");
        comidasFavoritas.forEach(c -> sb.append("- ").append(c).append("\n"));

        return sb.toString();
    }

    public String getDatoCurioso() {
        Random random = new Random();
        return datosCuriosos.get(random.nextInt(datosCuriosos.size()));
    }
}

