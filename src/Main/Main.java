package Main;
import classes.triangulo;


public class Main {
    public static void main(String[] args) {

        triangulo triangulo1 = new triangulo();
        triangulo1.Lado_A = 5;
        triangulo1.Lado_B = 5;
        triangulo1.Lado_C = 5;

        System.out.println(triangulo1.formatriangulo());
        System.out.println(triangulo1.obtertipo());


    }
}