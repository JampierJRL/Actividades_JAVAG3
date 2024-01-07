package ClasesAbstractas;

import java.lang.module.FindException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Cuadrado cua1 = new Cuadrado("Rosa", 2);
        System.out.println("\n-------------RESULTADOS/CUADRADO-----------------");
        cua1.printColor();
        System.out.print("Area: ");
        System.out.println(cua1.area());
        System.out.print("Perimetro: ");
        System.out.println(cua1.perimetro());
        System.out.println("--------------------------------------------------");

        System.out.println("\n-------------RESULTADOS/CIRCULO-----------------");
        Circulo cir1 = new Circulo("Amarillo", 3, 3.1416F);
        cir1.printColor();
        System.out.print("Area: ");
        System.out.println(cir1.area());
        System.out.print("Perimetro: ");
        System.out.println(cir1.perimetro());
    }
}
