package org.example;

public class MainBB_LogicalOperators {
    public static void main(String[] args) {
        int a = 20;
        System.out.println(a<30 && a<10);

        int b = 5;
        System.out.println(b>5 || b>4);

        int c = 20;
        System.out.println(!(c>21 && c<15));
    }
}
