import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n--- Cifrado César ---");
            System.out.println("1. Cifrar texto");
            System.out.println("2. Descifrar texto con clave");
            System.out.println("3. Fuerza bruta");
            System.out.println("4. Análisis estadístico");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    processEncryption();
                    break;
                case 2:
                    processDecryption();
                    break;
                case 3:
                    bruteForceAttack();
                    break;
                case 4:
                    statisticalAnalysis();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }

    private static void processEncryption() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el texto a cifrar: ");
        String text = scanner.nextLine();
        System.out.print("Ingrese la clave de desplazamiento: ");
        int shift = scanner.nextInt();
        scanner.nextLine();

        Caeser cipher = new Caeser(shift);
        String encryptedText = cipher.encrypt(text);

        System.out.println("Texto cifrado: " + encryptedText);
    }

    private static void processDecryption() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el texto a descifrar: ");
        String text = scanner.nextLine();
        System.out.print("Ingrese la clave de desplazamiento: ");
        int shift = scanner.nextInt();
        scanner.nextLine();

        Caeser cipher = new Caeser(shift);
        String decryptedText = cipher.decrypt(text);

        System.out.println("Texto descifrado: " + decryptedText);
    }

    private static void bruteForceAttack() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el texto cifrado: ");
        String text = scanner.nextLine();

        for (int i = 1; i <= 25; i++) {
            Caeser cipher = new Caeser(i);
            System.out.println("Clave " + i + ": " + cipher.decrypt(text));
        }
    }

    private static void statisticalAnalysis() {
        System.out.println("Funcionalidad en desarrollo.");
    }

}
