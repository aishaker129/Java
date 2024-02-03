
class Box{
    double l,h;
    Box(){
        System.out.println("Default Constructor");
        l = 10;
        h = 20.5;
    }

    double area(){
        return l*h;
    }
}

class Boxweight extends Box{
    double w;
    Boxweight(){
        w = 30.0;
    }

    double volium(){
        return l*h*w;
    }
}
public class Boxes {
    public static void main(String[] args) {
        Boxweight b = new Boxweight();
        System.out.println(b.volium());
    }
}
