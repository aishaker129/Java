interface A{
    void name(String s);
    void ID(int id);
    void show();
}

interface AB {
    void deptt(String dpt);
    void coure(String c);
}

class B implements A,AB{
    String s,dept,c;
    int id;
    public void name(String s){
        this.s = s;
    }
    public void ID(int id){
        this.id = id;

    }
    public void deptt(String dept){
        this.dept = dept;
    }
    public void coure(String c){
        this.c = c;
    }
    public void show(){
        System.out.println("MY name is: "+s);
        System.out.println("MY Id is: "+id);
        System.out.println("MY Id Depertment: "+dept);
        System.out.println("MY Id Course: "+c);
    }
}
public class hello {

    public static void main(String[] args) {
        B b = new B();
        b.name("AI Shaker");
        b.ID(356);
        b.deptt("CSE");
        b.coure("Java");
        b.show();
    }
}