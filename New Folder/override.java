class Animal{
    void makeSound(){
        System.out.println("Animal make a sound\n");
    }
}

class Cat extends Animal{
    void makeSound(){
        System.out.println("Cat say Mew Mew Mew....\n");
    }
}

public class override {
    public static void main(String[] args) {
        Animal b = new Animal();
        Cat b1 = new Cat();

        b.makeSound();
        b1.makeSound();
    }
}
