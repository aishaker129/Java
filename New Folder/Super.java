class Box{
    double l,h;
    Box(){
        l = 20;
        h = 5;
        System.out.println("Length: "+l+"Height: "+h);
    }
    Box(double l, double h){
        this.l = l;
        this.h = h;
        System.out.println("Length: "+l+"Height: "+h);
    }
    Box(Box b){
        l = b.l;
        h = b.h;
        System.out.println("Length: "+l+"Height: "+h);
    }
}

class Boxweight extends Box{
    double w;
    Boxweight(){
        super();
        w = 10;
        System.out.println("Weidth: "+w);
    }
    Boxweight(double l,double h, double w){
        super(l, h);
        this.w = w;
        System.out.println("Weidth: "+w);
    }
    Boxweight(Boxweight b){
        super(b);
        System.out.println("Weidth: "+w);

    }
}

class Boxcolor extends Boxweight{
    String s;
    Boxcolor(){
        super();
        s = "red";
        System.out.println("Color: "+s);
    }
    Boxcolor(double l,double h, double w, String s){
        super(l, h, w);
        this.s =s; 
        System.out.println("Color: "+s);
    }

    Boxcolor(Boxcolor b){
        super(b);
        s = b.s;
        System.out.println("Copy Constructor: "+s);
        System.out.println("Color: "+s);
    }
}
public class Super {
    public static void main(String[] args) {
        Box b = new Box();
        Box b1 = new Box(10, 30);
        Box b2= new Box(b);

        Boxweight w = new Boxweight();
        Boxweight w1 = new Boxweight(20, 50, 70);
        Boxweight w2 = new Boxweight(w);

        Boxcolor c = new Boxcolor();
        Boxcolor c1 = new Boxcolor(60, 30, 3, "Blue");
        Boxcolor c2 = new Boxcolor(c);

    }
}
