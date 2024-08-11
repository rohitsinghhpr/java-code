package programs;

import java.util.Arrays;
public class Ref {
    
 int[] a = {10,20,30,40,50};
 int[] b = a;

 void initialValue(){
    System.out.println("Intial values");
    System.out.println(Arrays.toString(this.a));
    System.out.println(Arrays.toString(this.b));
 }
 void modifiedValue(){
    this.b[0] = 11;
    System.out.println("modified values");
    System.out.println(Arrays.toString(this.a));
    System.out.println(Arrays.toString(this.b));
 }

 public static void main(String[] args) {
    Ref ref1 = new Ref();
    ref1.initialValue();
    ref1.modifiedValue();
 }    
 
}
