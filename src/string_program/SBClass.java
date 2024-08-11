package string_program;

public class SBClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer str = new StringBuffer("this");
		
		System.out.println(str.capacity());
		str.append(" ");
		str.append("is");
		str.append(" ");
		str.append("a");
		str.append(" ");
		str.append("class");
		System.out.println(str);
		System.out.println(str.capacity());
		
		str.insert(10,"the ");
		System.out.println(str);
	}

}
