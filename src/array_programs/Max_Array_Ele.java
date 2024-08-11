package array_programs;

public class Max_Array_Ele {
	static void max_ele(int arr[]) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max <= arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("the max element in given is " + max);
	}

	public static void main(String[] args) {
		int[] arr1 = { 8, 7, 3, 5, 1 };
		max_ele(arr1);
		int[] arr2 = { 1, 8, 9, 11, 13, -2344, 44, 45, 55 };
		max_ele(arr2);
	}
}