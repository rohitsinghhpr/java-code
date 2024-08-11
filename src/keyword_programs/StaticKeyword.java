package keyword_programs;

public class StaticKeyword {

	// static member belongs to class insteAd of object, and can be access using class.
	
	// static variable
	static int pin = 245101;
	static String add;
	
	// static method 
	static void myMethod()
    {
        System.out.println("myMethod");
    }
	
	// static block - used to initialize the static variables.
	static {
		add = "secter 62, noida";
	}
	
	// static class - can be defined in a class.
	static class StaticClass{		
		
		void displayPin()
		{
			System.out.println("outter pin "+ (pin));
		}		
		
		static void staticDisplayPin() {
			System.out.println("outter pin static class display"+ (pin));
		}
		
		static void hi() {
			System.out.println("static class saying hi");
		}
	}
	
	
	public static void main(String[] args) {		
		// all ready in class
		System.out.println("pin "+pin);
		System.out.println("address "+add);
		myMethod(); // calling a static method
		StaticClass.hi();
		StaticKeyword.StaticClass sc1 = new StaticKeyword.StaticClass();
		sc1.displayPin();
		StaticClass.staticDisplayPin();
	}

}
