class Hospital{
    int n_d,n_n,salary;
    Hospital(){
        n_d = 10;
        n_n = 11;
        salary = 50000;
    }

    Hospital(int a,int b,int c){
        n_d = a;
        n_n = b;
        salary = c;
    }

    Hospital(Hospital ob){
        n_d = ob.n_d;
        n_n = ob.n_n;
        salary = ob.salary;
    }

    void display(){
        System.out.println("Number of Doctor: "+n_d);
        System.out.println("Number of Nurses: "+n_n);
        System.out.println("Salary: "+salary);
    }
}
public class Ct_1 {
    public static void main(String[] args) {
        Hospital b = new Hospital();
        Hospital b1 = new Hospital(15,17,30000);
        Hospital b2 = new Hospital(b);

        b1.display();
        b2.display();
        b.display();
    }
}
