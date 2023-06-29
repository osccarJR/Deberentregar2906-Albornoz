public class Circulo extends Figura {
    double radio;

    @Override
    public double calcularPerimetro() {
        radio = calcularDistancia(0, 1);
        return 2 * Math.PI * radio;
    }

    @Override
    public double calcularArea() {
        radio = calcularDistancia(0, 1);
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularVolumen() {
        System.out.println("El volumen no es aplicable a esta figura.");
        return 0;
    }
}
