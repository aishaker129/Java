class A{
    int a,b;
    A(){
        a = 10;
        b = 20;
    }
    A(int a,int b){
        this.a = a;
        this.b = b;
    }
    A(A d){
        a = d.a;
        b = d.b;
    }

    void display(){
        System.out.println(a+" "+b);
        System.out.println();
    }
}
public class copy {
    public static void main(String[] args) {
        A b = new A();
        A b1 = new A(30, 40);
        A b2 = new A(b1);
       // b.display();

        //b1.display();

        b2.display();
    }
}
