class demo{
    void display(){
        System.out.println("This is parent class\n");
    }
}

class child extends demo{
    void display(){
        System.out.println("This is child class");
    }
}

public class Overriding {
    public static void main(String[] args) {
        child b = new child();
        b.display();
    }
}
