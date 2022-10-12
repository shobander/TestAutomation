package org.example;

public class MultiplesOf3and5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int mul3 = i % 3;
            int mul5 = i % 5;
            if (mul3 == 0 && mul5 == 0){
                System.out.println("Multiple of three and five");
            } else if (mul3 == 0) {
                System.out.println("Multiple of three");
            } else if (mul5 == 0) {
                System.out.println("Multiple of five");
            }  else {
                System.out.println(i);
            }
        }
    }
}