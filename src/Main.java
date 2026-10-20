public class Main{
    static void main(){
        System.out.println("=== PRUEBA ACTUADOR ===");

        actuador act1 = new actuador();
        act1.codigo = "ACT-001";
        act1.tipo = "Válvula Lineal";
        act1.posicion = 0.0;
        act1.activo = false;

        actuador act2 = new actuador();
        act2.codigo = "ACT-002";
        act2.tipo = "Servo Motor";
        act2.posicion = 0.0;
        act2.activo = false;

        actuador act3 = new actuador();
        act3.codigo = "ACT-003";
        act3.tipo = "Pistón Neumático";
        act3.posicion = 0.0;
        act3.activo = false;

        act1.activar();
        act1.cambiarPosicion(45.5);
        act1.mostrarInformacion();

        System.out.println("\nVerificando los otros actuadores (sin modificar):");
        act2.mostrarInformacion();
        act3.mostrarInformacion();
    }
}
