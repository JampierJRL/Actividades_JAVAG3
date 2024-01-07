package ClasesAbstractas;

public class Circulo extends Figura{

    private float radio;
    private float PI;

    public Circulo(String color, float radio, float PI){
        super(color);
        this.radio=radio;
        this.PI=PI;
    }

    @Override
    public float area() {
        return PI*radio*radio;
    }

    @Override
    public float perimetro() {
        return 2*PI*radio;
    }

    @Override
    public void printColor() {
        System.out.println("El color del circulo es: " + color);
    }
}
