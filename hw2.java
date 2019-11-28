interface Shape{
    abstract double getArea();
}

class Rectangle implements Shape{
    double length,width;
    public Rectangle(double l,double w){
        length=l;
        width=w;
    }
    public double getArea(){
        return length*width;
    }
    public String toString(double n){
        return "area =" +n;
    }
}
class Triangle implements Shape{
    double base,height;
    public Triangle(double a,double b){
        base=a;
        height=b;
    }
    public double getArea(){
        return base*height/2;
    }
    public String toString(double n){
        return "area =" +n;
    }
}
public class hw2{
    public static void main(String arg[]){
        Rectangle rec=new Rectangle(10,20);
        System.out.println(rec.toString(rec.getArea()));
        Triangle tri=new Triangle(15,25);
        System.out.println(tri.toString(tri.getArea()));
    }
}
