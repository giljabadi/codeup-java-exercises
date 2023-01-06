package shapes;
import shapes.Rectangle;
import shapes.Square;


public class ShapesTest {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Square square = new Square();
        Measurable myVariable = new Measurable() {
            @Override
            public void getPerimeter() {

            }

            @Override
            public void getArea() {

            }
        };
    }
}

//    Rectangle box1 = new Rectangle(4, 5);
//        box1.getPerimeter();
//        box1.getArea();
//        Square box2 = new Square (5);
//        box2.getArea();
//        box2.getPerimeter();
