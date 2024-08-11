package type_casting;

public class WideTypeCasting {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		// wide type casting - implicit or up.
		// converting lower to larger.
		byte b1 = 123;
		int i1 = b1;
		
		System.out.println(b1);
		System.out.println(i1);
		
		// narrow type casting - explicit pr up.
		// converting larger to lower.
		
		long l1 = 989721934683l;
		int i2 = (int) l1;
		
		
		System.out.println(l1);
		System.out.println(i2);
		
		
		
	}

}
