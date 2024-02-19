package entity;

public class Operacion {
    private double numero1;
    private double numero2;

//  Método constructor con todos los atributos pasados por parámetro.
    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

//  Método constructor sin los atributos pasados por parámetro.
    public Operacion() {
    }

//  Métodos get y set
    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

//  Método para crearOperacion(): que le pide al usuario los dos números y los
//  guarda en los atributos del objeto.
    public static Operacion crearOperacion(double numero1, double numero2) {
        return new Operacion(numero1, numero2);
    }

//  Método sumar(): calcular la suma de los números y devolver el resultado al main.
    public double sumar() {
        return numero1 + numero2;
    }

//  Método restar(): calcular la resta de los números y devolver el resultado al main.
    public double restar() {
        return numero1 - numero2;
    }

//  Método multiplicar(): primero valida que no se haga una multiplicación por cero,
//  si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
//  error. Si no, se hace la multiplicación y se devuelve el resultado al main.
    public double multiplicar() throws ArithmeticException {
        if(numero1 == 0 || numero2 == 0) {
            throw new ArithmeticException("ERROR: ¡El resultado de multiplicar por 0 " +
                                          "da como resultado 0!");
        }
        return numero1 * numero2;
    }

//  Método dividir(): primero valida que no se haga una división por cero, si fuera a
//  pasar una división por cero, el método devuelve 0 y se le informa al usuario el
//  error. Si no, se hace la división y se devuelve el resultado al main.
    public double dividir() throws ArithmeticException {
        if (numero2 == 0) {
            throw new ArithmeticException("ERROR: ¡No se puede dividir por cero!");
        }
        return numero1 / numero2;
    }

    @Override
    public String toString() {
        return "entity.Operacion [Número 1: " + numero1 +
                ", Número 2: " + numero2 + "]";
    }
}