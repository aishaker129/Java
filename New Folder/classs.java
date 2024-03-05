class shap{
    double calculate(){
        return 0;
    }
}

class circle extends shap{
    double r;
    circle(double r){
        this.r = r;
    }
    

    double calculate(){
        return Math.PI*r*r;
    }
}

class triangle extends shap{
    double l,w;
    triangle(double l,double w){
        this.l = l;
        this.w = w;
    }

    double calculate(){
        return .5*l*w;
    }
}

class rectangle extends shap{
    double h,b;
    rectangle(double h,double b){
        this.h = h;
        this.b = b;
    }

    double calculate(){
        return h*b;
    }
}
public class classs {
    public static void main(String[] args) {
        circle b = new circle(8);
        System.out.println("Area of circle: "+b.calculate()+"\n");

        triangle b1 = new triangle(10, 5);
        System.out.println("Area of triangle: "+b1.calculate()+"\n");

        rectangle b2 = new rectangle(30, 15);
        System.out.println("Area of rectangle: "+b2.calculate()+"\n");
    }
}
