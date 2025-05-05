package practigagiteclipse;

public class Persona {
    private String nombre;
    private int edad;
    private Direccion direccion;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = new Direccion("Madrid", "España");
    }

    public void saludar() {
        System.out.println("Hola, me llamo " + nombre + ", tengo " + edad + 
                           " años y vivo en " + direccion.obtenerDireccionCompleta() + ".");
    }

    public void cumplirAnios() {
        edad++;
        System.out.println(nombre + " ha cumplido años. Ahora tiene " + edad + " años.");
    }
}