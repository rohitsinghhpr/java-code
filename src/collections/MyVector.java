package collections;

import java.util.Vector;

public class MyVector{
    public static void main(String[] args) {
        // Vector implements a dynamic array that means it can grow or shrink as required
        Vector<Integer> myVector = new Vector<Integer>();
        myVector.add(5);
        myVector.add(6);
        myVector.add(55);
        myVector.add(66);

        myVector.set(0, 500);

        System.out.println(myVector.get(0));

    }
}