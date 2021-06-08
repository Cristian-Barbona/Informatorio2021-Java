package COMPLEMENTARIOS2;

import java.util.*;

public class Level2EJ6 {
    public static void main(String[] args) {

        Empleado p1 = new Empleado("Fito Páez",30435967,100,250);
        Empleado p2 = new Empleado("Fabiana Cantilo",32342786,80,300);
        Empleado p3 = new Empleado("Carlos Gardel",28756345,150,250);
        Empleado p4 = new Empleado("Vilma Palma",25183624,120,200);
        Map<Integer, Integer> s = new HashMap<>();
        Set<String> lista = new HashSet<>();

        p1.agregarEmpleados();
        p2.agregarEmpleados();
        p3.agregarEmpleados();
        p4.agregarEmpleados();
        
        sueldo(sueldoEmpleados,p1);
        sueldo(sueldoEmpleados,p2);
        sueldo(sueldoEmpleados,p3);
        sueldo(sueldoEmpleados,p4);

        System.out.print(mostrarSueldo(sueldoEmpleados));


    }

    public static void agregarEmpleados(Set<String> lista, Empleado p) {
        lista.add(p.getNombre());
        lista.add(String.valueOf(p.getDni()));
        lista.add(String.valueOf(p.getHoras()));
        lista.add(String.valueOf(p.getValor()));
    }

    public static void sueldo(Map<Integer, Integer> sueldoPersonas, Empleado p) {

        sueldoPersonas.put(p.getDni(),p.calcularSueldo());

    }

    public static Map<Integer, Integer> mostrarSueldo(Map<Integer, Integer> sueldoPersonas) {

        return sueldoPersonas;

    }

public class Empleado {

    private String nombreyApellido;
    private int dni;
    private int horasTrabajadas;
    private int valorPorHora;

    public Empleado(String nombreyApellido, int dni, int horasTrabajadas, int valorPorHora) {
        this.nombreyApellido = nombreyApellido;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;

    }

    public String getNombre() {
        return this.nombreyApellido;
    }
    public int getDni() {
        return this.dni;
    }
    public int getHoras() {
        return this.horasTrabajadas;
    }
    public int getValor() {
        return this.valorPorHora;
    }

    public int calcularSueldo() {

        return this.horasTrabajadas * this.valorPorHora;
    }
}
}
