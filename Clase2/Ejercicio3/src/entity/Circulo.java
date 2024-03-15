package entity;

public class Circulo implements CalculosFormas {

    private double radio;

//  Constructor por defecto.
    public Circulo(double radio) {
        super();
        this.radio = radio;
    }

//  Constructor vacío.
    public Circulo() {
        super();
    }

//  Métodos getters y setters
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

//  Métodos implementados de la interfaz
    @Override
    public double calcularArea() {
        return (NUMPI * Math.pow(radio, 2));
    }

    @Override
    public double calcularPerimetro() {
        return (2 * NUMPI * radio);
    }

}