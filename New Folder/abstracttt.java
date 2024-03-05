abstract class AD{
    void show(){
        System.out.println("Abstract class");
    }
    abstract void display();
}

class BD extends AD{
    void display(){
        System.out.println("BD mean Bangladesh");
    }
}
public class abstracttt {
    public static void main(String[] args) {
        AD b = new BD();
        b.show();
        b.display();
        

    }
}
