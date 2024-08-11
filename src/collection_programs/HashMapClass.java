package collection_programs;

import java.util.HashMap;

public class HashMapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> student_records = new HashMap<String, String>();
		
	    student_records.put("roll-no-1","rohit");
	    student_records.put("roll-no-2","mohit");
	    student_records.put("roll-no-3","sohit");
	    student_records.put("roll-no-4","sumit");
	    student_records.put("roll-no-5","mohan");
	    student_records.put("roll-no-6","sohan");
	    
	    System.out.println(student_records.get("roll-no-1"));
	    System.out.println(student_records.get("roll-no-2"));
	    System.out.println(student_records.get("roll-no-1"));
	    System.out.println(student_records.get("roll-no-4"));
	    System.out.println(student_records.get("roll-no-5"));
	    System.out.println(student_records.get("roll-no-6"));
	   
	}

}
