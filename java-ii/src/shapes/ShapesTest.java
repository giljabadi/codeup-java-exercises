package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape = new Rectangle(2, 3);
        System.out.println("====== box1 ======");
        System.out.printf("Area: %.1f%nPerimeter: %.1f%n", myShape.getArea(), myShape.getPerimeter());

        myShape = new Square(2);
        System.out.println("\n====== box2 ======");
        System.out.printf("Area: %.1f%nPerimeter: %.1f%n", myShape.getArea(), myShape.getPerimeter());
        // System.out.printf("Length: %.1f%Width: %.1f%n", myShape.getLength(), myShape.getWidth());
    }
}
