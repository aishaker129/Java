import java.util.*;

class Student{
    static int count = 0;
    int id;

    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Student id: ");
        id = sc.nextInt();
    }

    static int Std_Cnt(){
        count++;
        return count;
    }

    void display(){
        System.out.println("Number of Student: "+Std_Cnt());
        System.out.println("Student Id: "+id);
    }
}

public class Static {
    public static void main(String[] args) {
        Student b = new Student();
        b.getdata();
        b.display();

        Student b1 = new Student();
        b1.getdata();
        b1.display();

        Student b2 = new Student();
        b2.getdata();
        b2.display();
    }
}
