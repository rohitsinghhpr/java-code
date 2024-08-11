package array_programs;

public class Revers_Array {
	public static void main(String[] args) {
		// int[] arr = {1,2,3,4,5,6,7,8};
		double[] arr = { 1.1, 2.2, 3.3, 4.4 };
		int counter = arr.length / 2;
		System.out.println("given array");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]->" + arr[i]);
		}
		System.out.println("---------------------");
		for (int i = 0; i < counter; i++) {
			double temp = arr[i];
			arr[i] = arr[arr.length - (i + 1)];
			arr[arr.length - (i + 1)] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]->" + arr[i]);
		}
		System.out.println("array is reversed...");
	}
}