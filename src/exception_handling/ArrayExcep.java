package exception_handling;

public class ArrayExcep {
	
	static int[] arr = {1,2,3,4,5};
	
	static void printArray(int[] arr_a) {
		try {
			for(int i=0;i<arr_a.length;i++) {
				System.out.println(arr_a[i+1]);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printArray(arr);
	}

}
