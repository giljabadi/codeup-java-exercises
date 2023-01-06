package shapes;
import util.Input;
import java.lang.Math;
import java.util.Scanner;

public class Circle {
    private double radius;
    public Circle(double radius) {
       this.radius = radius;
    }
    public double getArea() {
        return Math.PI * (Math.pow(this.radius, 2));
    }
    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

    public static void main(String[] args) {
        double radius = Input.Radius();
        Circle circle = new Circle(radius);
        double area = circle.getArea();
        System.out.println("The area of the circle is: " + area);
        double circumference = circle.getCircumference();
        System.out.println("The circumference of the circle is: " + circumference);

    }

}
