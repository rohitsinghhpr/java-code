package patterns_programs;

public class HoloRectangle {
   public static void main(String args[]){
      int m = 9; // row 
      int n = 18; // col

      // outer loop for rows
      for(int i=1;i<=m;i++){
         // inner loop for columns
         for(int j=1;j<=n;j++){
            //cell(i,j)
            if(i==1||j==1||i==m||j==n){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
         }
         System.out.print("\n");
      }


   }
}
