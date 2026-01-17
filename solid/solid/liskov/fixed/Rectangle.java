package solid.liskov.fixed;

public class Rectangle implements Shape {

    protected int width;
    protected int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int calculate_area() {
        return width * height;
    }
}
