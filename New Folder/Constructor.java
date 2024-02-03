class practice{
    int a,b,val;
    practice(){
        System.out.println("Dfault..");
        a = 4;
        b = 5;
        val = a+b;
    }
    practice(int a,int b){
        System.out.println("parameter..");
        this.a = a;
        this.b = b;
        val = a+b;
    }

    practice(practice ab){
        System.out.println("Copy..");
        a = ab.a;
        b = ab.b;
        val = a+b;
    }
    void display(){
        //val = a+b;
        System.out.println("Ans: "+val);
    }

}

public class Constructor {
    public static void main(String[] args) {
        practice b = new practice();
        b.display();

        practice b1 = new practice(20,30);
        b1.display();

        practice b2 = new practice(b1);
        b2.display();
    }
}
