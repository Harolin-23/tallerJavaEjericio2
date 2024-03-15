class Empleado extends persona {
    double salario;

    public Empleado(String nombre, int edad, int id, double salario) {
        super(nombre, edad, id);
        this.salario = salario;
    }
}