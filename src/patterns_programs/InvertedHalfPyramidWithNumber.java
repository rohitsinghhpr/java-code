package patterns_programs;

public class InvertedHalfPyramidWithNumber {
   public static void main(String args[]){
      int rows = 5;
      for(int i=rows;i>=1;i--){
         for(int j=i;j>=1;j--){
            System.out.print((i+1)-j);
         }
         System.out.print("\n");
      }
   }
}
