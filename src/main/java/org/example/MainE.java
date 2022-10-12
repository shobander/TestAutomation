package org.example;

public class MainE {
    public int max(int x, int y){
        if(x > y)
            return x;
        else
            return y;
    }

    public int additionMethod(int x, int y){
        return (x+y);
    }
    private int subtractionMethod(int x, int y){
        return (x-y);
    }
    private int divisionMethod(int x, int y){
        return (x/y);
    }
    private int multiplicationMethod(int x, int y){
        return (x*y);
    }

    public static void main(String[] args) {
        MainE mainE = new MainE(); //creating an object
        System.out.println(mainE.max(100, 200));
        System.out.println(mainE.additionMethod(68, 20));
        System.out.println(mainE.multiplicationMethod(12, 12));
        System.out.println(mainE.subtractionMethod(1, 99));
        System.out.println(mainE.divisionMethod(1, 2));
    }
}
