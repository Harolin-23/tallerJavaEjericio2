import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Scanner OBjscanner = new Scanner(System.in);
        GestionEmpleados gestionEmpleados = new GestionEmpleados();
        Random random= new Random();
        int opcion;
        do {
            System.out.println("1. Agregar empleado");
            System.out.println("2. Eliminar empleado");
            System.out.println("3. Mostrar empleados");
            System.out.println("4. Salir");
            opcion = OBjscanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("""
                            --Menu de Empelados--- 
                            """);
                            System.out.print("Ingrese el nombre: ");
                            String nombre = OBjscanner.next();
                            System.out.print("Ingrese la edad: ");
                                int edad = OBjscanner.nextInt();
                                int id = random.nextInt();
                        System.out.print("Ingrese Salario: ");
                        double salario = OBjscanner.nextDouble();
                                Empleado nuevoEmpleado = new Empleado(nombre, edad, id, salario);
                                         gestionEmpleados.agregarEmpleado(nuevoEmpleado);
                    break;
                case 2:
                    gestionEmpleados.mostrarEmpleados();
                    System.out.print("ID del empleado a eliminar: ");
                     int idEliminar = OBjscanner.nextInt();
                     gestionEmpleados.eliminarEmpleado(idEliminar);
                    break;
                case 3:
                    gestionEmpleados.mostrarEmpleados();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);
        OBjscanner.close();
    }
}