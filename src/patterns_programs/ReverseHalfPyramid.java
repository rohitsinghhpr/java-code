package patterns_programs;

public class ReverseHalfPyramid {
   public static void main(String args[]){
      int rows = 5;
      // outer loop for rows
      for(int i=rows;i>=1;i--){
         // inner loop for columns
         for(int j=i;j>=1;j--){
            System.out.print("*");
         }
         System.out.print("\n"); 
      }
   }
}
