package PROPUESTO5;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class EmpleadosUtil {


    public static void verLista(List<Empleados> lista) {
        for(int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i).getNombre() + " ");
            System.out.print(lista.get(i).getApellido() + " ");
            System.out.print(lista.get(i).getFecha() + " ");
            System.out.println(lista.get(i).getSueldo() + " ");
        }
    }

    public static void verApellido(List<Empleados> lista, String a) {

        String mayuscula = a.toUpperCase();
        char caracter = mayuscula.charAt(0);
        System.out.println("Empleados con apellidos que comienzan con la letra: " + a);
        for(int i = 0; i < lista.size(); i++) {
            String apellido = lista.get(i).getApellido();
            if (apellido.charAt(0) == caracter) {
                System.out.print(lista.get(i).getNombre() + " ");
                System.out.print(lista.get(i).getApellido() + " ");
                System.out.print(lista.get(i).getFecha() + " ");
                System.out.println(lista.get(i).getSueldo() + " ");
            }
        }
    }

    public static void empleadoEdad(List<Empleados> lista) {

        LocalDate hoy = LocalDate.now();
        List<Integer> edades = new ArrayList<>();
        for(Empleados empleado : lista) {

            LocalDate nacimiento = convertStringALocalDate(empleado);
            Period edad = Period.between(hoy, nacimiento);
            int años = edad.getYears();
            edades.add(años);
        }
        Collections.sort(edades);
        int menor = edades.get(0);
        int mayor = edades.get(edades.size() - 1);

        System.out.println("El empleado de mayor edad tiene: " + -(menor) + " años");
        System.out.println("El empleado de menor edad tiene: " + -(mayor) + " años");
    }

    public static void Sueldo(List<Empleados> lista) {
        
        List<Integer> salarios = new ArrayList<>();
        for(Empleados empleado : lista) {
            int s = convertSalaryToInteger(empleado);
            salarios.add(s);
        }
        Collections.sort(salarios);
        int menor = salarios.get(0);
        int mayor = salarios.get(salarios.size() - 1);
        for(Empleados empleado : lista) {
            if(convertSalaryToInteger(empleado) == menor) {
                System.out.println("El empleado de menor ingreso es: " + empleado.getNombre() + " " + empleado.getApellido() + " $" + menor);
            }
            else if(convertSalaryToInteger(empleado) == mayor) {
                System.out.println("El empleado de mayor ingreso es: " + empleado.getNombre() + " " + empleado.getApellido() + " $" + mayor);
            }
        }
    }

    public static LocalDate convertStringALocalDate(Empleados p){

        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate fechaEmpleado = LocalDate.parse(p.getFecha(), formatoFecha);
        return fechaEmpleado;
    }

    public static int convertSalaryToInteger(Empleados p) {
        int sueldoConvertido = Integer.valueOf(p.getSueldo());
        return sueldoConvertido;
    }
}