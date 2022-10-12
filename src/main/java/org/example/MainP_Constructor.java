package org.example;

public class MainP_Constructor {
    int modelYear;
    String modelName;
    public MainP_Constructor(int year, String name){
        modelName = name;
        modelYear =year;
    }

    public static void main(String[] args) {
        MainP_Constructor mainP_constructor = new MainP_Constructor(2023, "BMW");
        System.out.println(mainP_constructor.modelName);
    }
}
