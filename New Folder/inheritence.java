class A {
    int a,b;
    void abc(int x,int y){
        a = x;
        b = y;
    }
}

class B extends A{
    int total;
    int sum(){
        total =  a+b;
        return total;
    }
}

public class inheritence {
    public static void main(String[] args) {
        B b = new B();
        b.abc(10,20);
        System.out.println("Total: "+b.sum());
    }
}
