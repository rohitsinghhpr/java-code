package array_programs;

public class ArrToMethod_RtrFromArr {

	static void passArrayToMethodAsParameter(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	static int[] returnArrayFromMethod(int a, int b, int c) {
		int[] arr = new int[3];
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		return arr;
	}

	public static void main(String[] args) {
		int[] arr2 = { 1, 2, 3, 4, 5 };
		int[] arr3 = new int[] { 44, 4, 455322, 532535, 54354, 4343, 43425, 534543 };
		ArrToMethod_RtrFromArr.passArrayToMethodAsParameter(arr2);
		ArrToMethod_RtrFromArr.passArrayToMethodAsParameter(arr3);

		int arr[] = ArrToMethod_RtrFromArr.returnArrayFromMethod(1, 2, 3);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println(arr.getClass().getSuperclass());

	}

}
