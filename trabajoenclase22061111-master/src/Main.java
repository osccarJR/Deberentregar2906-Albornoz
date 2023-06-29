import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe lo  que deseas calcular: \n1 -> Triangulo \n2 -> Cuadrado \n3 -> Circulo \n4 -> Esfera \n5 -> Piramide \n6 -> Cubo");
        int figura = sc.nextInt();

        Figura f = null;
        switch(figura) {
            case 1:
                f = new Triangulo();
                for (int i = 0; i < 3; i++) {
                    System.out.println("Escribe los puntos para triangulo " + (i+1) + ": ");
                    f.ingresarPuntos();
                }
                break;
            case 2:
                f = new Cuadrado();
                for (int i = 0; i < 4; i++) {
                    System.out.println("Escribe los puntos para cuadrado " + (i+1) + ": ");
                    f.ingresarPuntos();
                }
                break;
            case 3:
                f = new Circulo();
                for (int i = 0; i < 2; i++) {
                    System.out.println("Escribe los puntos para circulo " + (i+1) + ": ");
                    f.ingresarPuntos();
                }
                break;
            case 4:
                f = new Esfera();
                for (int i = 0; i < 2; i++) {
                    System.out.println("Escribe los puntos para esfera " + (i+1) + ": ");
                    f.ingresarPuntos();
                }
                break;
            case 5:
                f = new Piramide();
                for (int i = 0; i < 5; i++) {
                    System.out.println("Escribe los puntos para piramide " + (i+1) + ": ");
                    f.ingresarPuntos();
                }
                break;
            case 6:
                f = new Cubo();
                for (int i = 0; i < 8; i++) {
                    System.out.println("Escribe los puntos para cubo " + (i+1) + ": ");
                    f.ingresarPuntos();
                }
                break;
            default:
                System.out.println("Seleccion invalida.");
                break;
        }

        if (f != null) {
            System.out.println("Que quieres calcular el Area, el Perimetro o el Volumen? \n1 -> Area \n2 -> Perimetro \n3 -> Volumen");
            int opcion = sc.nextInt();
            if(opcion == 1) {
                System.out.println("Area de la figura: " + f.calcularArea());
            } else if(opcion == 2) {
                System.out.println("Perimetro de la figura: " + f.calcularPerimetro());
            } else if(opcion == 3) {
                System.out.println("Volumen de la figura: " + f.calcularVolumen());
            } else {
                System.out.println("Seleccion invalida.");
            }
        }
    }
}
