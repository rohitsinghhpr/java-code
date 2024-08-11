package tricky_programs;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a = 10;
        a = a-- - --a;
        /*
         * 10   - // a become 9 here and 9-1 = 8 and 10-8 = 2
         * 10 - 8
         * 2 
        */
        System.out.println(a);
	}

}
