//import java.util.*;

class gf{
    String name = "Shaker";
    int age = 80; 

}

class father extends gf{
    String n = "my son";
    int a = 50;
    void show(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(n);
        System.out.println(a);
    }
    
}

class son extends father{
    String s = "My grend son";
    int ages = 20;
    void show(){
        System.out.println(n);
        System.out.println(a);
        System.out.println(s);
        System.out.println(ages);
    }
} 

class dughter extends father{
    String s = "My grend dughter";
    int age = 22;
    void show(){
        System.out.println(n);
        System.out.println(a);
        System.out.println(s);
        System.out.println(age);
    }
}
public class inherit {

    public static void main(String[] args) {
        son b = new son();
        dughter b1 = new dughter();
        b.show();
        b1.show();
    }
}