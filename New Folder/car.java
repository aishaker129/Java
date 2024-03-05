interface AC{
    void speedUp(int a);
    void speedDown(int a);
}

class BC implements AC{
    int speed;
    BC(int speed){
        this.speed = speed;
    }
    public void speedUp(int a){
        speed +=a;
    }
    public void speedDown(int a){
        speed -=a;
    }

    void show(){
        System.out.println("Current speed is: "+speed);
    }
}
public class car {
    public static void main(String[] args) {
        BC b =new BC(100);
        b.speedUp(10);
        b.show();
        b.speedDown(12);
        b.show(); 
    }
}
