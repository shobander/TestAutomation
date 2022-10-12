package org.example;

public class MainK_WhileLoop {
    public static void main(String[] args) {
        // While loop to print out 10 to 30

        int a = 10;
        while(a<31){
            System.out.println(a);
            a++;
        }

        int b = 20;
        while (b>10){
            System.out.println(b);
            b--;
        }

        //do while loop
        int c = 10;
        do {
            System.out.println(c);
            c++;
        }
        while(c<26);
    }
}
