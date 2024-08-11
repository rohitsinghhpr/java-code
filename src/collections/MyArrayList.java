package collections;

import java.util.ArrayList;
import java.util.Collections;

// non-syncronized 
public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>  mylist = new ArrayList<Integer>();
        mylist.add(1);
        mylist.add(2);
        mylist.add(3);
        mylist.add(4);
        mylist.add(5); // at the end.
        mylist.add(1,22);
        for(int i=0;i<mylist.size();i++){
            System.out.println(mylist.get(i));
        }
        System.out.println(mylist); // as it as list
        Collections.sort(mylist);
        System.out.println(mylist); // sorted list 
        Collections.sort(mylist,Collections.reverseOrder());
        System.out.println(mylist); // print revese
    }
}
