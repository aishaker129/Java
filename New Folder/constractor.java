class Box{
    double len,weidth,height;
    Box(){
        len = 10;
        weidth = 20;
        height = 30;
    }
    Box(double len, double weidth, double height){
        this.len = len;
        this.weidth = weidth;
        this.height = height;
    }

    Box(Box b){
        len = b.len;
        weidth = b.weidth;
        height = b.height;
    }

    double volume(){
        return len*weidth*height;
    }

    double area(){
        return .5*height*weidth;
    }
}

public class constractor {
    public static void main(String[] args) {
        Box b = new Box();
        System.out.println(b.volume());
        System.out.println(b.area());
        System.out.println();

        Box b1 = new Box(5, 10, 15);
        System.out.println(b1.volume());
        System.out.println(b1.area());
        System.out.println();

        Box b2 = new Box(b1);
        System.out.println(b2.volume());
        System.out.println(b2.area());
        System.out.println();
    }
}
