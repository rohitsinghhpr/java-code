package array_programs;

public class PassBYRef {
	
	static int[] modifyArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i] = 5*(arr[i]+1);
		}
		return arr;
	}
	
	static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] table = {1,2,3,4,5}; // array 
        printArray(table);
        modifyArray(table);
        printArray(table);
 	}

}
