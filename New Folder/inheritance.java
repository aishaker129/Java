
class parent{

    double l,w;
    parent(){
        l = 10;
        w = 20;
    }
    parent(int x,int y){
        l = x;
        w = y;
    }
    
    double area(){
        return (1/2)*l*w;
    }
}

class child  extends parent{
    double h,l,w;
    child(){
        h = 30;
    }
    child(int a,int b,int c){
        h = a;
        l = b;
        w = c;
    }

    double area(){
        return h*l*w;
    }
}
public class inheritance {
    public static void main(String[] args) {
        child b = new child();
        double ans = b.area();

        System.out.println(ans);
    }
}
