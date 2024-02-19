import entity.Cuenta;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//      Creación de instancia Scanner
        Scanner input = new Scanner(System.in);

//      Ingreso de datos.
        System.out.print("Ingrese su número de cuenta: ");
        int numeroCuenta = input.nextInt();
        System.out.print("Ingrese su DNI: ");
        long dniCliente = input.nextLong();
        System.out.print("Ingrese su saldo actual: $");
        double saldoActual = input.nextDouble();
        System.out.print("Ingrese el interes: ");
        double interes = input.nextDouble();

//      Llamo al método para crear la cuenta con los datos ingresados.
        Cuenta cuenta = Cuenta.crearCuenta(numeroCuenta, dniCliente, saldoActual, interes);

//      Pido al usuario que ingrese el monto que desea depositar y llamo al método ingresar.
//      Luego llamo al metodo consultarSaldo
        System.out.print("\nIngrese el monto que desea depositar: $");
        cuenta.ingresar(input.nextDouble());
        System.out.println("Su saldo actual es: $" + cuenta.consultarSaldo());

//      Pido al usuario que ingrese el monto que desea retirar y llamo al método retirar.
//      Luego llamo al metodo consultarSaldo
        System.out.print("\nIngrese el monto que desea retirar: $");
        cuenta.retirar(input.nextDouble());
        System.out.println("Su saldo actual es: $" + cuenta.consultarSaldo());

//      Llamo al método extraccionRapida y devuelvo el valor del 20% del saldoActual.
//      Luego llamo al metodo consultarSaldo
        System.out.println("\nEstá retirando el 20% de su saldo actual que es: $" + cuenta.extraccionRapida());
        System.out.println("Su saldo actual es: $" + cuenta.consultarSaldo());

//      Llamo al método consultarDatos.
        System.out.println("\n" + cuenta.consultarDatos());

    }
}