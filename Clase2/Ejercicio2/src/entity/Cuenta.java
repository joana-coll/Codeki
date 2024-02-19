package entity;

public class Cuenta {
    private int numeroCuenta;
    private long dniCliente;
    private double saldoActual;
    private double interes;

//  Constructor por defecto.
    public Cuenta(int numeroCuenta, long dniCliente, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }

//  Constructor con DNI, saldo, número de cuenta e interés
    public Cuenta(int numeroCuenta, long dniCliente, double saldoActual, double interes) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

//  Constructor vacío.
    public Cuenta() {
    }

//  Agregar los métodos getters y setters correspondientes
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

//  Método para crear un objeto Cuenta, pidiéndole los datos al usuario.
    public static Cuenta crearCuenta(int numeroCuenta, long dniCliente, double saldoActual, double interes) {
        return new Cuenta(numeroCuenta, dniCliente, saldoActual, interes);
    }

//  Método ingresar(double ingreso): el método recibe una cantidad de dinero a
//  ingresar y se la sumará al saldo actual.
    public void ingresar(double ingreso) {
        saldoActual += ingreso;
    }

//  Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
//  se le restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
//  pondrá el saldo actual en 0
    public void retirar(double retiro) {
        if(retiro <= saldoActual) {
            saldoActual -= retiro;
        }
        else {
            saldoActual = 0;
        }
    }

//  Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo.
    public double extraccionRapida() {
        double extRap = saldoActual * 0.2;
        saldoActual -= extRap;
        return extRap;
    }

//  Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
    public double consultarSaldo() {
        return saldoActual;
    }

//  Método consultarDatos(): permitirá mostrar todos los datos de la cuenta.
    public String consultarDatos() {
        return "Cuenta [Número de cuenta: " + numeroCuenta + ", DNI del cliente: " + dniCliente +
                ", Saldo actual: $" + saldoActual + ", Interes: " + interes + "]";
    }
}