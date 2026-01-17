package solid.liskov.fixed;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 4);
        Square square = new Square(5);
        
        System.out.println("Area del rectangulo: " + rectangle.calculate_area());
        System.out.println("Area del cuadrado: " + square.calculate_area());
    }
}