public class actuador {
    public String codigo;
    public String tipo;
    double posicion;
    boolean activo;

    public void activar() {
        activo = true;
        System.out.println("Actuador " + codigo + " (" + tipo + ") activado.");
    }

    public void cambiarPosicion(double nuevaPosicion) {
        posicion = nuevaPosicion;
        System.out.println("Posición de " + codigo + " cambiada a: " + posicion + "°");
    }

    void desactivar() {
        activo = false;
        System.out.println("Actuador " + codigo + " desactivado.");
    }

    void mostrarInformacion() {
        System.out.println("Actuador ID: " + codigo + "  Tipo: " + tipo + "  Posición: " + posicion + "°  Activo: " + activo);
    }
}
