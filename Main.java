import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ColeccionCartas coleccion = new ColeccionCartas();

        while (true) {
            System.out.println("\n--- Menu del juego Hearthstone  ---");
            System.out.println("1. Agregar carta");
            System.out.println("2. Ver cartas");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");

            String opcion = scanner.nextLine();

            if (opcion.equals("1")) {
                String nombre;
                while (true) {
                    System.out.print("Nombre: ");
                    nombre = scanner.nextLine();
                    if (nombre.matches("[a-zA-Z\\s]+")) break;
                    System.out.println("Nombre invalido. Solo se permiten letras y espacios.");
                }

                String tipo;
                while (true) {
                    System.out.print("Tipo (Comun o Legendaria): ");
                    tipo = scanner.nextLine();
                    if (tipo.equalsIgnoreCase("comun") || tipo.equalsIgnoreCase("legendaria")) break;
                    System.out.println("Tipo invalido. Solo se permite 'Comun' o 'Legendaria'.");
                }

                int poder;
                while (true) {
                    System.out.print("Poder (ingrese el numero de poder): ");
                    try {
                        poder = Integer.parseInt(scanner.nextLine());
                        if (poder < 0) {
                            System.out.println("Error: El poder no puede ser negativo.");
                            continue;
                        }
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Entrada invalida. Ingresa un numero entero para el poder.");
                    }
                }

                String descripcion;
                while (true) {
                    System.out.print("Descripcion: ");
                    descripcion = scanner.nextLine();
                    if (descripcion.matches("[a-zA-Z\\s]+")) break;
                    System.out.println("Descripcion invalida. Solo se permiten letras y espacios.");
                }

                Carta nuevaCarta = new Carta(nombre, tipo, poder, descripcion);
                coleccion.agregarCarta(nuevaCarta);

            } else if (opcion.equals("2")) {
                coleccion.verCartas();

            } else if (opcion.equals("0")) {
                break;

            } else {
                System.out.println("Opcion invalida.");
            }
        }

        scanner.close();
    }
}
