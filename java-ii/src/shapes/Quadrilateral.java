package shapes;

abstract class Quadrilateral extends Shape implements Measurable{
    // Variables/Fields
    protected int length;
    protected int width;

    // Constructor
    public Quadrilateral(int width, int length){
        this.length = length;
        this.width = width;
    }

    // Methods
    public int getLength(){
        return this.length;
    }

    public int getWidth(){
        return this.width;
    }

    // Abstract Methods
    public abstract void setLength(int length);
    public abstract void setWidth(int width);
}
