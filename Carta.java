public class Carta {
    private String nombre;
    private String tipo;
    private int poder;
    private String descripcion;

    public Carta(String nombre, String tipo, int poder, String descripcion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.poder = poder;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getPoder() {
        return poder;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "- " + nombre + " [" + tipo + "] Poder: " + poder + " - " + descripcion;
    }
}
