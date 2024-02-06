package TAREA_CLASE;


public class Main {
    public static void main(String[] args) {
        TiendaMascotas tiendaMascotas = new TiendaMascotas();

        tiendaMascotas.agregarMascotas("Buddy", 3, "Perro");
        tiendaMascotas.agregarMascotas("Garfil", 2, "Gato");
        tiendaMascotas.agregarMascotas("Max", 1, "loro");

        tiendaMascotas.venderMascota("Buddy");

        tiendaMascotas.mostrarTienda();




    }
}
