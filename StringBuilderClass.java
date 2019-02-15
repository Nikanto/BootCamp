package w2d4.examples;

import java.util.Scanner;



public class StringBuilderClass {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        //System.out.println("Enter your name:");
        //StringBuilder s1 = new StringBuilder(input.next());
        //System.out.println(s1);
        StringBuilder s1 = new StringBuilder();
        System.out.println(s1);
        int cap = s1.capacity();
        int length = s1.length();
        System.out.println(cap);
        System.out.println(length);
        s1.append("hello");
        length = s1.length();
        cap = s1.capacity();
        s1.append("this is something that i added");
        length = s1.length();
        cap = s1.capacity();
        System.out.println(cap);
        System.out.println(length);
        
    }
    
}
