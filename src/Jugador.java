public class Jugador {
    // Declaración de atributos
    private String nombre;
    private int edad;
    // Constructores

    public Jugador(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Métodos propios.
    public void mostrarInfo(){
        System.out.println("Nombre: " +nombre);
    }
}
