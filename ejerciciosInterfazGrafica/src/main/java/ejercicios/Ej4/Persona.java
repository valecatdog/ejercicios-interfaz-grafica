package ejercicios.Ej4;

public class Persona {
    String nombre;
    int ci;
    String nacionalidad;
    
    public Persona(String nombre, int ci, String nacionalidad){
        this.nombre = nombre;
        this.ci = ci;
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", ci=" + ci + ", nacionalidad=" + nacionalidad + '}';
    }
    
   
    
    
}
