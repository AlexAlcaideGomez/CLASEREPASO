package TAREA_CLASE;

public class TiendaMascotas {
    Mascota[] animales;
    int cantidadDeMascotas;

    public TiendaMascotas() {
        this.animales = new Mascota[100];
        this.cantidadDeMascotas = 0;
    }

    public void agregarMascotas(String nombre, int edad, String tipoAnimal) {
        Mascota nuevaMascota = new Mascota(nombre, edad, tipoAnimal);
        animales[cantidadDeMascotas] = nuevaMascota;
        cantidadDeMascotas++;
        System.out.println("La mascota " + nombre + " se ha añadido correctamente");
    }

    public void venderMascota(String nombre) {
        for (int i = 0; i < cantidadDeMascotas; i++) {
            if (animales[i].getNombre().equals(nombre)) {
                System.out.println("La mascota " + nombre + " se ha vendido");
                animales[i]=null;
                for (int j = 0; j < cantidadDeMascotas; j++) {
                    animales[j]=animales[j+1];

                }
                cantidadDeMascotas--;
            }
        }
    }

    public void mostrarTienda(){
        for(int i = 0; i < cantidadDeMascotas; i++){
            System.out.println("Mascota " + i + ": " + animales[i].getNombre() + ", " + animales[i].getEdad() + ", " + animales[i].getTipoAnimal());
        }
    }



}
