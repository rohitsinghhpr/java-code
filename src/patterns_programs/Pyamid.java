package patterns_programs;

public class Pyamid {
   public static void main(String atgs[]){
      int n=5;
      for(int i=1;i<=5;i++){
         //space = n-1;
         for(int j=1;j<=n-i;j++){
            System.out.print(" ");
         }
         for(int k=1;k<=i;k++){
            System.out.print(i);
            System.out.print(" ");
         }
         System.out.print("\n");
      }
      System.out.println("----------");
      for(int i=1;i<=5;i++){
         //space = n-1;
         for(int j=1;j<=n-i;j++){
            System.out.print(" ");
         }
         for(int k=1;k<=i;k++){
            System.out.print(i);
            System.out.print(" ");
         }
         System.out.print("\n");
      }
      for(int i=n;i>=1;i--){
         //space = n-1;
         for(int j=1;j<=n-i;j++){
            System.out.print(" ");
         }
         for(int k=1;k<=i;k++){
            System.out.print(i);
            System.out.print(" ");
         }
         System.out.print("\n");
      }
      System.out.println("----------");
      for(int i=1;i<=5;i++){
         //space = n-1;
         for(int j=1;j<=n-i;j++){
            System.out.print(" ");
         }
         for(int k=1;k<=i;k++){
            System.out.print("*");
            System.out.print(" ");
         }
         System.out.print("\n");
      }
      System.out.println("----------");
      for(int i=1;i<=5;i++){
         //space = n-1;
         for(int j=1;j<=n-i;j++){
            System.out.print(" ");
         }
         for(int k=1;k<=i;k++){
            System.out.print("*");
            System.out.print(" ");
         }
         System.out.print("\n");
      }
      for(int i=n;i>=1;i--){
         //space = n-1;
         for(int j=1;j<=n-i;j++){
            System.out.print(" ");
         }
         for(int k=1;k<=i;k++){
            System.out.print("*");
            System.out.print(" ");
         }
         System.out.print("\n");
      }
   }
}
