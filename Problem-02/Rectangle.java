public class Rectangle extends Shape {
    private final double width;
    private final double length;

    public Rectangle(String shapeName, double width, double length) {
        super(shapeName);
        this.width = width;
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return width * length;
    }

}
