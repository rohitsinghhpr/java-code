package patterns_programs;

public class ButterFlyPattern {
   public static void main(String args[]){
      int n=10;
      // 1st half pattern
      for(int i=1;i<=n;i++){
         // 1st inner loop for *
         // * = i
         for(int j=1;j<=i;j++){
            System.out.print("*");
         }
         // 2nd inner loop for spaces;
         int spaces = 2*(n-i);
         for(int k=1;k<=spaces;k++){
            System.out.print(" ");
         }
         // 3rd inner loop for end *
         for(int ijk=1;ijk<=i;ijk++){
            System.out.print("*");
         }
         System.out.print("\n");
      }
      //  inverted for 2nd half pattern
      for(int i=n;i>=1;i--){
         for(int j=1;j<=i;j++){
            System.out.print("*");
         }
         int spaces = 2*(n-i);
         for(int k=1;k<=spaces;k++){
            System.out.print(" ");
         }
         for(int ijk=1;ijk<=i;ijk++){
            System.out.print("*");
         }
         System.out.print("\n");
      }
   }
}
