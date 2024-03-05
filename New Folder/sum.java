class add{
    int a,b;
    add(){}
    add(int a,int b){
        this.a = a;
        this.b = b;
    }

    add(add ob){
        a = ob.a;
        b = ob.b;
    }

    add addition(add ob){
        add t = new add();
        t.a = a+ob.a;
        t.b = b+ob.b;
        return t;
    }

    void display(){
        System.out.println("a is: "+a+" b is: "+b);
    }
}
public class sum {
    public static void main(String[] args) {
        add b = new add(10, 20);
        add b1 = new add(30, 40);
        add b2 = new add(b);

        b1 = b.addition(b1);
        b1.display();

        b.display();
        b1.display();
        b2.display();
    }
}
