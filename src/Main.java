import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Perfil perfil = new Perfil(
                "John Rojas",
                "Soy un curioso por naturaleza.",
                Arrays.asList("Caminar", "Leer", "Viajar"),
                Arrays.asList("Barbacoa", "Arroz", "Helados"),
                Arrays.asList("Soy Economista", "Tengo un máster en MK", "Toco la guitarra")

        );

        Scanner scanner = new Scanner(System.in);
        System.out.println("Menú AboutMe");
        System.out.println("[1] Mostrar historia");
        System.out.println("[2] Salir");

        int opcion = scanner.nextInt();
        if (opcion == 1) {
            System.out.println("Historia: " + perfil.getHistoria());
        } else {
            System.out.println("Saliendo...");
        }
    }
}