package collection_programs;
import java.util.LinkedList;

public class LinkListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
		
		
	}

}
