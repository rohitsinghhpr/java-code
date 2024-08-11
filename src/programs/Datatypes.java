package programs;

/*
 @ Note:- 
 Local variables are slightly different; the compiler never assigns a default value to an uninitialized local variable. If you cannot initialize your local variable where it is declared, make sure to assign it a value before you attempt to use it. Accessing an uninitialized local variable will result in a compile-time error.
 ----------------------------------------------------------------
 There are three distinct types of variables:
 1. static variables - within class;
 2. member variables - within object
 3. local variables - having scope limited to a function or block of code
*/

public class Datatypes {

    public static void main(String[] args) {
        PrimitiveDataTypes obj = new PrimitiveDataTypes();
        obj.printDefaultValue();
        NonPrimitiveDataType obj2 = new NonPrimitiveDataType();
        obj2.printDefaultValue();
    }
}

/*
 * The main difference between primitive and non-primitive data types are:
 * Primitive types are predefined (already defined) in Java.
 * Non-primitive types are created by the programmer and is not defined by Java
 * (except for String).
 * Non-primitive types can be used to call methods to perform certain
 * operations, while primitive types cannot.
 * A primitive type has always a value, while non-primitive types can be null.
 * A primitive type starts with a lowercase letter, while non-primitive types
 * starts with an uppercase letter.
 ----------------------------------
 The Reference Data Types will contain a memory address of variable values because the reference types won’t store the variable value directly in memory. They are strings, objects, arrays, etc. 
 */

class PrimitiveDataTypes {
    /*
     * 1. boolean - 1 byte
     * 2. byte - 2 byte
     * 3. short - 2 byte
     * 4. char - 2 bute
     * 5. int - 4 byte
     * 6. long - 8 byte
     * 7. float - 8 byte
     * 8. double - 8 byte
     */
    // Q: how to calculate value range of data type? -- in my mind.
    boolean v1;
    byte v2;
    short v3;
    char v4;
    int v5;
    long v6;
    float v7;
    double v8;

    void printDefaultValue() {
        // checking default value.
        System.out.println("boolean " + this.v1);
        System.out.println("byte " + this.v2);
        System.out.println("short " + this.v3);
        System.out.println("char " + this.v4); // u0000 (null)
        /*
         * Q: Why is the Size of char 2 bytes in Java?
         * A: So, other languages like C/C++ use only ASCII characters, and to represent
         * all ASCII characters 8 bits is enough. But java uses the Unicode system not
         * the ASCII code system and to represent the Unicode system 8 bits is not
         * enough to represent all characters so java uses 2 bytes for characters.
         */
        System.out.println("int " + this.v5);
        System.out.println("long " + this.v6);
        System.out.println("float " + this.v7);
        System.out.println("double " + this.v8);
    }
}

class NonPrimitiveDataType{
    String str1;
    void printDefaultValue(){
        System.out.println("String "+this.str1); //  null - as per the note.
    }

}