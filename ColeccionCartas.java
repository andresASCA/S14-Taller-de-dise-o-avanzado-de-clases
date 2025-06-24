import java.util.ArrayList;
import java.util.HashMap;

public class ColeccionCartas {
    private HashMap<String, ArrayList<Carta>> coleccion;

    public ColeccionCartas() {
        coleccion = new HashMap<>();
    }

    public void agregarCarta(Carta carta) {
        String nombre = carta.getNombre();
        String tipo = carta.getTipo();

        if (!coleccion.containsKey(nombre)) {
            ArrayList<Carta> nuevaLista = new ArrayList<>();
            nuevaLista.add(carta);
            coleccion.put(nombre, nuevaLista);
            System.out.println("Carta agregada correctamente: " + nombre + " (copias actuales: 1)");
        } else {
            ArrayList<Carta> cartasExistentes = coleccion.get(nombre);
            long cantidad = cartasExistentes.size();

            if (tipo.equalsIgnoreCase("Legendaria")) {
                boolean yaExisteLegendaria = cartasExistentes.stream().anyMatch(c -> c.getTipo().equalsIgnoreCase("Legendaria"));
                if (yaExisteLegendaria) {
                    System.out.println("No se puede agregar otra carta legendaria con el mismo nombre.");
                    return;
                }
            } else if (tipo.equalsIgnoreCase("Comun")) {
                long comunes = cartasExistentes.stream().filter(c -> c.getTipo().equalsIgnoreCase("Comun")).count();
                if (comunes >= 2) {
                    System.out.println("No se pueden agregar mas de 2 cartas comunes con el mismo nombre.");
                    return;
                }
            }

            cartasExistentes.add(carta);
            System.out.println("Se agrego otra copia de la carta: " + nombre + "  (copias actuales: " + (cantidad + 1) + ")");
        }
    }

    public void verCartas() {
        System.out.println("Listado de cartas en la coleccion:");
        for (String nombre : coleccion.keySet()) {
            ArrayList<Carta> cartas = coleccion.get(nombre);
            System.out.println("Nombre: " + nombre + " | Copias: " + cartas.size());
            for (Carta c : cartas) {
                System.out.println(c);
            }
        }
    }
}
