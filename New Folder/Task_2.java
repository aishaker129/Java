import java.util.*;
class Shape{
    double r;
    Shape(double r){
        this.r = r;
    }

    public double getPerimeter(){
        return 2*Math.PI*r;
    }

    public double getArea(){
        return Math.PI*r*r;
    }
}

class Circle extends Shape{
    Circle(double r){
        super(r);
    }
    double p = super.getPerimeter();
    double a = super.getArea();
    void Perimeter(){
        System.out.println("Perimeter: "+p);

    }

    void Area(){
        System.out.println("Area: "+a);
        System.out.println();
    }
    
    
}
public class Task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double redius = sc.nextDouble();
        Circle b = new Circle(redius);
        b.Perimeter();
        b.Area();
    }
}
