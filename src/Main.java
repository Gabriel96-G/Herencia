public class Main {

    public static void main(String[] args) {

        // ============================================
        // EJERCICIO 1
        // ============================================

        System.out.println("===== EJERCICIO 1 =====");

        Animal animal = new Animal();

        Gato gato = new Gato();

        System.out.println("Sonido del animal:");
        animal.hacerSonido();

        System.out.println();

        System.out.println("Sonido del gato:");
        gato.hacerSonido();


        // ============================================
        // EJERCICIO 2
        // ============================================

        System.out.println();
        System.out.println("===== EJERCICIO 2 =====");

        Figura figura = new Figura();

        Rectangulo rectangulo =
                new Rectangulo(5, 3);

        Circulo circulo =
                new Circulo(4);

        System.out.println(
                "Área simbólica de Figura: "
                        + figura.calcularArea()
        );

        System.out.println(
                "Perímetro simbólico de Figura: "
                        + figura.calcularPerimetro()
        );

        System.out.println();

        System.out.println(
                "Área del rectángulo: "
                        + rectangulo.calcularArea()
        );

        System.out.println(
                "Perímetro del rectángulo: "
                        + rectangulo.calcularPerimetro()
        );

        System.out.println();

        System.out.println(
                "Área del círculo: "
                        + circulo.calcularArea()
        );

        System.out.println(
                "Perímetro del círculo: "
                        + circulo.calcularPerimetro()
        );


        // ============================================
        // EJERCICIO 3
        // ============================================

        System.out.println();
        System.out.println("===== EJERCICIO 3 =====");

        Empleado empleado =
                new Empleado(
                        "Carlos",
                        "Ramírez",
                        "Desarrollador"
                );

        EmpleadoRH empleadoRH =
                new EmpleadoRH(
                        "Ana",
                        "Rodríguez",
                        "Recursos Humanos"
                );

        empleado.trabajar();

        System.out.println(
                "Salario mensual de "
                        + empleado.getNombre()
                        + ": $"
                        + empleado.calcularSalario()
        );

        System.out.println();

        empleadoRH.trabajar();

        System.out.println(
                "Salario mensual de "
                        + empleadoRH.getNombre()
                        + ": $"
                        + empleadoRH.calcularSalario()
        );

        System.out.println();

        empleadoRH.contratarEmpleado(empleado);
    }
}