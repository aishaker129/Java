class demo{
    void chack(int a){
        System.out.println("hi "+a);
    }
    void chack(int a,int b){
        System.out.println(a+b);
    }
    void chack(int a,double b,String s){
        System.out.println(s+(a+b));
    }
}
public class method {
    public static void main(String[] args) {
        demo b = new demo();
        b.chack(10, 20, "AI ");
        b.chack(10);
        b.chack(39, 41);
    }
}
