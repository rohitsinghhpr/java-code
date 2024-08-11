package patterns_programs;

public class HalfPyramidRotate180Deg {
   public static void main(String args[]) {
      int rows = 5;
      // outer loop for rows
      for(int i=1;i<=rows;i++){
         // inner loop for space
         // space = rows-i
         for(int j=1;j<=rows-i;j++){
            System.out.print(" ");
         }
         // 2nd inner loop for *
         // * = i
         for(int k=1;k<=i;k++){
            System.out.print("*");
         }
         System.out.print("\n");
      }
   }
}
