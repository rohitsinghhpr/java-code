package string_program;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Rabbit";
		
		char str_arr[] = str.toCharArray();
		
		for(char i:str_arr) {
			System.out.println(i);
		}
		
		String str1 = new String(str_arr);
		System.out.println(str1);
		
	}

}
