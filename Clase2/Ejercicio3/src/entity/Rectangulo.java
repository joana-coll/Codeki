package entity;

public class Rectangulo implements CalculosFormas {
    private double base;
    private double altura;

//  Constructor por defecto.
    public Rectangulo(double base, double altura) {
        super();
        this.base = base;
        this.altura = altura;
    }

//  Constructor vacío.
    public Rectangulo() {
        super();
    }

//  Métodos getters y setters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

//  Métodos implementados de la interfaz
    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return (base + altura) * 2;
    }

}