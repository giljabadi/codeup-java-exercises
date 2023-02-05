package shapes;
import shapes.Rectangle;

public class ShapeTest {

    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(5,4);
//        System.out.printf("Box1 area: %d\n", box1.getArea());
//        System.out.printf("Box1 perimeter: %d", box1.getPerimeter());

//        Rectangle box2 = new Square(5);
//        System.out.printf("\nBox2 area: %d\n", box2.getArea());
//        System.out.printf("Box2 perimeter: %d", box2.getPerimeter());

        Measurable myShape;

        myShape = new Square(4);
        System.out.printf("Square perimeter: %.2f",myShape.getPerimeter());
        System.out.printf("\nSquare area: %.2f",myShape.getArea());

        myShape = new Rectangle(4,5);
        System.out.printf("\nRectangle perimeter: %.2f",myShape.getPerimeter());
        System.out.printf("\nRectangle area: %.2f",myShape.getArea());
    }
}