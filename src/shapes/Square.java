package shapes;

public class Square extends Quadrilateral{

    public Square(int s){
        super(s,s);
    }

    public double getPerimeter(){
        return length*4;
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
//    public int side;
//    public Square(int s){
//        super(s,s);
//        side = s;
//    }
//
//
//    public int getArea() {
//        return 4*side;
//    }
//
//    public int getPerimeter(){
//        return (int)Math.pow(side,2);
//    }
}