class demo{
    int a,b;
    demo(int a,int b){
        this.a = a;
        this.b = b;
    }

    boolean equals(demo d){
        return a==d.a && b==d.b;
    }
}

public class passing {
    public static void main(String[] args) {
        demo b = new demo(10, 20);
        demo b1 = new demo(10, 20);
        demo b2 = new demo(30, 20);

        System.out.println("a and b is "+b.equals(b1));
        System.out.println("a and b is "+b.equals(b2));
    }
}
