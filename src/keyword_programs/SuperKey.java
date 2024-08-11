package keyword_programs;

public class SuperKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		c1.start();
		
		Honda h1 = new Honda();
		h1.start();
		h1.drive();
		h1.stop();
	}

}

class Car{
	void start() {
		System.out.println(this.getClass().getSimpleName() + " has started");
	}
	void drive() {
		System.out.println(this.getClass().getSimpleName() + " is driving");	
	}
	void stop() {
		System.out.println(this.getClass().getSimpleName() + " has stopped");	
	}
}

class Honda extends Car{
	// override the parent start method
	void start() {
		System.out.println(this.getClass().getSimpleName() + " has started");
	}
	void drive() {
		super.drive();
		System.out.println("--------");
	}
	
}