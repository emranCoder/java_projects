public class Triangle extends Shape {
    private final double height;
    private final double base;

    public Triangle(String shapeName, double height, double base) {
        super(shapeName);
        this.height = height;
        this.base = base;
    }

    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }

}
