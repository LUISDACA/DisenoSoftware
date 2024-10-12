import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el radio del círculo: ");
        int radio = scanner.nextInt();
        Circulo circulo = new Circulo(radio);

        System.out.println("Ingrese el lado del cuadrado: ");
        int ladoCuadrado = scanner.nextInt();
        Cuadrado cuadrado = new Cuadrado(ladoCuadrado);

        System.out.println("Ingrese la base del rectángulo: ");
        int baseRectangulo = scanner.nextInt();
        System.out.println("Ingrese la altura del rectángulo: ");
        int alturaRectangulo = scanner.nextInt();
        Rectangulo rectangulo = new Rectangulo(baseRectangulo, alturaRectangulo);

        System.out.println("Ingrese la base del triángulo (rectángulo): ");
        int baseTriangulo = scanner.nextInt();
        System.out.println("Ingrese la altura del triángulo: ");
        int alturaTriangulo = scanner.nextInt();
        Triangulo triangulo = new Triangulo(baseTriangulo, alturaTriangulo);

        System.out.println("Ingrese el lado del cubo: ");
        int ladoCubo = scanner.nextInt();
        Cubo cubo = new Cubo(ladoCubo);

        System.out.println("Resultados:");

        System.out.println("Círculo: Área = " + circulo.getArea() + ", Perímetro = " + circulo.getPerimetro());
        System.out.println("Cuadrado: Área = " + cuadrado.getArea() + ", Perímetro = " + cuadrado.getPerimetro());
        System.out.println("Rectángulo: Área = " + rectangulo.getArea() + ", Perímetro = " + rectangulo.getPerimetro());
        System.out.println("Triángulo: Área = " + triangulo.getArea() + ", Perímetro = " + triangulo.getPerimetro());
        System.out.println("Cubo: Área = " + cubo.getArea());

        scanner.close();
    }
}
