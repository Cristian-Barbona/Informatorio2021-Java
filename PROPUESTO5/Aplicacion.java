package PROPUESTO5;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Aplicacion {
    
    public static void main(String[] args) throws IOException {

        System.out.println(); 
        EmpleadosUtil.verLista(createObjects());
        System.out.println();
        System.out.println("============================================================");

        System.out.println();
        System.out.print("Ingrese letra inicial de los apellidos a mostrar: ");
        Scanner scan = new Scanner(System.in);
        String letra = scan.nextLine();
        EmpleadosUtil.verApellido(createObjects(), letra);
        scan.close();
        System.out.println();
        System.out.println("============================================================");

        System.out.println();
        EmpleadosUtil.Sueldo(createObjects());
        System.out.println();
        System.out.println("============================================================");

        System.out.println();
        EmpleadosUtil.empleadoEdad(createObjects());
        System.out.println();
        System.out.println("============================================================");

        
    }

    public static List<Empleados> createObjects() throws IOException {
        List<Empleados> lista = new ArrayList<>();
        try(BufferedReader archivo = new BufferedReader(new FileReader("/home/cristian-laptop/Proyectos/JAVA/Proyectos/Informatorio2021/Informatorio2021-Java/PROPUESTO5/Empleados.txt"))) {
        String empleado = archivo.readLine();
        while(empleado != null) {
            var separador = empleado.split(",");
            Empleados persona = new Empleados(separador[0], separador[1], separador[2], separador[3]);
            lista.add(persona);
            empleado = archivo.readLine();
        }
        return lista;
        }
    }
}