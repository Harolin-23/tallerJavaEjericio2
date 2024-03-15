import java.util.ArrayList;
public class GestionEmpleados {

    ArrayList<Empleado> listaEmpleados = new ArrayList<>();
    public void agregarEmpleado(Empleado empleado) {
        try {
            listaEmpleados.add(empleado);
            System.out.println("Se ha añadido el empleado");
        }catch (Exception e){
            System.out.println("Ha ocurrido un error por favor ingrese de nuevo los datos..");
        }
    }
    public void eliminarEmpleado(int id) {
        try {
            listaEmpleados.removeIf(empleado -> empleado.id == id);
            System.out.println("Se ha borrado a" + id);
        }catch (Exception e){
            System.out.println("Ha ocurrido un error Al emininar los datos");
        }
    }
    public void mostrarEmpleados() {
        if (listaEmpleados.isEmpty()){
            System.out.println("No hay empleados aun...");
        }else {
            for (Empleado empleado : listaEmpleados) {
                System.out.println("---Lista de empleados----");
                System.out.println(empleado.nombre + ", " + empleado.edad + ", ID: " + empleado.id + ", Salario: " + empleado.salario);
                System.out.println("---------------");
            }
        }
    }
}
