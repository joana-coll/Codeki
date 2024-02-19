import entity.Operacion;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//      Creación de instancia Scanner
        Scanner input = new Scanner(System.in);

//      Ingreso de datos.
        System.out.print("Ingrese un número: ");
        double numero1 = input.nextDouble();
        System.out.print("Ingrese otro número: ");
        double numero2 = input.nextDouble();

//      Llamo al método para crear la operación con los números ingresado.
        Operacion operacion = Operacion.crearOperacion(numero1, numero2);

//      Llamo a los métodos de cálculo e imprimo el resultado
        System.out.println("\nResultado de la suma: " + operacion.sumar());
        System.out.println("Resultado de la resta: " + operacion.restar());
        try {
            System.out.println("Resultado de la multiplicación: " + operacion.multiplicar());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("Resultado de la división: " + operacion.dividir());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}