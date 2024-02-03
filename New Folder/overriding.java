
class A{
    int add(int a,int b){
        return a+b;
    }
}

class B extends A{
    int add(int c,int d){
        return c+d+2;
    }
}
public class overriding {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.add(4,5));

    }
}
