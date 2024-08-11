package collections.test1;

public class MyList implements SubCollection{

    public void getHead(){
        System.out.println("list getHead method");
    }

    @Override
    public void add() {
        System.out.println("list add");
    }

    @Override
    public void remove() {
        System.out.println("list remove");
    }

    @Override
    public void contains() {
        System.out.println("list contains");
    }

    @Override
    public void create() {
        System.out.println("list create");
    }

    @Override
    public void read() {
        System.out.println("list read");
    }

    @Override
    public void update() {
        System.out.println("list update");
    }

    @Override
    public void delete() {
        System.out.println("list delete");
    }
    
}
