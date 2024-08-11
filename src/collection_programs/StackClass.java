package collection_programs;
import java.util.Stack;

public class StackClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> mystack = new Stack<String>();
		mystack.push("book 1 - hindi");
		mystack.push("book 2 - english");
		mystack.push("book 3 - mathe");
		mystack.push("book 4 - art ");
		mystack.push("book 5 - computer");
		
		while(mystack.size()>0) {
			System.out.println("top book is "+mystack.peek());
			mystack.pop();
		}
		System.out.println(mystack.isEmpty());
		
	}

}
