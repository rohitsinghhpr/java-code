package programs;

public class AbstractTest {
   public static void main(String[] args) {
    abstract class P{
        abstract public void m1();
        abstract public void m2();
    }
    class C extends P{
        public void m1(){
            System.out.println("m1 in child class.");
        }
        public void m2(){
            System.out.println("m2 in child class.");
        }
    }
    C c1 = new C();
    c1.m1();
   } 
}
