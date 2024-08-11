package patterns_programs;

public class Patterns {
   public static void main(String args[]) {
      /*
       1
       2 3
       4 5 6
       7 8 9 10
       11 12 13 14 15
      */
      {
         int n = 5;
         int num = 1;
         for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
               System.out.print(num);
               num++;
            }
            System.out.print("\n");
         }
      }
      System.out.println("----------------------------------");
      /*
       1
       0 1
       1 0 1
       0 1 0 1
       1 0 1 0 1
       0 1 0 1 0 1
      */
      {
         int n = 5;
         for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
               int sum = i+j;
               if(sum%2 == 0){
                  System.out.print("1");
               }
               else{
                  System.out.print("0");
               }
            }
            System.out.print("\n");
         }
      }
   }
}
