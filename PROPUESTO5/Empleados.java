package PROPUESTO5;

public class Empleados {

    private String nombre; 
    private String apellido; 
    private String fecha;
    private String sueldo; 

    public Empleados(String nombre, String apellido, String fecha, String sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha = fecha;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public String getFecha() {
        return this.fecha;
    }

    public String getSueldo() {
        return this.sueldo;
    }    
}