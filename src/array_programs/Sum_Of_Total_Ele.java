package array_programs;

public class Sum_Of_Total_Ele {
	public static void main(String args[]) {
		int[] arr = { 1, 1, 1, 1, 1 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);
	}
}