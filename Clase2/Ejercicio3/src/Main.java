import entity.Circulo;
import entity.Rectangulo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//      Creación de instancia Scanner
        Scanner input = new Scanner(System.in);

//      Ingreso del radio del circulo
        System.out.print("Ingresa el radio del círculo: ");
        double radio = input.nextDouble();

//      Creación de instancia Circulo con el valor de radio
        Circulo circulo = new Circulo(radio);

//      Ingreso de base y altura del rectangulo
        System.out.print("\nIngresa la base del rectángulo: ");
        double base = input.nextDouble();
        System.out.print("Ingresa la altura del rectángulo: ");
        double altura = input.nextDouble();

//      Creación de instancia Rectangulo con los valores base y altura
        Rectangulo rectangulo = new Rectangulo(base, altura);

//      Imprime resultados en consola
        System.out.println("\nCIRCULO");
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Perímetro: " + circulo.calcularPerimetro());

        System.out.println("\nRECTÁNGULO");
        System.out.println("Área:" + rectangulo.calcularArea());
        System.out.println("Perímetro:" + rectangulo.calcularPerimetro());

    }
}