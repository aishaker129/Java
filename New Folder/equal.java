class Ans{
    int a,b;
    Ans(){
        a = 20;
        b = 30;
    }

    Ans(int a,int b){
        this.a = a;
        this.b = b;
    }

    boolean equal(Ans ab){
        if(a==ab.a && b == ab.b) return true;
        else return false;
    }
}

public class equal {
    public static void main(String[] args) {
        Ans b = new Ans(20, 30);
        Ans b1 = new Ans(20, 33);
        Ans b2 = new Ans(20, 30);

        System.out.println("b and b1 are equal.."+b.equal(b1));
        System.out.println("b and b2 are equal ..."+b.equal(b2));
        System.out.println("b1 and b2 are equal.."+b1.equal(b2));
    }
}
