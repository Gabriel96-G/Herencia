public class Empleado {

    // Atributos
    protected String nombre;
    protected String apellidos;
    protected String puesto;

    // Constantes
    protected static final short HORAS_TRABAJADAS_DIA = 8;
    protected static final double PAGO_HORA = 10.0;

    // Métodos
    // Constructor
    public Empleado(String nombre, String apellidos, String puesto) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.puesto = puesto;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getPuesto() {
        return puesto;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void trabajar() {
        System.out.println(
                nombre + " " + apellidos
                        + " está trabajando como "
                        + puesto + "."
        );
    }

    public double calcularSalario() {

        return HORAS_TRABAJADAS_DIA
                * PAGO_HORA
                * 5
                * 4;
    }
}