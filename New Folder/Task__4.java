class Vehicle{
    String make,model,fuleype;
    int year; 
    double fouleefficiency;
    Vehicle(String make,String  model,String fuleype,int year,double fouleefficiency){
        this.make=make;
        this.model=model;
        this.year = year;
        this.fuleype=fuleype;
        this.fouleefficiency=fouleefficiency;
    }
}

class Truck extends Vehicle{
    double capacity;
    Truck(String make , String model , String fueltype , int year , double fouleefficiency,double capacity){
        super(make,model,fueltype,year,fouleefficiency);
        this.capacity=capacity;
    }
    
    double cfouleefficiency = fouleefficiency*(1/(1+capacity/1000));
    double DistanceTraveled = fouleefficiency*capacity;
    double maxSpeed = 90;

    void show(){
        System.out.println("Name: "+make);
        System.out.println("Model: "+model);
        System.out.println("Year: "+year);
        System.out.println("Foule Type: "+fuleype);
        System.out.println("Foule efficiency: "+cfouleefficiency);
        System.out.println("Distance Traveld :"+DistanceTraveled);
        System.out.println("Max Speed :"+maxSpeed+" kmph");
        System.out.println();
    }

}

class Car extends Vehicle{
    int set;
    Car(String make , String model , String fueltype , int year , double fouleefficiency,int set){
        super(make, model, fueltype, year, fouleefficiency);
        this.set = set;
    }

    double cfouleefficiency = fouleefficiency*(1/(1+set/5));
    double DistanceTraveled = fouleefficiency*set;
    double maxSpeed = 150;

    void show(){
        System.out.println("Name: "+make);
        System.out.println("Model: "+model);
        System.out.println("Year: "+year);
        System.out.println("Foule efficiency: "+cfouleefficiency);
        System.out.println("Distance Traveld :"+DistanceTraveled);
        System.out.println("Max Speed :"+maxSpeed+" kmph");
        System.out.println();
    }
}

class Motorcycle extends Vehicle{
    double engine;
    Motorcycle(String make , String model , String fueltype , int year , double fouleefficiency,double engine){
        super(make, model, fueltype, year, fouleefficiency);
        this.engine = engine;
    }

    double cfouleefficiency = fouleefficiency*(1/(1+engine/5));
    double DistanceTraveled = fouleefficiency*engine;
    double maxSpeed = 200;

    void show(){
        System.out.println("Name: "+make);
        System.out.println("Model: "+model);
        System.out.println("Year: "+year);
        System.out.println("Foule efficiency: "+cfouleefficiency);
        System.out.println("Distance Traveld :"+DistanceTraveled);
        System.out.println("Max Speed :"+maxSpeed+" kmph");
        System.out.println();
    }
}
public class Task__4 {
    public static void main(String[] args) {
       Truck b = new Truck("Toyota", "T-5086", "Digel", 2020, 4.50, 8.0);
       b.show();
       Car b1 = new Car("Apacy", "A-s20", "Gas", 1998, 4.80, 8);;
       b1.show();
       Motorcycle b2 = new Motorcycle("Suzuki", "ms-30", "oil", 2023, 6.90, 100.0);
        b2.show();

    }
}
