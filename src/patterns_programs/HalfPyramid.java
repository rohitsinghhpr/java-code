package patterns_programs;

public class HalfPyramid {
   public static void main(String args[]){
      int rows = 5;
      // outer loop for rows
      for(int i=1;i<=rows;i++){
         // inner loop for columns
         for(int j=1;j<=i;j++){
            System.out.print("*");
         }
         System.out.print("\n"); 
      }
   }
}
