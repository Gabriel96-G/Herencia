public class EmpleadoRH extends Empleado {

    // Métodos
    // Constructor
    public EmpleadoRH(String nombre,
                      String apellidos,
                      String puesto) {

        super(nombre, apellidos, puesto);
    }

    public void contratarEmpleado(Empleado empleado) {

        System.out.println(
                "El empleado "
                        + empleado.getNombre()
                        + " "
                        + empleado.getApellidos()
                        + " fue contratado para el puesto de "
                        + empleado.getPuesto()
                        + "."
        );
    }
}