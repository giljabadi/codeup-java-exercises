package shapes;

import util.Input;

public class Circle {
    // Variables/Fields
    private double radius;

    // Constructor
    public Circle(double radius){
        this.radius = radius;
    }

    // Methods
    public double getArea(){
        return (Math.PI * this.radius * this.radius);
    }

    public double getCircumference(){
        return (2 * Math.PI * this.radius);
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public static void createNewCircle() {
        System.out.println("\n------ Creating a new circle ------");
        System.out.print("Input Circle's radius: ");

        Circle myCircle = new Circle(Input.getDouble());
        System.out.printf("Area: %.2f%n", myCircle.getArea());
        System.out.printf("Circumference: %.2f%n", myCircle.getCircumference());
    }

}
