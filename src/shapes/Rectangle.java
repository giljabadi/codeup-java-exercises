package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

    public Rectangle(int l, int w){
        super(l,w);
    }

   public double getPerimeter(){
        return (width*2)+(length*2);
    }
   public double getArea(){
        return length*width;
    }
    public void setLength(int l){
        length = l;
    }

    public void setWidth(int w){
        width = w;
    }
//    private int length;
//    private int width;
//
//    public Rectangle(int l, int w){
//        length = l;
//        width = w;
//    }
//
//    public int getArea(){
//        return length*width;
//    }
//
//    public int getPerimeter(){
//        return (length*2)+(width*2);
//    }
}