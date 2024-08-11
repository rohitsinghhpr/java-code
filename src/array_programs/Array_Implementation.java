package array_programs;

import java.util.Random;


public class Array_Implementation {
	 public static void main(String[] args) {

	   // first way
	   int[] arr = new int[]{1,2,3,4,5,6,7,8,9};

	   for(int i=0;i<arr.length;i++){
	      System.out.println(arr[i]);
	   }

	   System.out.println("------------");

	   // second way 

	   int[] arr2;
	   arr2 = new int[10];

	   for (int i = 0; i < arr2.length; i++) {
	      arr2[i] = (i+1)*2;
	   }
	   for (int i = 0; i < arr2.length; i++) {
	      System.out.println(arr2[i]);
	   }

	   System.out.println("------------");

	   // third way

	   int arr3[] = new int[10];

	   for (int i = 0; i < arr3.length; i++) {
	      arr3[i] = (i+1)*3;
	   }
	   for (int i = 0; i < arr3.length; i++) {
	      System.out.println(arr3[i]);
	   }

	   System.out.println("------------");
	   
	   // array with random value

	   Random r = new Random();
	   int[] arr4 = new int[20];

	   for(int i=0;i<arr4.length;i++){
	      arr4[i] = r.nextInt(30);
	      System.out.println(arr4[i]);
	   }

	 }  
	}