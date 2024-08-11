package collections.test1;

public class MyTest extends MyList {

    public void getTest(){
        System.out.println("mytest class methods");
    }

    public static void main(String[] args) {
        MyTest t1 = new MyTest();
        // Mycollection interface methods
        t1.add();
        t1.remove();
        t1.contains();
        // Subcollection interface methods
        t1.create();
        t1.read();
        t1.update();
        t1.delete();
        // MyList class methods
        t1.getHead(); 
        // MyTest class methods
        t1.getTest();

        MyList tt = new MyTest();
        // Mycollection interface methods
        tt.add();
        tt.remove();
        tt.contains();
        // Subcollection interface methods
        tt.create();
        tt.read();
        tt.update();
        tt.delete();
        // MyList class methods
        tt.getHead(); 

        SubCollection t2 = new MyTest();
        // Mycollection interface methods
        t2.add();
        t2.remove();
        t2.contains();
        // Subcollection interface methods
        t1.create();
        t1.read();
        t1.update();
        t1.delete();

        MyCollections t3 = new MyTest();
        // Mycollection interface methods
        t3.add();
        t3.remove();
        t3.contains();

        // Subcollection interface methods
        // below methods not defined for mycollections
        // t3.create();
        // t3.read();
        // t3.update();
        // t3.delete();

        // MyList class methods 
        // t3.getHead();
        // getHead is not definded in MyCollection interface.
        // solution - type cast t2 to MyLi
    }
}
