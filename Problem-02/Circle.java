public class Circle extends Shape {
    private final double radius;

    public Circle(String shapeName, double radius) {
        super(shapeName);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * (radius * radius);
    }
}
