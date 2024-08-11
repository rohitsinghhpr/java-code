package string_program;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String st1 = new String("this");
		System.out.println(st1);
		String st2 = new String("this");
		System.out.println(st1);
		
		Rohit r1 = new Rohit();
		System.out.println(r1.str1);
		r1.str1.concat("singh");
		System.out.println(r1.str1);
		r1.str1 = "Rohit Singh";
		System.out.println(r1.str1);
		r1.str1 = r1.str1.concat("shrarma");
		System.out.println(r1.str1);
		
		// ref
		
		String s1 = "Ref";
		String s2 = "Ref";
		String s3 = "Ref";
		String s4 = "Ref";
		
		System.out.println("s1 -> "+s1);
		System.out.println("s2 -> "+s2);
		System.out.println("s3 -> "+s3);
		System.out.println("s4 -> "+s4);
		
		s4 = "REF";
		
		System.out.println("s1 -> "+s1);
		System.out.println("s2 -> "+s2);
		System.out.println("s3 -> "+s3);
		System.out.println("s4 -> "+s4);
	}

}

class Rohit{
	String str1 = "Rohit";
}
