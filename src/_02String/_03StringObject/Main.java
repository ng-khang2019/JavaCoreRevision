package _02String._03StringObject;

public class Main {
    public static void main(String[] args) {

        // Create a String object



        /*
            String Pool and String interning
            String interning is a mechanism used to store only
            one copy of each distinct string value in the String Pool
         */

        // s1 is a literal, automatically added to the String Pool
        String s1 = "Hello";
        // s2 is created with 'new', which forces a new object in the Heap
        String s2 = new String("Hello");
        // s3 calls intern() on s2. It finds "Hello" in the pool and returns s1's reference.
        String s3 = s2.intern();
        System.out.println(s1 == s2); // false (different memory locations: Pool vs. Heap)
        System.out.println(s1 == s3); // true (both refer to the same object in the Pool)
    }
}
