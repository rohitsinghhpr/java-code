package string_program;

import java.util.Scanner;

public class ReverseLine {

	public static void reversString(String str) {
		for(int i=str.length();i>0;i--) {
			System.out.print(str.charAt(i-1));
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		
		System.out.println("you entered -> "+line);
		
		String str_arr[] = line.split(" ");
		
		System.out.println("after reverse the line");
		
		for(int i=0;i<str_arr.length;i++) {
			reversString(str_arr[i]);
			System.out.print(" ");
		}
		
		sc.close();
		
	}

}
