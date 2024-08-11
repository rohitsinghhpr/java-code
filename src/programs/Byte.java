package programs;

public class Byte {
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 127;
        byte b3 = -128;
        // byte b4 = 128; // error: possible lossy conversion from int to byte
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        // System.out.println(b4);
    }
}
