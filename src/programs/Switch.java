package programs;

public class Switch {
 public static void main(String[] args) {
    // byte x = 1;
    // switch (x+1) {
    //     case 10:
    //         System.out.println(10);
    //         break;
    //     case 100:
    //         System.out.println(100);
    //         break;
    //     case 1000:
    //         System.out.println(1000);
    //         break;
    //     default:
    //         System.out.println("used x + 1");
    //         break;
    // }
    int x = 3;
    switch (x) {
        default:
            System.out.println("def");
            break;
        case 0:
            System.out.println(0);
        case 1:
            System.out.println(1);
            break;
        case 2:
            System.out.println(2);
            break;
    }
 }   
}

//  order matter or not.