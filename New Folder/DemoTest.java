class sum{
    int val;
    sum(){
        System.out.println("Default:");
        val = 10;
    }

    sum(int val){
        System.out.println("Perametarized:");
        this.val = val; 
    }

    sum add(sum ab){
        System.out.println("Copy: ");
        sum t = new sum();
        t.val = val + ab.val;
        return t;
    }
    sum add(int a){
        sum t = new sum();
        t.val = val + a;
        return t;
    }

    void display(){
        System.out.println("value: "+ val);
    }
}
public class DemoTest {
    public static void main(String[] args) {
       //sum b = new sum();
        sum b1 = new sum(20);
        sum b2 = new sum(10);
        b1 = b1.add(b2);
        b1.display();
        b2 = b2.add(30);
        b2.display();
    }
}
