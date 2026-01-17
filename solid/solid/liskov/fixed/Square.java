package solid.liskov.fixed;

public class Square implements Shape{

    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int calculate_area() {
        return side * side;
    }
    
}
