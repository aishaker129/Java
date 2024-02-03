
class Person{
    
    String fname,lname;

    Person(String f, String l){
        fname = f;
        lname = l;
    }
    public String getFirstName(){
        return fname;
    }
    public String getLastName(){
        return lname;
    }
}

class Employee extends Person{
    String title;
    int id;
    Employee(String f,String l,int id, String title){
        super(f,l);
        this.id = id;
        this.title = title;
    }
    public int  getEmployeeId(){
        return id;
    }
    public String getLastName(){
        return super.lname+" "+ title;
    }
    void show(){
        System.out.println("EmployeeId: "+id);
        System.out.println("First Name: "+fname);
        System.out.println("Last name: "+lname);
        System.out.println("Title: "+title);
        System.out.println();
    }
}
public class Task_1 {
    public static void main(String[] args) {
        Employee b = new Employee("AI","Shaker",356,"Student");
        Employee b1 = new Employee("Mahfuz","Mia", 58, "Software Engineer");

        b.show();
        b1.show();
    }
    
}