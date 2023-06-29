public class Cuadrado extends Figura {
    double lado;

    @Override
    public double calcularPerimetro() {
        lado = calcularDistancia(0, 1);
        return 4 * lado;
    }

    @Override
    public double calcularArea() {
        lado = calcularDistancia(0, 1);
        return Math.pow(lado, 2);
    }

    @Override
    public double calcularVolumen() {
        System.out.println("El volumen no es aplicable a esta figura.");
        return 0;
    }
}
