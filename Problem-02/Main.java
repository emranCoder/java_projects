public class Main {
    public static void main(String[] args) {
        Circle cr = new Circle("Circle", 5);
        Rectangle rt = new Rectangle("Rectangle", 7, 10);
        Triangle tr = new Triangle("Triangle", 10, 5);
        System.out.println("Circle Area is: " + cr.calculateArea());
        System.out.println("Rectangle Area is: " + rt.calculateArea());
        System.out.println("Triangle Area is: " + tr.calculateArea());
    }
}