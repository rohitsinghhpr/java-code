package patterns_programs;

public class HalfPyramidWithNumber {
   public static void main(String args[]){
      int r = 5;//rows
      for(int i=1;i<=r;i++){
         for(int j=1;j<=i;j++){
            System.out.print(j);
         }
         System.out.print("\n");
      }
   }
}
