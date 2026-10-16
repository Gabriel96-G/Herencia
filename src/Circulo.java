public class Circulo extends Figura {

    // Atributos
    private double radio;

    // Constante
    private static final double PI = 3.1416;

    // Métodos
    // Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Getter
    public double getRadio() {
        return radio;
    }

    // Setter
    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return PI * radio * radio;
    }

    public double calcularPerimetro() {
        return 2 * PI * radio;
    }
}