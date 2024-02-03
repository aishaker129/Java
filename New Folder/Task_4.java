class Drive49{
    double tsize = 10,fsize = 0,used;
    Drive49(){
        used = 5.5;
        fsize = 10.0 - used;
    }
    Drive49(double a){
        used = a;
        fsize = 10.0 - used;
    }

    Drive49 add(Drive49 ab){
        Drive49 t = new Drive49();
        t.used = used + ab.used;
        t.fsize = 10.0 - t.used;
        return t;
    }

    void show(){
        System.out.println("Free Capacity: " + fsize + "GB");
    }
}
public class Task_4 {
    public static void main(String[] args) {
        Drive49 b = new Drive49();
        Drive49 b1 = new Drive49(5.9);
        Drive49 b2 = new Drive49(2.2);
        b1 = b1.add(b2);
        b1.show();
    }
}
