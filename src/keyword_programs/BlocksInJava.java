package keyword_programs;

public class BlocksInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KeyBlock kb1 = new KeyBlock();
	}

}

class KeyBlock {
	int a;
	int b;
	// initialization block
	{
		a = 5;
		b = 6;
		System.out.println("is it invoked before contructor");
	    System.out.println("a = "+a+" b "+b);

	}

	KeyBlock() {
		System.out.println("class contructor");
		a = 50;
		b = 60;
		System.out.println("a = "+a+" b "+b);
	}

}