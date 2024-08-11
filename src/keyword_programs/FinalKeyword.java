package keyword_programs;

public class FinalKeyword {
	
	/*
	 * final variable - can not be reassigned value;
	 * final method - can not be override;
	 * final class - can not be inherit;
	 * */
	
	final String car_name = "Volve009";
	
	// speak method overloading.
    public final void speak() {
    	System.out.println("i am speaking");
    }
    
    public final void speak(String str) {
    	System.out.println(str+" is am speaking");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	// speak method overloading end.

}

// final class 

final class Pen{
	int price = 5;
	String name = "Win";
}

// trying to extending the Pen class which is a final class.

// class CheapPen extends Pen{} ...remarks -- to extends remove the final keyword from Pen class.















