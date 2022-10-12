package org.example;

public class MainN_Constructors {
    int x;
    public MainN_Constructors(int y) {
        x=y;
    }

    public static void main(String[] args) {
        MainN_Constructors mainN_constructors = new MainN_Constructors(10);
        System.out.println(mainN_constructors.x);
    }
}
