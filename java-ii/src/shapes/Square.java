package shapes;

public class Square extends Quadrilateral{
    // Constructor
    public Square(int side) {
        super(side, side);
    }

    // Methods
    @Override
    public double getPerimeter() {
        return this.width * 4;
    }

    @Override
    public double getArea() {
        return this.width * this.length;
    }

    @Override
    public void setLength(int length) {
        this.length = this.width = length;
    }

    @Override
    public void setWidth(int width) {
        this.width = this.length = width;
    }
}
