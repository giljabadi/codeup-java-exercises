package shapes;

public class Rectangle extends Quadrilateral {
    // Constructor
    public Rectangle(int width, int length){
        super(width, length);
    }

    // Methods
    @Override
    public double getPerimeter() {
        return this.length * 2 + this.width * 2;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
    }
}
