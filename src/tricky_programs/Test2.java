package tricky_programs;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str1 = "Rohit";
        String str2 = str1;
        
        System.out.println("str1 -> "+str1);
        System.out.println("str2 -> "+str2);
       
        System.out.println("after the str2 updation");
        str2 = "Rohit Singh";
        
        System.out.println("str1 -> "+str1);
        System.out.println("str2 -> "+str2);
        
        // array
        int arr1[] = {1,2,3};
        int arr2[] = arr1;
        
        System.out.println("arr1 -> "+Arrays.toString(arr1));
        System.out.println("arr2 -> "+Arrays.toString(arr2));
        
        System.out.println("after the arr2 updation");
        arr2[1] = 50;
        
        System.out.println("arr1 -> "+Arrays.toString(arr1));
        System.out.println("arr2 -> "+Arrays.toString(arr2));
	}

}

/** Object data type although two copies will be created they both will point to the same variable in the heap, hence changes made to any variable will reflect the change in both the variables */
