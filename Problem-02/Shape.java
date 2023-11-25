abstract class Shape {
    public String shapeName;

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    abstract public double calculateArea();
}
