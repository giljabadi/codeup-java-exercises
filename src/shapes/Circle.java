package shapes;

public class Circle {
    private double radius;

    public Circle(double r){
        this.radius = r;
    }

    public double area(){
        return Math.PI*(this.radius*this.radius);
    }

    public double getCircumference(){
        return Math.PI*2*this.radius;
    }
}