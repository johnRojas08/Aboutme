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
        int opcion;

        do {
            // Mostrar el menú ampliado
            System.out.println("\nMenú AboutMe [" + perfil.getNombre() + "]");
            System.out.println("[1] Mostrar historia");
            System.out.println("[2] Mostrar hobbies");
            System.out.println("[3] Mostrar comidas favoritas");
            System.out.println("[4] Mostrar dato curioso");
            System.out.println("[5] Salir");
            System.out.print("Seleccione una opción: ");

            // Validar entrada del usuario
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, ingrese un número válido.");
                scanner.next(); // Limpiar entrada inválida
            }
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nHistoria:");
                    System.out.println(perfil.getHistoria());
                    break;
                case 2:
                    System.out.println("\nHobbies:");
                    perfil.getPasatiempos().forEach(hobby -> System.out.println("- " + hobby));
                    break;
                case 3:
                    System.out.println("\nComidas favoritas:");
                    perfil.getComidasFavoritas().forEach(food -> System.out.println("- " + food));
                    break;
                case 4:
                    System.out.println("\nDato curioso:");
                    System.out.println(perfil.getDatoCuriosoAleatorio());
                    break;
                case 5:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}

