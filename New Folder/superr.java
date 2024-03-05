class override{
	void show(){
		System.out.println("This is first parent");
		}
	}
class Animel extends override{
	void show(){
		super.show();
		System.out.println("This is second Parent");
		}
	}
	
class cat extends Animel{
	void show(){
		super.show();
		System.out.println("This is second Child");
		}
	}

public class superr{
	public static void main(String args[]){
		Animel b = new Animel();
		cat b1 = new cat();
		
		b.show();
		
		b1.show();
	}
}
