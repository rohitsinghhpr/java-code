package array_programs;

public class Min_Array_Ele {
	static void min_ele(int arr[]) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min >= arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("the min element in given array is " + min);
	}

	public static void main(String[] args) {
		int[] arr1 = { 55, 0, 54, 545, 5, 5, -5 };
		min_ele(arr1);
	}
}