
class football{
    int radius,width;
    football(int a,int b){
        radius = a;
        width = b;
    }
    void display(){
        System.out.println("Football: "+radius*width);
    }
}

class footballColor extends football{
    footballColor(int a,int b){
        super(a,b);
    }

    void display(){
        System.out.println("footballCOlor: "+((radius*width)+1));
    }
}
public class Ct_Q_2 {
    public static void main(String[] args) {
        footballColor b = new footballColor(20, 5);
        b.display();
    }
}
