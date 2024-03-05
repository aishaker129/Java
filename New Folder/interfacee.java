interface A{
    void show();
    void add(int a,int b);
}

class B implements A{
    int a,b;
    public void add(int a, int b){
        this.a = a;
        this.b = b;
    }

    public void show(){
        System.out.println(a+" "+b);
    }
}
public class interfacee {

    public static void main(String[] args) {
        B b = new B();
        b.add(10,20);
        b.show();
    }
}